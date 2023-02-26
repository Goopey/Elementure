
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.elementure.procedures.OctolankrndRotationProcedure;
import net.mcreator.elementure.procedures.OctolankFloatProcedure;
import net.mcreator.elementure.procedures.NetherstaroutskirtsLavaSpawningProcedure;
import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEntities;

import javax.annotation.Nullable;

public class OctolankEntity extends PathfinderMob {
	public OctolankEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.OCTOLANK.get(), world);
	}

	public OctolankEntity(EntityType<OctolankEntity> type, Level world) {
		super(type, world);
		xpReward = 25;
		setNoAi(false);
		this.noCulling = true;
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (OctolankEntity.this.isInWater())
					OctolankEntity.this.setDeltaMovement(OctolankEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !OctolankEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - OctolankEntity.this.getX();
					double dy = this.wantedY - OctolankEntity.this.getY();
					double dz = this.wantedZ - OctolankEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * OctolankEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					OctolankEntity.this.setYRot(this.rotlerp(OctolankEntity.this.getYRot(), f, 10));
					OctolankEntity.this.yBodyRot = OctolankEntity.this.getYRot();
					OctolankEntity.this.yHeadRot = OctolankEntity.this.getYRot();
					if (OctolankEntity.this.isInWater()) {
						OctolankEntity.this.setSpeed((float) OctolankEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						OctolankEntity.this.setXRot(this.rotlerp(OctolankEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(OctolankEntity.this.getXRot() * (float) (Math.PI / 180.0));
						OctolankEntity.this.setZza(f3 * f1);
						OctolankEntity.this.setYya((float) (f1 * dy));
					} else {
						OctolankEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					OctolankEntity.this.setSpeed(0);
					OctolankEntity.this.setYya(0);
					OctolankEntity.this.setZza(0);
				}
			}
		};
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new WaterBoundPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(2, new RandomSwimmingGoal(this, 0.8, 40));
		this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, (float) 12));
		this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 12));
	}

	@Override
	public MobType getMobType() {
		return MobType.WATER;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(ElementureModItems.OCTOLANKTENTACLE.get()));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason,
			@Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		OctolankrndRotationProcedure.execute(this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		OctolankFloatProcedure.execute(this);
	}

	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	@Override
	public boolean checkSpawnObstruction(LevelReader world) {
		return world.isUnobstructed(this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static void init() {
		SpawnPlacements.register(ElementureModEntities.OCTOLANK.get(), SpawnPlacements.Type.NO_RESTRICTIONS,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
					int x = pos.getX();
					int y = pos.getY();
					int z = pos.getZ();
					return NetherstaroutskirtsLavaSpawningProcedure.execute(world, x, y, z);
				});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 50);
		builder = builder.add(Attributes.ARMOR, 2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.3);
		return builder;
	}
}

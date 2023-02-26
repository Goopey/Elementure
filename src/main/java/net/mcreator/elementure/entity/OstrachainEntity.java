
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
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.elementure.procedures.OstrachainWiggleProcedure;
import net.mcreator.elementure.procedures.OstrachainSpawnProcedure;
import net.mcreator.elementure.procedures.DiverscrownTunnelSpawningProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

import javax.annotation.Nullable;

public class OstrachainEntity extends PathfinderMob {
	public OstrachainEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.OSTRACHAIN.get(), world);
	}

	public OstrachainEntity(EntityType<OstrachainEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (OstrachainEntity.this.isInWater())
					OstrachainEntity.this.setDeltaMovement(OstrachainEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !OstrachainEntity.this.getNavigation().isDone() && Math.random() < 0.25) {
					double dx = this.wantedX - OstrachainEntity.this.getX();
					double dy = this.wantedY - OstrachainEntity.this.getY();
					double dz = this.wantedZ - OstrachainEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * OstrachainEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					OstrachainEntity.this.setYRot(this.rotlerp(OstrachainEntity.this.getYRot(), f, 10));
					OstrachainEntity.this.yBodyRot = OstrachainEntity.this.getYRot();
					OstrachainEntity.this.yHeadRot = OstrachainEntity.this.getYRot();
					if (OstrachainEntity.this.isInWater()) {
						OstrachainEntity.this.setSpeed((float) OstrachainEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						OstrachainEntity.this.setXRot(this.rotlerp(OstrachainEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(OstrachainEntity.this.getXRot() * (float) (Math.PI / 180.0));
						OstrachainEntity.this.setZza(f3 * f1);
						OstrachainEntity.this.setYya((float) (f1 * dy));
					} else {
						OstrachainEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					OstrachainEntity.this.setSpeed(0);
					OstrachainEntity.this.setYya(0);
					OstrachainEntity.this.setZza(0);
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
		this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 1, 40));
	}

	@Override
	public MobType getMobType() {
		return MobType.WATER;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.honey_block.step"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.honey_block.break"));
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason,
			@Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		OstrachainSpawnProcedure.execute(world, this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		OstrachainWiggleProcedure.execute(this);
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
		SpawnPlacements.register(ElementureModEntities.OSTRACHAIN.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> {
					int x = pos.getX();
					int y = pos.getY();
					int z = pos.getZ();
					return DiverscrownTunnelSpawningProcedure.execute(world, x, y, z);
				});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 1.6);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 1.6);
		return builder;
	}
}

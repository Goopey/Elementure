
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.elementure.procedures.JellybiomeSpawnConditionProcedure;
import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEntities;

public class BluejellyfloatEntity extends PathfinderMob {
	public BluejellyfloatEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.BLUEJELLYFLOAT.get(), world);
	}

	public BluejellyfloatEntity(EntityType<BluejellyfloatEntity> type, Level world) {
		super(type, world);
		xpReward = 7;
		setNoAi(false);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (BluejellyfloatEntity.this.isInWater())
					BluejellyfloatEntity.this.setDeltaMovement(BluejellyfloatEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !BluejellyfloatEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - BluejellyfloatEntity.this.getX();
					double dy = this.wantedY - BluejellyfloatEntity.this.getY();
					double dz = this.wantedZ - BluejellyfloatEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * BluejellyfloatEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					BluejellyfloatEntity.this.setYRot(this.rotlerp(BluejellyfloatEntity.this.getYRot(), f, 10));
					BluejellyfloatEntity.this.yBodyRot = BluejellyfloatEntity.this.getYRot();
					BluejellyfloatEntity.this.yHeadRot = BluejellyfloatEntity.this.getYRot();
					if (BluejellyfloatEntity.this.isInWater()) {
						BluejellyfloatEntity.this.setSpeed((float) BluejellyfloatEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						BluejellyfloatEntity.this.setXRot(this.rotlerp(BluejellyfloatEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(BluejellyfloatEntity.this.getXRot() * (float) (Math.PI / 180.0));
						BluejellyfloatEntity.this.setZza(f3 * f1);
						BluejellyfloatEntity.this.setYya((float) (f1 * dy));
					} else {
						BluejellyfloatEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					BluejellyfloatEntity.this.setSpeed(0);
					BluejellyfloatEntity.this.setYya(0);
					BluejellyfloatEntity.this.setZza(0);
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
		this.goalSelector.addGoal(2, new RandomSwimmingGoal(this, 1, 40));
		this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(ElementureModItems.BLUEJELLY.get()));
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
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		return super.hurt(source, amount);
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
		SpawnPlacements.register(ElementureModEntities.BLUEJELLYFLOAT.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return JellybiomeSpawnConditionProcedure.execute(world, x, y, z);
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.19999999999999998);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 8);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.6);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.19999999999999998);
		return builder;
	}
}


package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.elementure.procedures.UmbrasylsegmentFollowProcedure;
import net.mcreator.elementure.procedures.UmbrasylSegmentDamageBarProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

public class UmbrasylSegmentEntity extends Monster {
	private ResourceLocation layer = new ResourceLocation("elementure:textures/entities/umbrasyl_segment_texturemap.png");
	private boolean phaseTwo = false;

	public UmbrasylSegmentEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.UMBRASYL_SEGMENT.get(), world);
	}

	public UmbrasylSegmentEntity(EntityType<UmbrasylSegmentEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (UmbrasylSegmentEntity.this.isInWater())
					UmbrasylSegmentEntity.this.setDeltaMovement(UmbrasylSegmentEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !UmbrasylSegmentEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - UmbrasylSegmentEntity.this.getX();
					double dy = this.wantedY - UmbrasylSegmentEntity.this.getY();
					double dz = this.wantedZ - UmbrasylSegmentEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * UmbrasylSegmentEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					UmbrasylSegmentEntity.this.setYRot(this.rotlerp(UmbrasylSegmentEntity.this.getYRot(), f, 10));
					UmbrasylSegmentEntity.this.yBodyRot = UmbrasylSegmentEntity.this.getYRot();
					UmbrasylSegmentEntity.this.yHeadRot = UmbrasylSegmentEntity.this.getYRot();
					if (UmbrasylSegmentEntity.this.isInWater()) {
						UmbrasylSegmentEntity.this.setSpeed((float) UmbrasylSegmentEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						UmbrasylSegmentEntity.this.setXRot(this.rotlerp(UmbrasylSegmentEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(UmbrasylSegmentEntity.this.getXRot() * (float) (Math.PI / 180.0));
						UmbrasylSegmentEntity.this.setZza(f3 * f1);
						UmbrasylSegmentEntity.this.setYya((float) (f1 * dy));
					} else {
						UmbrasylSegmentEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					UmbrasylSegmentEntity.this.setSpeed(0);
					UmbrasylSegmentEntity.this.setYya(0);
					UmbrasylSegmentEntity.this.setZza(0);
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
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, true, true));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, true));
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
	}

	public void setLayer() {
		this.layer = new ResourceLocation("elementure:textures/umbrasyl_segment_2_texturemap.png");
		this.phaseTwo = true;
	}

	public boolean isPhase2() {
		return phaseTwo;
	}

	public ResourceLocation getLayer() {
		return this.layer;
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.honey_block.hit"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		UmbrasylSegmentDamageBarProcedure.execute(this.level, this);
		if (source.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source == DamageSource.IN_WALL)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		UmbrasylsegmentFollowProcedure.execute(this.level, this);
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

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity entityIn) {
	}

	@Override
	protected void pushEntities() {
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 1024);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1000);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0);
		return builder;
	}
}

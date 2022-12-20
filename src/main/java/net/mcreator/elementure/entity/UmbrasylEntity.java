
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
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
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.elementure.procedures.UmbrasylSpawnProcedure;
import net.mcreator.elementure.procedures.UmbrasylDropsProcedure;
import net.mcreator.elementure.procedures.UmbrasylDespawnProcedure;
import net.mcreator.elementure.procedures.UmbrasylAttackMasterProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

import javax.annotation.Nullable;

public class UmbrasylEntity extends Monster {
	private ResourceLocation layer = new ResourceLocation("elementure:textures/entities/umbrasyl_texturemap.png");
	private boolean phaseTwo = false;
	private final ServerBossEvent bossInfo = new ServerBossEvent(this.getDisplayName(), ServerBossEvent.BossBarColor.PURPLE,
			ServerBossEvent.BossBarOverlay.NOTCHED_6);

	public UmbrasylEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.UMBRASYL.get(), world);
	}

	public UmbrasylEntity(EntityType<UmbrasylEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		setPersistenceRequired();
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (UmbrasylEntity.this.isInWater())
					UmbrasylEntity.this.setDeltaMovement(UmbrasylEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !UmbrasylEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - UmbrasylEntity.this.getX();
					double dy = this.wantedY - UmbrasylEntity.this.getY();
					double dz = this.wantedZ - UmbrasylEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * UmbrasylEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					UmbrasylEntity.this.setYRot(this.rotlerp(UmbrasylEntity.this.getYRot(), f, 10));
					UmbrasylEntity.this.yBodyRot = UmbrasylEntity.this.getYRot();
					UmbrasylEntity.this.yHeadRot = UmbrasylEntity.this.getYRot();
					if (UmbrasylEntity.this.isInWater()) {
						UmbrasylEntity.this.setSpeed((float) UmbrasylEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						UmbrasylEntity.this.setXRot(this.rotlerp(UmbrasylEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(UmbrasylEntity.this.getXRot() * (float) (Math.PI / 180.0));
						UmbrasylEntity.this.setZza(f3 * f1);
						UmbrasylEntity.this.setYya((float) (f1 * dy));
					} else {
						UmbrasylEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					UmbrasylEntity.this.setSpeed(0);
					UmbrasylEntity.this.setYya(0);
					UmbrasylEntity.this.setZza(0);
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
	public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
		super.awardKillScore(entity, score, damageSource);
		UmbrasylDespawnProcedure.execute(this.level, entity);
	}

	public void setLayer() {
		this.layer = new ResourceLocation("elementure:textures/umbrasyl__2_texturemap.png");
		this.phaseTwo = true;
	}

	public boolean isPhase2() {
		return phaseTwo;
	}

	public ResourceLocation getLayer() {
		return this.layer;
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		//this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, Player.class, (float) 120));
		//this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, ServerPlayer.class, (float) 120));
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (12.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ServerPlayer.class, false, false));
		this.targetSelector.addGoal(6, new HurtByTargetGoal(this));
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
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.DROWN)
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		UmbrasylDropsProcedure.execute(this.level, this, source.getEntity());
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason,
			@Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		UmbrasylSpawnProcedure.execute(world, this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		UmbrasylAttackMasterProcedure.execute(this.level, this);
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

	@Override
	public boolean canChangeDimensions() {
		return false;
	}

	@Override
	public void startSeenByPlayer(ServerPlayer player) {
		super.startSeenByPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void stopSeenByPlayer(ServerPlayer player) {
		super.stopSeenByPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	public void customServerAiStep() {
		super.customServerAiStep();
		this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 3.6);
		builder = builder.add(Attributes.MAX_HEALTH, 650);
		builder = builder.add(Attributes.ARMOR, 10);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 10);
		builder = builder.add(Attributes.FOLLOW_RANGE, 512);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 2);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 3.6);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1000);
		return builder;
	}
}

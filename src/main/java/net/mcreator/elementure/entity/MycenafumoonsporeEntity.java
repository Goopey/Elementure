
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.procedures.MycenafumoonsporeSpecialBehaviorProcedure;
import net.mcreator.elementure.procedures.MycenafumoonsporeExplodeProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

import java.util.Random;
import java.util.EnumSet;

public class MycenafumoonsporeEntity extends Monster {
	public MycenafumoonsporeEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.MYCENAFUMOONSPORE.get(), world);
	}

	public MycenafumoonsporeEntity(EntityType<MycenafumoonsporeEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.moveControl = new FlyingMoveControl(this, 10, true);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (MycenafumoonsporeEntity.this.getTarget() != null && !MycenafumoonsporeEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return MycenafumoonsporeEntity.this.getMoveControl().hasWanted() && MycenafumoonsporeEntity.this.getTarget() != null
						&& MycenafumoonsporeEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = MycenafumoonsporeEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				MycenafumoonsporeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = MycenafumoonsporeEntity.this.getTarget();
				if (MycenafumoonsporeEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					MycenafumoonsporeEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = MycenafumoonsporeEntity.this.distanceToSqr(livingentity);
					if (d0 < 16) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						MycenafumoonsporeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
					}
				}
			}
		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, false, true));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, ServerPlayer.class, false, true));
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(5, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.goalSelector.addGoal(6, new RandomStrollGoal(this, 1, 20) {
			@Override
			protected Vec3 getPosition() {
				Random random = MycenafumoonsporeEntity.this.getRandom();
				double dir_x = MycenafumoonsporeEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = MycenafumoonsporeEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = MycenafumoonsporeEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}
		});
		this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
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
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		MycenafumoonsporeExplodeProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		MycenafumoonsporeSpecialBehaviorProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public void playerTouch(Player sourceentity) {
		super.playerTouch(sourceentity);
		MycenafumoonsporeExplodeProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2);
		builder = builder.add(Attributes.MAX_HEALTH, 5);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.FLYING_SPEED, 0.2);
		return builder;
	}
}

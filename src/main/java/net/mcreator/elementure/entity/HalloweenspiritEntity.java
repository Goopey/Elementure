
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
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
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.procedures.MinoskullHalloweenProcedure;
import net.mcreator.elementure.procedures.HalloweenspiritPhasingProcedure;
import net.mcreator.elementure.procedures.HalloweenspiritDropsProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

import java.util.EnumSet;

public class HalloweenspiritEntity extends Monster {
	public HalloweenspiritEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.HALLOWEENSPIRIT.get(), world);
	}

	public HalloweenspiritEntity(EntityType<HalloweenspiritEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.noPhysics = true;
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
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.goalSelector.addGoal(2, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (HalloweenspiritEntity.this.getTarget() != null && !HalloweenspiritEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return HalloweenspiritEntity.this.getMoveControl().hasWanted() && HalloweenspiritEntity.this.getTarget() != null
						&& HalloweenspiritEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = HalloweenspiritEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				HalloweenspiritEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = HalloweenspiritEntity.this.getTarget();
				if (HalloweenspiritEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					HalloweenspiritEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = HalloweenspiritEntity.this.distanceToSqr(livingentity);
					if (d0 < 24) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						HalloweenspiritEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
					}
				}
			}
		});
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, false, true));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ServerPlayer.class, false, true));
		this.targetSelector.addGoal(5, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(6, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(7, new RandomStrollGoal(this, 0.8, 20) {
			@Override
			protected Vec3 getPosition() {
				RandomSource random = HalloweenspiritEntity.this.getRandom();
				double dir_x = HalloweenspiritEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = HalloweenspiritEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = HalloweenspiritEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}
		});
		this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(9, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		HalloweenspiritDropsProcedure.execute(this.level, this, source.getEntity());
	}

	@Override
	public void baseTick() {
		super.baseTick();
		HalloweenspiritPhasingProcedure.execute(this);
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
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;
		for (int l = 0; l < 1; ++l) {
			double x0 = x + random.nextFloat();
			double y0 = y + random.nextFloat();
			double z0 = z + random.nextFloat();
			double dx = (random.nextFloat() - 0.5D) * 0.0999999985098839D;
			double dy = (random.nextFloat() - 0.5D) * 0.0999999985098839D;
			double dz = (random.nextFloat() - 0.5D) * 0.0999999985098839D;
			world.addParticle(ParticleTypes.SOUL, x0, y0, z0, dx, dy, dz);
		}
	}

	public static void init() {
		SpawnPlacements.register(ElementureModEntities.HALLOWEENSPIRIT.get(), SpawnPlacements.Type.ON_GROUND,
				Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
					int x = pos.getX();
					int y = pos.getY();
					int z = pos.getZ();
					return MinoskullHalloweenProcedure.execute(world, x, y, z);
				});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 16);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1);
		builder = builder.add(Attributes.FLYING_SPEED, 0.3);
		return builder;
	}
}


package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.elementure.init.ElementureModEntities;

public class SirenlingEntity extends Monster {
	public SirenlingEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.SIRENLING.get(), world);
	}

	public SirenlingEntity(EntityType<SirenlingEntity> type, Level world) {
		super(type, world);
		xpReward = 10;
		setNoAi(false);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (SirenlingEntity.this.isInWater())
					SirenlingEntity.this.setDeltaMovement(SirenlingEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !SirenlingEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - SirenlingEntity.this.getX();
					double dy = this.wantedY - SirenlingEntity.this.getY();
					double dz = this.wantedZ - SirenlingEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * SirenlingEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					SirenlingEntity.this.setYRot(this.rotlerp(SirenlingEntity.this.getYRot(), f, 10));
					SirenlingEntity.this.yBodyRot = SirenlingEntity.this.getYRot();
					SirenlingEntity.this.yHeadRot = SirenlingEntity.this.getYRot();
					if (SirenlingEntity.this.isInWater()) {
						SirenlingEntity.this.setSpeed((float) SirenlingEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						SirenlingEntity.this.setXRot(this.rotlerp(SirenlingEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(SirenlingEntity.this.getXRot() * (float) (Math.PI / 180.0));
						SirenlingEntity.this.setZza(f3 * f1);
						SirenlingEntity.this.setYya((float) (f1 * dy));
					} else {
						SirenlingEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					SirenlingEntity.this.setSpeed(0);
					SirenlingEntity.this.setYya(0);
					SirenlingEntity.this.setZza(0);
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
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, true, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, false));
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(5, new RandomSwimmingGoal(this, 1, 40));
		this.goalSelector.addGoal(6, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.puffer_fish.sting"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
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
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 2.4);
		builder = builder.add(Attributes.MAX_HEALTH, 30);
		builder = builder.add(Attributes.ARMOR, 4);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 5);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 2.4);
		return builder;
	}
}

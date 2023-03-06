
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.procedures.TarspiritSpecialTargetingProcedure;
import net.mcreator.elementure.procedures.TarspiritIsOwnedProcedure;
import net.mcreator.elementure.procedures.TarspiritDespawnProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

import java.util.List;
import java.util.EnumSet;

public class TarspiritEntity extends TamableAnimal {
	public TarspiritEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.TARSPIRIT.get(), world);
	}

	public TarspiritEntity(EntityType<TarspiritEntity> type, Level world) {
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
				if (TarspiritEntity.this.getTarget() != null && !TarspiritEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return TarspiritEntity.this.getMoveControl().hasWanted() && TarspiritEntity.this.getTarget() != null && TarspiritEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = TarspiritEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				TarspiritEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.2);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = TarspiritEntity.this.getTarget();
				if (TarspiritEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					TarspiritEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = TarspiritEntity.this.distanceToSqr(livingentity);
					if (d0 < 512) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						TarspiritEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.2);
					}
				}
			}
		});
		this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, false, false) {
			@Override
			public boolean canUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canUse() && TarspiritIsOwnedProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canContinueToUse() && TarspiritIsOwnedProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ServerPlayer.class, false, false) {
			@Override
			public boolean canUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canUse() && TarspiritIsOwnedProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canContinueToUse() && TarspiritIsOwnedProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Monster.class, false, false) {
			@Override
			public boolean canUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canUse() && TarspiritSpecialTargetingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canContinueToUse() && TarspiritSpecialTargetingProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, PathfinderMob.class, false, false) {
			@Override
			public boolean canUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canUse() && TarspiritSpecialTargetingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canContinueToUse() && TarspiritSpecialTargetingProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, LivingEntity.class, false, false) {
			@Override
			public boolean canUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canUse() && TarspiritSpecialTargetingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canContinueToUse() && TarspiritSpecialTargetingProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(8, new OwnerHurtTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canUse() && TarspiritSpecialTargetingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canContinueToUse() && TarspiritSpecialTargetingProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(9, new HurtByTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canUse() && TarspiritSpecialTargetingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = TarspiritEntity.this.getX();
				double y = TarspiritEntity.this.getY();
				double z = TarspiritEntity.this.getZ();
				Entity entity = TarspiritEntity.this;
				Level world = TarspiritEntity.this.level;
				return super.canContinueToUse() && TarspiritSpecialTargetingProcedure.execute(entity);
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
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
		if (source.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		if (source == DamageSource.LIGHTNING_BOLT)
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
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
		Item item = itemstack.getItem();
		if (itemstack.getItem() instanceof SpawnEggItem) {
			retval = super.mobInteract(sourceentity, hand);
		} else if (this.level.isClientSide()) {
			retval = (this.isTame() && this.isOwnedBy(sourceentity) || this.isFood(itemstack)) ? InteractionResult.sidedSuccess(this.level.isClientSide()) : InteractionResult.PASS;
		} else {
			if (this.isTame()) {
				if (this.isOwnedBy(sourceentity)) {
					if (item.isEdible() && this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal((float) item.getFoodProperties().getNutrition());
						retval = InteractionResult.sidedSuccess(this.level.isClientSide());
					} else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
						this.usePlayerItem(sourceentity, hand, itemstack);
						this.heal(4);
						retval = InteractionResult.sidedSuccess(this.level.isClientSide());
					} else {
						retval = super.mobInteract(sourceentity, hand);
					}
				}
			} else if (this.isFood(itemstack)) {
				this.usePlayerItem(sourceentity, hand, itemstack);
				if (this.random.nextInt(3) == 0 && !net.minecraftforge.event.ForgeEventFactory.onAnimalTame(this, sourceentity)) {
					this.tame(sourceentity);
					this.level.broadcastEntityEvent(this, (byte) 7);
				} else {
					this.level.broadcastEntityEvent(this, (byte) 6);
				}
				this.setPersistenceRequired();
				retval = InteractionResult.sidedSuccess(this.level.isClientSide());
			} else {
				retval = super.mobInteract(sourceentity, hand);
				if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME)
					this.setPersistenceRequired();
			}
		}
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		TarspiritDespawnProcedure.execute(this.level, this);
	}

	@Override
	public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
		TarspiritEntity retval = ElementureModEntities.TARSPIRIT.get().create(serverWorld);
		retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
		return retval;
	}

	@Override
	public boolean isFood(ItemStack stack) {
		return List.of().contains(stack.getItem());
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
		builder = builder.add(Attributes.MOVEMENT_SPEED, 4);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.FOLLOW_RANGE, 512);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1000);
		builder = builder.add(Attributes.FLYING_SPEED, 4);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 4);
		return builder;
	}
}

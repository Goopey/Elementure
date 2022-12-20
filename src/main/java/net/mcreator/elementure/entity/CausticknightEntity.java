
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.elementure.procedures.CausticknightIsGlowingProcedure;
import net.mcreator.elementure.procedures.CausticknightDropsProcedure;
import net.mcreator.elementure.procedures.CausticknightDenyAttackProcedure;
import net.mcreator.elementure.procedures.CausticknightAttackMasterProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

public class CausticknightEntity extends Monster {
	public CausticknightEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.CAUSTICKNIGHT.get(), world);
	}

	public CausticknightEntity(EntityType<CausticknightEntity> type, Level world) {
		super(type, world);
		xpReward = 22;
		setNoAi(false);
		setPersistenceRequired();
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Player.class, (float) 6, 1, 1.2) {
			@Override
			public boolean canUse() {
				double x = CausticknightEntity.this.getX();
				double y = CausticknightEntity.this.getY();
				double z = CausticknightEntity.this.getZ();
				Entity entity = CausticknightEntity.this;
				Level world = CausticknightEntity.this.level;
				return super.canUse() && CausticknightIsGlowingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CausticknightEntity.this.getX();
				double y = CausticknightEntity.this.getY();
				double z = CausticknightEntity.this.getZ();
				Entity entity = CausticknightEntity.this;
				Level world = CausticknightEntity.this.level;
				return super.canContinueToUse() && CausticknightIsGlowingProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(2, new AvoidEntityGoal<>(this, ServerPlayer.class, (float) 6, 1, 1.2) {
			@Override
			public boolean canUse() {
				double x = CausticknightEntity.this.getX();
				double y = CausticknightEntity.this.getY();
				double z = CausticknightEntity.this.getZ();
				Entity entity = CausticknightEntity.this;
				Level world = CausticknightEntity.this.level;
				return super.canUse() && CausticknightIsGlowingProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = CausticknightEntity.this.getX();
				double y = CausticknightEntity.this.getY();
				double z = CausticknightEntity.this.getZ();
				Entity entity = CausticknightEntity.this;
				Level world = CausticknightEntity.this.level;
				return super.canContinueToUse() && CausticknightIsGlowingProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, true, true));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, true));
		this.targetSelector.addGoal(6, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
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
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		CausticknightDenyAttackProcedure.execute(this, source.getEntity());
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		CausticknightDropsProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		CausticknightAttackMasterProcedure.execute(this.level, this);
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.33);
		builder = builder.add(Attributes.MAX_HEALTH, 80);
		builder = builder.add(Attributes.ARMOR, 9);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}

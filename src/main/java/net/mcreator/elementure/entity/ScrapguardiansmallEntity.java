
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.elementure.procedures.ScrapguardianAttackOnDifficultyProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

public class ScrapguardiansmallEntity extends Monster {
	public ScrapguardiansmallEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.SCRAPGUARDIANSMALL.get(), world);
	}

	public ScrapguardiansmallEntity(EntityType<ScrapguardiansmallEntity> type, Level world) {
		super(type, world);
		xpReward = 6;
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
		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

			@Override
			public boolean canUse() {
				double x = ScrapguardiansmallEntity.this.getX();
				double y = ScrapguardiansmallEntity.this.getY();
				double z = ScrapguardiansmallEntity.this.getZ();
				Entity entity = ScrapguardiansmallEntity.this;
				Level world = ScrapguardiansmallEntity.this.level;
				return super.canUse() && ScrapguardianAttackOnDifficultyProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ScrapguardiansmallEntity.this.getX();
				double y = ScrapguardiansmallEntity.this.getY();
				double z = ScrapguardiansmallEntity.this.getZ();
				Entity entity = ScrapguardiansmallEntity.this;
				Level world = ScrapguardiansmallEntity.this.level;
				return super.canContinueToUse() && ScrapguardianAttackOnDifficultyProcedure.execute(world);
			}

		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, true, true) {
			@Override
			public boolean canUse() {
				double x = ScrapguardiansmallEntity.this.getX();
				double y = ScrapguardiansmallEntity.this.getY();
				double z = ScrapguardiansmallEntity.this.getZ();
				Entity entity = ScrapguardiansmallEntity.this;
				Level world = ScrapguardiansmallEntity.this.level;
				return super.canUse() && ScrapguardianAttackOnDifficultyProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ScrapguardiansmallEntity.this.getX();
				double y = ScrapguardiansmallEntity.this.getY();
				double z = ScrapguardiansmallEntity.this.getZ();
				Entity entity = ScrapguardiansmallEntity.this;
				Level world = ScrapguardiansmallEntity.this.level;
				return super.canContinueToUse() && ScrapguardianAttackOnDifficultyProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, true) {
			@Override
			public boolean canUse() {
				double x = ScrapguardiansmallEntity.this.getX();
				double y = ScrapguardiansmallEntity.this.getY();
				double z = ScrapguardiansmallEntity.this.getZ();
				Entity entity = ScrapguardiansmallEntity.this;
				Level world = ScrapguardiansmallEntity.this.level;
				return super.canUse() && ScrapguardianAttackOnDifficultyProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ScrapguardiansmallEntity.this.getX();
				double y = ScrapguardiansmallEntity.this.getY();
				double z = ScrapguardiansmallEntity.this.getZ();
				Entity entity = ScrapguardiansmallEntity.this;
				Level world = ScrapguardiansmallEntity.this.level;
				return super.canContinueToUse() && ScrapguardianAttackOnDifficultyProcedure.execute(world);
			}
		});
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this) {
			@Override
			public boolean canUse() {
				double x = ScrapguardiansmallEntity.this.getX();
				double y = ScrapguardiansmallEntity.this.getY();
				double z = ScrapguardiansmallEntity.this.getZ();
				Entity entity = ScrapguardiansmallEntity.this;
				Level world = ScrapguardiansmallEntity.this.level;
				return super.canUse() && ScrapguardianAttackOnDifficultyProcedure.execute(world);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ScrapguardiansmallEntity.this.getX();
				double y = ScrapguardiansmallEntity.this.getY();
				double z = ScrapguardiansmallEntity.this.getZ();
				Entity entity = ScrapguardiansmallEntity.this;
				Level world = ScrapguardiansmallEntity.this.level;
				return super.canContinueToUse() && ScrapguardianAttackOnDifficultyProcedure.execute(world);
			}
		});
		this.goalSelector.addGoal(5, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(Items.REDSTONE));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.step"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.break"));
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		if (source.isExplosion())
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.27);
		builder = builder.add(Attributes.MAX_HEALTH, 16);
		builder = builder.add(Attributes.ARMOR, 8);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}

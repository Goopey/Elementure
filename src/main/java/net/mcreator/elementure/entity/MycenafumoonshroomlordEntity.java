
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
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

import net.mcreator.elementure.procedures.MycenafumoonshroomlordDropsProcedure;
import net.mcreator.elementure.procedures.MycenafumoonshroomlordAttackMasterProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

public class MycenafumoonshroomlordEntity extends Monster {
	public MycenafumoonshroomlordEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.MYCENAFUMOONSHROOMLORD.get(), world);
	}

	public MycenafumoonshroomlordEntity(EntityType<MycenafumoonshroomlordEntity> type, Level world) {
		super(type, world);
		xpReward = 36;
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
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, ServerPlayer.class, false, false));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, MycenashroomguardEntity.class, false, false));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, MycenashroomvillagerleatherworkerEntity.class, false, false));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, MycenashroomvillagerblacksmithEntity.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, MycenashroomvillagerlibrarianEntity.class, false, false));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, MycenashroomvillagerpriestEntity.class, false, false));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MycenashroomvillagerfarmerEntity.class, false, false));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MycenashroomvillagerNitwitEntity.class, false, false));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, MycenashroomvillagerelderEntity.class, false, false));
		this.targetSelector.addGoal(11, new HurtByTargetGoal(this).setAlertOthers());
		this.goalSelector.addGoal(12, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(13, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(14, new FloatGoal(this));
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
	public void die(DamageSource source) {
		super.die(source);
		MycenafumoonshroomlordDropsProcedure.execute(this.level, this);
	}

	@Override
	public void baseTick() {
		super.baseTick();
		MycenafumoonshroomlordAttackMasterProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.19999999999999998);
		builder = builder.add(Attributes.MAX_HEALTH, 550);
		builder = builder.add(Attributes.ARMOR, 3);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 10);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}

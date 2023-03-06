
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
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

import net.mcreator.elementure.procedures.MycenafumoonshroomlingExplodesProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

public class MycenafumoonshroomlingEntity extends Monster {
	public MycenafumoonshroomlingEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.MYCENAFUMOONSHROOMLING.get(), world);
	}

	public MycenafumoonshroomlingEntity(EntityType<MycenafumoonshroomlingEntity> type, Level world) {
		super(type, world);
		xpReward = 9;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Player.class, true, true));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, true));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, MycenashroomguardEntity.class, true, true));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, MycenashroomvillagerleatherworkerEntity.class, true, true));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, MycenashroomvillagerblacksmithEntity.class, true, true));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, MycenashroomvillagerlibrarianEntity.class, true, true));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, MycenashroomvillagerpriestEntity.class, true, true));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MycenashroomvillagerfarmerEntity.class, true, true));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MycenashroomvillagerNitwitEntity.class, true, true));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, MycenashroomvillagerelderEntity.class, true, true));
		this.goalSelector.addGoal(11, new MeleeAttackGoal(this, 1.2, true) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.targetSelector.addGoal(12, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(13, new RandomStrollGoal(this, 1));
		this.goalSelector.addGoal(14, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(15, new FloatGoal(this));
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
	public void die(DamageSource source) {
		super.die(source);
		MycenafumoonshroomlingExplodesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	public void playerTouch(Player sourceentity) {
		super.playerTouch(sourceentity);
		MycenafumoonshroomlingExplodesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init() {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 12);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 2);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}

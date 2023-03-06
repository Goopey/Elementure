
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RestrictSunGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.elementure.procedures.MycenamobsSpawnconditionProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

public class MycenainfectedshroomguardEntity extends Monster {
	public MycenainfectedshroomguardEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.MYCENAINFECTEDSHROOMGUARD.get(), world);
	}

	public MycenainfectedshroomguardEntity(EntityType<MycenainfectedshroomguardEntity> type, Level world) {
		super(type, world);
		xpReward = 7;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new RestrictSunGoal(this));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, true, true));
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, ServerPlayer.class, true, true));
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, MycenashroomguardEntity.class, true, true));
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, MycenashroomvillagerleatherworkerEntity.class, true, true));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, MycenashroomvillagerblacksmithEntity.class, true, true));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, MycenashroomvillagerlibrarianEntity.class, true, true));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MycenashroomvillagerpriestEntity.class, true, true));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MycenashroomvillagerfarmerEntity.class, true, true));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, MycenashroomvillagerNitwitEntity.class, true, true));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, MycenashroomvillagerelderEntity.class, true, true));
		this.goalSelector.addGoal(12, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}
		});
		this.goalSelector.addGoal(13, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(14, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(15, new BreakDoorGoal(this, e -> true));
		this.goalSelector.addGoal(16, new RandomLookAroundGoal(this));
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

	public static void init() {
		SpawnPlacements.register(ElementureModEntities.MYCENAINFECTEDSHROOMGUARD.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return MycenamobsSpawnconditionProcedure.execute(world, x, z);
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.27);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 5);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}

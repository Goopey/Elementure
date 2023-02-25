
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.elementure.procedures.MonsterDeepSpawnProcedure;
import net.mcreator.elementure.procedures.ArchkassemrunawayProcedure;
import net.mcreator.elementure.procedures.ArchkassemdropsProcedure;
import net.mcreator.elementure.procedures.ArchkassemSpawnProcedure;
import net.mcreator.elementure.procedures.ArchkassemAttackProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

import javax.annotation.Nullable;

public class ArchkassemEntity extends Monster {
	public ArchkassemEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.ARCHKASSEM.get(), world);
	}

	public ArchkassemEntity(EntityType<ArchkassemEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, Player.class, (float) 10, 1, 1.2) {
			@Override
			public boolean canUse() {
				double x = ArchkassemEntity.this.getX();
				double y = ArchkassemEntity.this.getY();
				double z = ArchkassemEntity.this.getZ();
				Entity entity = ArchkassemEntity.this;
				Level world = ArchkassemEntity.this.level;
				return super.canUse() && ArchkassemrunawayProcedure.execute(world, entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ArchkassemEntity.this.getX();
				double y = ArchkassemEntity.this.getY();
				double z = ArchkassemEntity.this.getZ();
				Entity entity = ArchkassemEntity.this;
				Level world = ArchkassemEntity.this.level;
				return super.canContinueToUse() && ArchkassemrunawayProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(2, new AvoidEntityGoal<>(this, ServerPlayer.class, (float) 10, 1, 1.2) {
			@Override
			public boolean canUse() {
				double x = ArchkassemEntity.this.getX();
				double y = ArchkassemEntity.this.getY();
				double z = ArchkassemEntity.this.getZ();
				Entity entity = ArchkassemEntity.this;
				Level world = ArchkassemEntity.this.level;
				return super.canUse() && ArchkassemrunawayProcedure.execute(world, entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = ArchkassemEntity.this.getX();
				double y = ArchkassemEntity.this.getY();
				double z = ArchkassemEntity.this.getZ();
				Entity entity = ArchkassemEntity.this;
				Level world = ArchkassemEntity.this.level;
				return super.canContinueToUse() && ArchkassemrunawayProcedure.execute(world, entity);
			}
		});
		this.goalSelector.addGoal(3, new PanicGoal(this, 1.2));
		this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.2, false) {
			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return (double) (4.0 + entity.getBbWidth() * entity.getBbWidth());
			}
		});
		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Player.class, false, false));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, ServerPlayer.class, false, false));
		this.goalSelector.addGoal(7, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(8, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(10, new FloatGoal(this));
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:kassem_hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:kassem_death"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		ArchkassemdropsProcedure.execute(this.level, this);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason,
			@Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		ArchkassemSpawnProcedure.execute(world, this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		ArchkassemAttackProcedure.execute(this.level, this);
	}

	public static void init() {
		SpawnPlacements.register(ElementureModEntities.ARCHKASSEM.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> {
					int x = pos.getX();
					int y = pos.getY();
					int z = pos.getZ();
					return MonsterDeepSpawnProcedure.execute(world, y);
				});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.12);
		builder = builder.add(Attributes.MAX_HEALTH, 30);
		builder = builder.add(Attributes.ARMOR, 2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 4);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		return builder;
	}
}

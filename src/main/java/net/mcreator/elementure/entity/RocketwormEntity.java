
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobCategory;
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
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.procedures.RocketwormTunnelingProcedure;
import net.mcreator.elementure.procedures.RocketwormSpawning1Procedure;
import net.mcreator.elementure.procedures.RocketwormSetNewHeadTailProcedure;
import net.mcreator.elementure.procedures.RocketwormIsSegmentProcedure;
import net.mcreator.elementure.procedures.RocketwormFollowProcedure;
import net.mcreator.elementure.procedures.RocketwormApplyBurningProcedure;
import net.mcreator.elementure.procedures.MonsterDeepSpawnProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

import javax.annotation.Nullable;

import java.util.Random;
import java.util.EnumSet;

@Mod.EventBusSubscriber
public class RocketwormEntity extends Monster {
	private int bodyArrPos;

	public void setBody() {
		this.bodyArrPos = 1;
		this.getPersistentData().putDouble("bodyType", 1);
	}

	public void setTail() {
		this.bodyArrPos = 2;
		this.getPersistentData().putDouble("bodyType", 2);
	}

	public void setHead() {
		this.bodyArrPos = 0;
		this.getPersistentData().putDouble("bodyType", 0);
	}

	public int getBodyType() {
		changeBodyType();
		return bodyArrPos;
	}

	public void changeBodyType() {
		int bod = (int) this.getPersistentData().getDouble("bodyType");
		if (bod > 2) {
			bod = 0;
		} else if (bod < 0) {
			bod = 0;
		}
		this.bodyArrPos = bod;
	}

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData(ElementureModEntities.ROCKETWORM.get(), 60, 1, 1));
	}

	public RocketwormEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.ROCKETWORM.get(), world);
	}

	public RocketwormEntity(EntityType<RocketwormEntity> type, Level world) {
		super(type, world);
		xpReward = 4;
		changeBodyType();
		setNoAi(false);
		this.moveControl = new FlyingMoveControl(this, 10, true);
		this.setNoGravity(true);
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

			@Override
			public boolean canUse() {
				double x = RocketwormEntity.this.getX();
				double y = RocketwormEntity.this.getY();
				double z = RocketwormEntity.this.getZ();
				Entity entity = RocketwormEntity.this;
				Level world = RocketwormEntity.this.level;
				return super.canUse() && RocketwormIsSegmentProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RocketwormEntity.this.getX();
				double y = RocketwormEntity.this.getY();
				double z = RocketwormEntity.this.getZ();
				Entity entity = RocketwormEntity.this;
				Level world = RocketwormEntity.this.level;
				return super.canContinueToUse() && RocketwormIsSegmentProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(2, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (RocketwormEntity.this.getTarget() != null && !RocketwormEntity.this.getMoveControl().hasWanted()) {
					double x = RocketwormEntity.this.getX();
					double y = RocketwormEntity.this.getY();
					double z = RocketwormEntity.this.getZ();
					Entity entity = RocketwormEntity.this;
					return RocketwormIsSegmentProcedure.execute(entity);
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				double x = RocketwormEntity.this.getX();
				double y = RocketwormEntity.this.getY();
				double z = RocketwormEntity.this.getZ();
				Entity entity = RocketwormEntity.this;
				return RocketwormIsSegmentProcedure.execute(entity) && RocketwormEntity.this.getMoveControl().hasWanted()
						&& RocketwormEntity.this.getTarget() != null && RocketwormEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = RocketwormEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				RocketwormEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 2.5);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = RocketwormEntity.this.getTarget();
				if (RocketwormEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					RocketwormEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = RocketwormEntity.this.distanceToSqr(livingentity);
					if (d0 < 64) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						RocketwormEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 2.5);
					}
				}
			}
		});
		this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, false, false) {
			@Override
			public boolean canUse() {
				double x = RocketwormEntity.this.getX();
				double y = RocketwormEntity.this.getY();
				double z = RocketwormEntity.this.getZ();
				Entity entity = RocketwormEntity.this;
				Level world = RocketwormEntity.this.level;
				return super.canUse() && RocketwormIsSegmentProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RocketwormEntity.this.getX();
				double y = RocketwormEntity.this.getY();
				double z = RocketwormEntity.this.getZ();
				Entity entity = RocketwormEntity.this;
				Level world = RocketwormEntity.this.level;
				return super.canContinueToUse() && RocketwormIsSegmentProcedure.execute(entity);
			}
		});
		this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ServerPlayer.class, false, false) {
			@Override
			public boolean canUse() {
				double x = RocketwormEntity.this.getX();
				double y = RocketwormEntity.this.getY();
				double z = RocketwormEntity.this.getZ();
				Entity entity = RocketwormEntity.this;
				Level world = RocketwormEntity.this.level;
				return super.canUse() && RocketwormIsSegmentProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RocketwormEntity.this.getX();
				double y = RocketwormEntity.this.getY();
				double z = RocketwormEntity.this.getZ();
				Entity entity = RocketwormEntity.this;
				Level world = RocketwormEntity.this.level;
				return super.canContinueToUse() && RocketwormIsSegmentProcedure.execute(entity);
			}
		});
		this.goalSelector.addGoal(5, new RandomStrollGoal(this, 0.8, 20) {
			@Override
			protected Vec3 getPosition() {
				Random random = RocketwormEntity.this.getRandom();
				double dir_x = RocketwormEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = RocketwormEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = RocketwormEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

			@Override
			public boolean canUse() {
				double x = RocketwormEntity.this.getX();
				double y = RocketwormEntity.this.getY();
				double z = RocketwormEntity.this.getZ();
				Entity entity = RocketwormEntity.this;
				Level world = RocketwormEntity.this.level;
				return super.canUse() && RocketwormIsSegmentProcedure.execute(entity);
			}

			@Override
			public boolean canContinueToUse() {
				double x = RocketwormEntity.this.getX();
				double y = RocketwormEntity.this.getY();
				double z = RocketwormEntity.this.getZ();
				Entity entity = RocketwormEntity.this;
				Level world = RocketwormEntity.this.level;
				return super.canContinueToUse() && RocketwormIsSegmentProcedure.execute(entity);
			}
		});
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEAD;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(Blocks.TUFF));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.dripstone_block.break"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.shulker.hurt"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		RocketwormSetNewHeadTailProcedure.execute(this.level, this);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason,
			@Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		RocketwormSpawning1Procedure.execute(this);
		changeBodyType();
		return retval;
	}

	@Override
	public void baseTick() {
		this.noPhysics = true;
		super.baseTick();
		this.noPhysics = false;
		RocketwormTunnelingProcedure.execute(this.level, this);
		RocketwormFollowProcedure.execute(this.level, this);
	}

	@Override
	public void playerTouch(Player sourceentity) {
		super.playerTouch(sourceentity);
		RocketwormApplyBurningProcedure.execute(this);
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
		SpawnPlacements.register(ElementureModEntities.ROCKETWORM.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> {
					int x = pos.getX();
					int y = pos.getY();
					int z = pos.getZ();
					return MonsterDeepSpawnProcedure.execute(world, y);
				});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 3.3000000000000003);
		builder = builder.add(Attributes.MAX_HEALTH, 30);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 64);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.2);
		builder = builder.add(Attributes.FLYING_SPEED, 3.3000000000000003);
		return builder;
	}
}

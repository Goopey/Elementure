
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.RestrictSunGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.FollowMobGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.procedures.MycenasporelingGrowProcedure;
import net.mcreator.elementure.procedures.MycenamobsSpawnconditionProcedure;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.init.ElementureModBlocks;

import java.util.EnumSet;

public class MycenasporelingEntity extends PathfinderMob {
	public MycenasporelingEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.MYCENASPORELING.get(), world);
	}

	public MycenasporelingEntity(EntityType<MycenasporelingEntity> type, Level world) {
		super(type, world);
		xpReward = 1;
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
		this.goalSelector.addGoal(3, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (MycenasporelingEntity.this.getTarget() != null && !MycenasporelingEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return MycenasporelingEntity.this.getMoveControl().hasWanted() && MycenasporelingEntity.this.getTarget() != null && MycenasporelingEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = MycenasporelingEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				MycenasporelingEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = MycenasporelingEntity.this.getTarget();
				if (MycenasporelingEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					MycenasporelingEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = MycenasporelingEntity.this.distanceToSqr(livingentity);
					if (d0 < 16) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						MycenasporelingEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1);
					}
				}
			}
		});
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(5, new RestrictSunGoal(this));
		this.goalSelector.addGoal(6, new TemptGoal(this, 1, Ingredient.of(ElementureModBlocks.MYCENASPROUTS.get().asItem()), false));
		this.goalSelector.addGoal(7, new FollowMobGoal(this, (float) 1, 10, 5));
		this.goalSelector.addGoal(8, new RandomStrollGoal(this, 0.8, 20) {
			@Override
			protected Vec3 getPosition() {
				RandomSource random = MycenasporelingEntity.this.getRandom();
				double dir_x = MycenasporelingEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = MycenasporelingEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = MycenasporelingEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}
		});
		this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(10, new FloatGoal(this));
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
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		MycenasporelingGrowProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
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
		SpawnPlacements.register(ElementureModEntities.MYCENASPORELING.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			return MycenamobsSpawnconditionProcedure.execute(world, x, z);
		});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 6);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 2);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.FLYING_SPEED, 0.3);
		return builder;
	}
}

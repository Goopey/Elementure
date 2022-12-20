
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.elementure.procedures.DiverscrownSmalltunnelSpawningProcedure;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.init.ElementureModBlocks;

@Mod.EventBusSubscriber
public class BubbleOBlueEntity extends PathfinderMob {
	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		event.getSpawns().getSpawner(MobCategory.WATER_AMBIENT)
				.add(new MobSpawnSettings.SpawnerData(ElementureModEntities.BUBBLE_O_BLUE.get(), 100, 2, 3));
	}

	public BubbleOBlueEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.BUBBLE_O_BLUE.get(), world);
	}

	public BubbleOBlueEntity(EntityType<BubbleOBlueEntity> type, Level world) {
		super(type, world);
		xpReward = 15;
		setNoAi(false);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (BubbleOBlueEntity.this.isInWater())
					BubbleOBlueEntity.this.setDeltaMovement(BubbleOBlueEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !BubbleOBlueEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - BubbleOBlueEntity.this.getX();
					double dy = this.wantedY - BubbleOBlueEntity.this.getY();
					double dz = this.wantedZ - BubbleOBlueEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * BubbleOBlueEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					BubbleOBlueEntity.this.setYRot(this.rotlerp(BubbleOBlueEntity.this.getYRot(), f, 10));
					BubbleOBlueEntity.this.yBodyRot = BubbleOBlueEntity.this.getYRot();
					BubbleOBlueEntity.this.yHeadRot = BubbleOBlueEntity.this.getYRot();
					if (BubbleOBlueEntity.this.isInWater()) {
						BubbleOBlueEntity.this.setSpeed((float) BubbleOBlueEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						BubbleOBlueEntity.this.setXRot(this.rotlerp(BubbleOBlueEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(BubbleOBlueEntity.this.getXRot() * (float) (Math.PI / 180.0));
						BubbleOBlueEntity.this.setZza(f3 * f1);
						BubbleOBlueEntity.this.setYya((float) (f1 * dy));
					} else {
						BubbleOBlueEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					BubbleOBlueEntity.this.setSpeed(0);
					BubbleOBlueEntity.this.setYya(0);
					BubbleOBlueEntity.this.setZza(0);
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
		this.goalSelector.addGoal(1, new RandomSwimmingGoal(this, 1, 40));
	}

	@Override
	public MobType getMobType() {
		return MobType.WATER;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(ElementureModBlocks.CORMUNCULUSBLOCK.get()));
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.glow_squid.death"));
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
		SpawnPlacements.register(ElementureModEntities.BUBBLE_O_BLUE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> {
					int x = pos.getX();
					int y = pos.getY();
					int z = pos.getZ();
					return DiverscrownSmalltunnelSpawningProcedure.execute(world, x, y, z);
				});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 1.4000000000000001);
		builder = builder.add(Attributes.MAX_HEALTH, 20);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 1.4000000000000001);
		return builder;
	}
}

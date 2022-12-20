
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.FollowMobGoal;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.procedures.RimeboidSpawningProcedure;
import net.mcreator.elementure.procedures.RimeboidSinkProcedure;
import net.mcreator.elementure.procedures.RimeboidSchoolSpawnProcedure;
import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEntities;

import javax.annotation.Nullable;

import java.util.Random;

@Mod.EventBusSubscriber
public class RimeboidEntity extends PathfinderMob {
	public ResourceLocation color;

	@SubscribeEvent
	public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
		event.getSpawns().getSpawner(MobCategory.WATER_AMBIENT)
				.add(new MobSpawnSettings.SpawnerData(ElementureModEntities.RIMEBOID.get(), 180, 2, 3));
	}

	public RimeboidEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.RIMEBOID.get(), world);
	}

	public RimeboidEntity(EntityType<RimeboidEntity> type, Level world) {
		super(type, world);
		this.color = setColor();
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
		this.goalSelector.addGoal(1, new FollowMobGoal(this, (float) 1, 0.1f, 16));
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1.4, 20) {
			@Override
			protected Vec3 getPosition() {
				Random random = RimeboidEntity.this.getRandom();
				double dir_x = RimeboidEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 6);
				double dir_y = RimeboidEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 6);
				double dir_z = RimeboidEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 6);
				return new Vec3(dir_x, dir_y, dir_z);
			}
		});
		this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, RimeboidEntity.class, (float) 6));
	}

	public ResourceLocation setColor() {
		ResourceLocation black = new ResourceLocation("elementure:textures/black_rimeboid_texturemap.png");
		ResourceLocation gray = new ResourceLocation("elementure:textures/gray_rimeboid_texturemap.png");
		ResourceLocation lightgray = new ResourceLocation("elementure:textures/lightgray_rimeboid_texturemap.png");
		ResourceLocation white = new ResourceLocation("elementure:textures/white_rimeboid_texturemap.png");
		ResourceLocation red = new ResourceLocation("elementure:textures/red_rimeboid_texturemap.png");
		ResourceLocation orange = new ResourceLocation("elementure:textures/orange_rimeboid_texturemap.png");
		ResourceLocation yellow = new ResourceLocation("elementure:textures/yellow_rimeboid_texturemap.png");
		ResourceLocation lime = new ResourceLocation("elementure:textures/lime_rimeboid_texturemap.png");
		ResourceLocation blue = new ResourceLocation("elementure:textures/blue_rimeboid_texturemap.png");
		ResourceLocation lightblue = new ResourceLocation("elementure:textures/lightblue_rimeboid_texturemap.png");
		ResourceLocation green = new ResourceLocation("elementure:textures/green_rimeboid_texturemap.png");
		ResourceLocation cyan = new ResourceLocation("elementure:textures/cyan_rimeboid_texturemap.png");
		ResourceLocation purple = new ResourceLocation("elementure:textures/purple_rimeboid_texturemap.png");
		ResourceLocation magenta = new ResourceLocation("elementure:textures/magenta_rimeboid_texturemap.png");
		ResourceLocation brown = new ResourceLocation("elementure:textures/brown_rimeboid_texturemap.png");
		ResourceLocation pink = new ResourceLocation("elementure:textures/pink_rimeboid_texturemap.png");
		Random rnd = new Random();
		int rVal = rnd.nextInt(16);
		switch (rVal) {
			case 0 :
				return black;
			case 1 :
				return gray;
			case 2 :
				return lightgray;
			case 3 :
				return white;
			case 4 :
				return green;
			case 5 :
				return blue;
			case 6 :
				return lightblue;
			case 7 :
				return cyan;
			case 8 :
				return red;
			case 9 :
				return orange;
			case 10 :
				return yellow;
			case 11 :
				return lime;
			case 12 :
				return purple;
			case 13 :
				return magenta;
			case 14 :
				return pink;
			default :
				return brown;
		}
	}

	@Override
	public MobType getMobType() {
		return MobType.WATER;
	}

	protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
		super.dropCustomDeathLoot(source, looting, recentlyHitIn);
		this.spawnAtLocation(new ItemStack(ElementureModItems.RIMEBOID_FOOD.get()));
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
		if (source == DamageSource.DROWN)
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason,
			@Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		RimeboidSchoolSpawnProcedure.execute(world, this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		RimeboidSinkProcedure.execute(this);
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
		SpawnPlacements.register(ElementureModEntities.RIMEBOID.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> {
					int x = pos.getX();
					int y = pos.getY();
					int z = pos.getZ();
					return RimeboidSpawningProcedure.execute(world, x, y, z);
				});
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 1.2);
		builder = builder.add(Attributes.MAX_HEALTH, 2);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FLYING_SPEED, 1.2);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 1.2);
		return builder;
	}
}

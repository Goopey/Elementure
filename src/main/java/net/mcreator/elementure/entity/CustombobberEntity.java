
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.nbt.CompoundTag;

import net.mcreator.elementure.procedures.CustombobberUpdateProcedure;
import net.mcreator.elementure.procedures.CustombobberAssignFisherProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

import javax.annotation.Nullable;

public class CustombobberEntity extends PathfinderMob {
	public CustombobberEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.CUSTOMBOBBER.get(), world);
	}

	public CustombobberEntity(EntityType<CustombobberEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (CustombobberEntity.this.isInWater())
					CustombobberEntity.this.setDeltaMovement(CustombobberEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !CustombobberEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - CustombobberEntity.this.getX();
					double dy = this.wantedY - CustombobberEntity.this.getY();
					double dz = this.wantedZ - CustombobberEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * CustombobberEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					CustombobberEntity.this.setYRot(this.rotlerp(CustombobberEntity.this.getYRot(), f, 10));
					CustombobberEntity.this.yBodyRot = CustombobberEntity.this.getYRot();
					CustombobberEntity.this.yHeadRot = CustombobberEntity.this.getYRot();
					if (CustombobberEntity.this.isInWater()) {
						CustombobberEntity.this.setSpeed((float) CustombobberEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						CustombobberEntity.this.setXRot(this.rotlerp(CustombobberEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(CustombobberEntity.this.getXRot() * (float) (Math.PI / 180.0));
						CustombobberEntity.this.setZza(f3 * f1);
						CustombobberEntity.this.setYya((float) (f1 * dy));
					} else {
						CustombobberEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					CustombobberEntity.this.setSpeed(0);
					CustombobberEntity.this.setYya(0);
					CustombobberEntity.this.setZza(0);
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

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
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
	public boolean hurt(DamageSource source, float amount) {
		if (source.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (source.getDirectEntity() instanceof Player)
			return false;
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		if (source == DamageSource.LIGHTNING_BOLT)
			return false;
		if (source.isExplosion())
			return false;
		if (source.getMsgId().equals("trident"))
			return false;
		if (source == DamageSource.ANVIL)
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		CustombobberAssignFisherProcedure.execute(world, this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		CustombobberUpdateProcedure.execute(this.level, this);
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
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 1024);
		builder = builder.add(Attributes.ARMOR, 100);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1000);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0);
		return builder;
	}
}

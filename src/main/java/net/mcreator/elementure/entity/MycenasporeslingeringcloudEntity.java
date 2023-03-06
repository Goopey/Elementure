
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
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
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.elementure.procedures.MycenasporeslingeringcloudEffectProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

public class MycenasporeslingeringcloudEntity extends PathfinderMob {
	public MycenasporeslingeringcloudEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.MYCENASPORESLINGERINGCLOUD.get(), world);
	}

	public MycenasporeslingeringcloudEntity(EntityType<MycenasporeslingeringcloudEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(true);
		setPersistenceRequired();
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (MycenasporeslingeringcloudEntity.this.isInWater())
					MycenasporeslingeringcloudEntity.this.setDeltaMovement(MycenasporeslingeringcloudEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !MycenasporeslingeringcloudEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - MycenasporeslingeringcloudEntity.this.getX();
					double dy = this.wantedY - MycenasporeslingeringcloudEntity.this.getY();
					double dz = this.wantedZ - MycenasporeslingeringcloudEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * MycenasporeslingeringcloudEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					MycenasporeslingeringcloudEntity.this.setYRot(this.rotlerp(MycenasporeslingeringcloudEntity.this.getYRot(), f, 10));
					MycenasporeslingeringcloudEntity.this.yBodyRot = MycenasporeslingeringcloudEntity.this.getYRot();
					MycenasporeslingeringcloudEntity.this.yHeadRot = MycenasporeslingeringcloudEntity.this.getYRot();
					if (MycenasporeslingeringcloudEntity.this.isInWater()) {
						MycenasporeslingeringcloudEntity.this.setSpeed((float) MycenasporeslingeringcloudEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						MycenasporeslingeringcloudEntity.this.setXRot(this.rotlerp(MycenasporeslingeringcloudEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(MycenasporeslingeringcloudEntity.this.getXRot() * (float) (Math.PI / 180.0));
						MycenasporeslingeringcloudEntity.this.setZza(f3 * f1);
						MycenasporeslingeringcloudEntity.this.setYya((float) (f1 * dy));
					} else {
						MycenasporeslingeringcloudEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					MycenasporeslingeringcloudEntity.this.setSpeed(0);
					MycenasporeslingeringcloudEntity.this.setYya(0);
					MycenasporeslingeringcloudEntity.this.setZza(0);
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
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
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
	public void baseTick() {
		super.baseTick();
		MycenasporeslingeringcloudEffectProcedure.execute(this.level, this);
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
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity entityIn) {
	}

	@Override
	protected void pushEntities() {
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
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 100);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0);
		return builder;
	}
}

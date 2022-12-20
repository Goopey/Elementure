
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
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
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.elementure.procedures.OstrachainLinkFollowProcedure;
import net.mcreator.elementure.init.ElementureModEntities;

public class OstrachainLinkEntity extends PathfinderMob {
	public OstrachainLinkEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(ElementureModEntities.OSTRACHAIN_LINK.get(), world);
	}

	public OstrachainLinkEntity(EntityType<OstrachainLinkEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(false);
		this.noPhysics = true;
		this.setPathfindingMalus(BlockPathTypes.WATER, 0);
		this.moveControl = new MoveControl(this) {
			@Override
			public void tick() {
				if (OstrachainLinkEntity.this.isInWater())
					OstrachainLinkEntity.this.setDeltaMovement(OstrachainLinkEntity.this.getDeltaMovement().add(0, 0.005, 0));
				if (this.operation == MoveControl.Operation.MOVE_TO && !OstrachainLinkEntity.this.getNavigation().isDone()) {
					double dx = this.wantedX - OstrachainLinkEntity.this.getX();
					double dy = this.wantedY - OstrachainLinkEntity.this.getY();
					double dz = this.wantedZ - OstrachainLinkEntity.this.getZ();
					float f = (float) (Mth.atan2(dz, dx) * (double) (180 / Math.PI)) - 90;
					float f1 = (float) (this.speedModifier * OstrachainLinkEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
					OstrachainLinkEntity.this.setYRot(this.rotlerp(OstrachainLinkEntity.this.getYRot(), f, 10));
					OstrachainLinkEntity.this.yBodyRot = OstrachainLinkEntity.this.getYRot();
					OstrachainLinkEntity.this.yHeadRot = OstrachainLinkEntity.this.getYRot();
					if (OstrachainLinkEntity.this.isInWater()) {
						OstrachainLinkEntity.this.setSpeed((float) OstrachainLinkEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
						float f2 = -(float) (Mth.atan2(dy, (float) Math.sqrt(dx * dx + dz * dz)) * (180 / Math.PI));
						f2 = Mth.clamp(Mth.wrapDegrees(f2), -85, 85);
						OstrachainLinkEntity.this.setXRot(this.rotlerp(OstrachainLinkEntity.this.getXRot(), f2, 5));
						float f3 = Mth.cos(OstrachainLinkEntity.this.getXRot() * (float) (Math.PI / 180.0));
						OstrachainLinkEntity.this.setZza(f3 * f1);
						OstrachainLinkEntity.this.setYya((float) (f1 * dy));
					} else {
						OstrachainLinkEntity.this.setSpeed(f1 * 0.05F);
					}
				} else {
					OstrachainLinkEntity.this.setSpeed(0);
					OstrachainLinkEntity.this.setYya(0);
					OstrachainLinkEntity.this.setZza(0);
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
		return MobType.WATER;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.honey_block.step"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.honey_block.step"));
	}

	@Override
	public void baseTick() {
		super.baseTick();
		OstrachainLinkFollowProcedure.execute(this.level, this);
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
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(ForgeMod.SWIM_SPEED.get(), 0.3);
		return builder;
	}
}

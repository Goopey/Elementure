
package net.mcreator.elementure.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class TargodBlasterEntity extends AbstractArrow implements ItemSupplier {
	private int limitedLife = 600;

	public TargodBlasterEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(ElementureModEntities.TARGOD_BLASTER.get(), world);
	}

	public TargodBlasterEntity(EntityType<? extends TargodBlasterEntity> type, Level world) {
		super(type, world);
	}

	public TargodBlasterEntity(EntityType<? extends TargodBlasterEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public TargodBlasterEntity(EntityType<? extends TargodBlasterEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(ElementureModItems.TARBOMB.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		this.setDeltaMovement(
				new Vec3((this.getDeltaMovement().x() * 1.66), (this.getDeltaMovement().y() * 1.66), (this.getDeltaMovement().z() * 1.66)));
		if (this.inGround)
			this.discard();
		if (this.limitedLife > 0) {
			this.limitedLife--;
		} else if (!this.level.isClientSide()) {
			this.discard();
		}
	}

	@Override
	public boolean isPushedByFluid() {
		return false;
	}

	public static TargodBlasterEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		TargodBlasterEntity entityarrow = new TargodBlasterEntity(ElementureModEntities.TARGOD_BLASTER.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.honey_block.slide")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static TargodBlasterEntity shoot(LivingEntity entity, LivingEntity target) {
		TargodBlasterEntity entityarrow = new TargodBlasterEntity(ElementureModEntities.TARGOD_BLASTER.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1.2000000000000002f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.honey_block.slide")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}

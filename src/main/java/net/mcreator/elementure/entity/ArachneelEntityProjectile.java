
package net.mcreator.elementure.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class ArachneelEntityProjectile extends AbstractArrow implements ItemSupplier {
	public ArachneelEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(ElementureModEntities.ARACHNEEL_PROJECTILE.get(), world);
	}

	public ArachneelEntityProjectile(EntityType<? extends ArachneelEntityProjectile> type, Level world) {
		super(type, world);
	}

	public ArachneelEntityProjectile(EntityType<? extends ArachneelEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public ArachneelEntityProjectile(EntityType<? extends ArachneelEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(ElementureModItems.GREENJELLY.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(ElementureModItems.GREENJELLY.get());
	}
}

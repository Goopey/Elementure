package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;

public class AgedrosaryUpdateProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ElementureModItems.AGEDROSARY.get())
				&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == ElementureModItems.AGEDROSARY
						.get())
				&& itemstack.getOrCreateTag().getDouble("wait") > -1) {
			itemstack.getOrCreateTag().putDouble("wait", (itemstack.getOrCreateTag().getDouble("wait") - 1));
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class AngelpipAssignPowerProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("fishingPower") < 6) {
			itemstack.getOrCreateTag().putDouble("fishingPower", 6);
		}
		if (itemstack.getOrCreateTag().getDouble("attractionPower") < 10) {
			itemstack.getOrCreateTag().putDouble("attractionPower", 10);
		}
		if (!itemstack.getOrCreateTag().getBoolean("notConsumable")) {
			itemstack.getOrCreateTag().putBoolean("notConsumable", (true));
		}
	}
}

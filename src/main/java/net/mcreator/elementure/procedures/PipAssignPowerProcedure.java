package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class PipAssignPowerProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("fishingPower") < 2) {
			itemstack.getOrCreateTag().putDouble("fishingPower", 2);
		}
		if (itemstack.getOrCreateTag().getDouble("attractionPower") < 6) {
			itemstack.getOrCreateTag().putDouble("attractionPower", 6);
		}
	}
}

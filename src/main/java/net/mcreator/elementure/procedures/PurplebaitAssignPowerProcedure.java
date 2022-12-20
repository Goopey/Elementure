package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class PurplebaitAssignPowerProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("fishingPower") < 3) {
			itemstack.getOrCreateTag().putDouble("fishingPower", 3);
		}
		if (itemstack.getOrCreateTag().getDouble("attractionPower") < 5) {
			itemstack.getOrCreateTag().putDouble("attractionPower", 5);
		}
	}
}

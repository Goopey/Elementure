package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class CocoabaitAssignPowerProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("fishingPower") < 1) {
			itemstack.getOrCreateTag().putDouble("fishingPower", 1);
		}
		if (itemstack.getOrCreateTag().getDouble("attractionPower") < 5) {
			itemstack.getOrCreateTag().putDouble("attractionPower", 5);
		}
	}
}

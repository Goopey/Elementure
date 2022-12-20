package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class StringlineAssignStrengthProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("fishingPower") < 3) {
			itemstack.getOrCreateTag().putDouble("fishingPower", 3);
		}
	}
}

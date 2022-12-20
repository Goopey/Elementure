package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class StrengthenedstringlineAssignStrengthProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("fishingPower") < 5) {
			itemstack.getOrCreateTag().putDouble("fishingPower", 5);
		}
	}
}

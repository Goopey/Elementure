package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class ObsidianbobberAssignStrengthProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("fishingPower") < 2) {
			itemstack.getOrCreateTag().putDouble("fishingPower", 2);
		}
	}
}

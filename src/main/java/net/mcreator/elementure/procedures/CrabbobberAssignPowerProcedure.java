package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class CrabbobberAssignPowerProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("fishingPower") < 4) {
			itemstack.getOrCreateTag().putDouble("fishingPower", 4);
		}
	}
}

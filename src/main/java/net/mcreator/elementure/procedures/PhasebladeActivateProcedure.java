package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class PhasebladeActivateProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getBoolean("phasing")) {
			itemstack.getOrCreateTag().putBoolean("phasing", (false));
		} else {
			itemstack.getOrCreateTag().putBoolean("phasing", (true));
		}
	}
}

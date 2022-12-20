package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class NegativeGlowProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getBoolean("matrix_set") || itemstack.getOrCreateTag().getBoolean("memorial_set");
	}
}

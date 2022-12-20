package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class TidalcometGlowProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getBoolean("hasCometLight");
	}
}

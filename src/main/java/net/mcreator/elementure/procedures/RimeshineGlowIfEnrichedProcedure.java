package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class RimeshineGlowIfEnrichedProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getBoolean("isEnriched");
	}
}

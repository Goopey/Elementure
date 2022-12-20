package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class RedsunActiveProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getBoolean("redSunActive") || itemstack.getOrCreateTag().getDouble("redSunOverload") > 0;
	}
}

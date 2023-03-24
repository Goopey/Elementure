package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class WeaponArtScrollShineProcedure {
	public static boolean execute(ItemStack itemstack) {
		return !(itemstack.getOrCreateTag().getString("weaponArtName")).isEmpty();
	}
}

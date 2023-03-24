package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

public class WeaponArtDescriptionReturnProcedure {
	public static String execute(ItemStack itemstack) {
		if ((itemstack.getOrCreateTag().getString("weaponArtName")).isEmpty()) {
			return "";
		}
		return itemstack.getOrCreateTag().getString("weaponArtName") + "*" + itemstack.getOrCreateTag().getString("weaponArtDescription");
	}
}

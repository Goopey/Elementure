package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.elementure.item.WeaponArtItemItem;

public class WeaponArtItemSwingProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getItem() instanceof WeaponArtItemItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "animation.weaponartitem.side_bash");
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.elementure.item.WeaponArtItemItem;

public class WeaponArtItemSwingProcedure {
	public static void execute(ItemStack itemstack) {
		((WeaponArtItemItem) itemstack.getItem()).animationprocedure = "animation.weaponartitem.side_bash";
	}
}

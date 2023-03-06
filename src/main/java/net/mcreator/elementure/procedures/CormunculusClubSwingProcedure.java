package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;

import net.mcreator.elementure.item.CormunculusClubItem;
import net.mcreator.elementure.ElementureMod;

public class CormunculusClubSwingProcedure {
	public static void execute(ItemStack itemstack) {
		ElementureMod.LOGGER.info(itemstack.getItem().getClass());
		if (itemstack.getItem() instanceof CormunculusClubItem)
			itemstack.getOrCreateTag().putString("geckoAnim", "animation.weaponartitem.side_bash");
	}
}

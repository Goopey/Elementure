package net.mcreator.elementure.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

import net.mcreator.elementure.init.ElementureModEnchantments;

public class MagneticbaitAssignPowerProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("fishingPower") < 1) {
			itemstack.getOrCreateTag().putDouble("fishingPower", 1);
		}
		if (itemstack.getOrCreateTag().getDouble("crateChance") < 4) {
			itemstack.getOrCreateTag().putDouble("crateChance", (4 + EnchantmentHelper.getItemEnchantmentLevel(ElementureModEnchantments.MAGNETIC_ENCHANTMENT.get(), itemstack)));
		}
	}
}

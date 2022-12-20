package net.mcreator.elementure.procedures;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;

import net.mcreator.elementure.init.ElementureModEnchantments;

public class IronbobberAssignPowerProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("crateChance") < 2
				+ EnchantmentHelper.getItemEnchantmentLevel(ElementureModEnchantments.MAGNETIC_ENCHANTMENT.get(), itemstack)) {
			itemstack.getOrCreateTag().putDouble("crateChance",
					(2 + EnchantmentHelper.getItemEnchantmentLevel(ElementureModEnchantments.MAGNETIC_ENCHANTMENT.get(), itemstack)));
		}
	}
}


package net.mcreator.elementure.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.elementure.init.ElementureModEnchantments;

import java.util.List;

public class StrikeEnchantment extends Enchantment {
	public StrikeEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return List.of(Enchantments.BANE_OF_ARTHROPODS, Enchantments.SMITE, Enchantments.SHARPNESS, ElementureModEnchantments.STRIKE.get()).contains(ench);
	}
}

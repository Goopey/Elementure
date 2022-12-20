
package net.mcreator.elementure.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class DarksmiteEnchantment extends Enchantment {
	public DarksmiteEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		if (ench == Enchantments.BANE_OF_ARTHROPODS)
			return false;
		if (ench == Enchantments.SMITE)
			return false;
		if (ench == Enchantments.SHARPNESS)
			return false;
		return true;
	}

	@Override
	public boolean isCurse() {
		return true;
	}
}

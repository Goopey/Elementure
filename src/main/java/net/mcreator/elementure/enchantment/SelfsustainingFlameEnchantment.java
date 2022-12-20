
package net.mcreator.elementure.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.elementure.init.ElementureModItems;

import java.util.List;

public class SelfsustainingFlameEnchantment extends Enchantment {
	public SelfsustainingFlameEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return List.of(ElementureModItems.BLUESICKLE.get(), ElementureModItems.NETHERITESICKLE.get()).contains(item);
	}
}

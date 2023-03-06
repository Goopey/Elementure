package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEnchantments;

public class BluesickleHarvestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		double hasSelfsustainingFlame = 0;
		if (EnchantmentHelper.getItemEnchantmentLevel(ElementureModEnchantments.SELFSUSTAINING_FLAME.get(), itemstack) != 0) {
			hasSelfsustainingFlame = 1;
		}
		if (Math.random() < 0.075 * (1 + hasSelfsustainingFlame + EnchantmentHelper.getItemEnchantmentLevel(ElementureModEnchantments.SELFSUSTAINING_FLAME.get(), itemstack))) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ElementureModItems.BLUEMASS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}

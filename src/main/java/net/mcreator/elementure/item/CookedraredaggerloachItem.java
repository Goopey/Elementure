
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.elementure.procedures.CookedraredaggerloachEffectProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

public class CookedraredaggerloachItem extends Item {
	public CookedraredaggerloachItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDDEDFOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(8).saturationMod(1.6f)

				.meat().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CookedraredaggerloachEffectProcedure.execute(entity);
		return retval;
	}
}

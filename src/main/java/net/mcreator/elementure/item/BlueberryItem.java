
package net.mcreator.elementure.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.elementure.init.ElementureModTabs;

public class BlueberryItem extends Item {
	public BlueberryItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDDEDFOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.30000001192092896f)

				.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 8;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}

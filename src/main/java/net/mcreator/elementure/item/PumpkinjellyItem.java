
package net.mcreator.elementure.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.elementure.init.ElementureModTabs;

public class PumpkinjellyItem extends Item {
	public PumpkinjellyItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDDEDFOOD).stacksTo(16).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(1.2000000000000002f)

				.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 48;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}

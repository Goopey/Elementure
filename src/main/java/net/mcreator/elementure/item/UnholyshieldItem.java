
package net.mcreator.elementure.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.elementure.init.ElementureModTabs;

public class UnholyshieldItem extends Item {
	public UnholyshieldItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDSWORDS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getEnchantmentValue() {
		return 1;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 156;
	}
}

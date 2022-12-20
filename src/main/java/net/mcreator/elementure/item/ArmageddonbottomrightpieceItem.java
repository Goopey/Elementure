
package net.mcreator.elementure.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.elementure.init.ElementureModTabs;

public class ArmageddonbottomrightpieceItem extends Item {
	public ArmageddonbottomrightpieceItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDITEMS).stacksTo(4).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}

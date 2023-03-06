
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class SpikercrabItem extends Item {
	public SpikercrabItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_FISHINGTAB).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.4f)

				.meat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("An extremely though and elite grappler crab."));
	}
}

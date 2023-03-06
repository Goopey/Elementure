
package net.mcreator.elementure.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.elementure.init.ElementureModTabs;

public class SkipsnakeItem extends Item {
	public SkipsnakeItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_FISHINGTAB).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.7999999999999999f)

				.meat().build()));
	}
}

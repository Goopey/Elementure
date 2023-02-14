
package net.mcreator.elementure.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.elementure.init.ElementureModTabs;

public class CormunculusJellyItem extends Item {
	public CormunculusJellyItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_FISHINGTAB).stacksTo(64).rarity(Rarity.RARE));
	}
}


package net.mcreator.elementure.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.elementure.init.ElementureModTabs;

public class CursedforgottenseedsItem extends Item {
	public CursedforgottenseedsItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDITEMS).stacksTo(64).rarity(Rarity.RARE));
	}
}


package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class CorruptedSmiteItem extends Item {
	public CorruptedSmiteItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_SKILLWINDOW).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A76Boss trophy"));
		list.add(new TextComponent(
				"Artifact : smites are typically made to destroy your enemies. This one is made to destroy your enemies \u00A7lunder any circumstance.\u00A7l Failure will not be allowed again."));
		list.add(new TextComponent("-Stores up damage over a period of time and releases it all at once on your next melee attack."));
		list.add(new TextComponent("-More effective against bosses."));
		list.add(new TextComponent("-Increases damage against boss enemies."));
	}
}

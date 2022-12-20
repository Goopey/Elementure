
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

public class CometcrownItem extends Item {
	public CometcrownItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_SKILLWINDOW).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Artifact : Slightly increases your speed."));
		list.add(new TextComponent("Slowly generates light essence."));
		list.add(new TextComponent("Increases the base amount of light essence one carries."));
		list.add(new TextComponent("Improves Comets."));
	}
}

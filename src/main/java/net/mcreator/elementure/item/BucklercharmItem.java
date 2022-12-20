
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class BucklercharmItem extends Item {
	public BucklercharmItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_SKILLWINDOW).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Relic : Buckler charms, protecting shield of the people."));
		list.add(new TextComponent("Note : Use this shield in conjunction with the Knights charm to unlock the full parry ability."));
		list.add(new TextComponent("Take no damage when \"blocking\" an attack."));
		list.add(new TextComponent("This only works with swords."));
		list.add(new TextComponent("You can't have a shield in your off-hand."));
	}
}

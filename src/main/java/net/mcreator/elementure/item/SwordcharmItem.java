
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class SwordcharmItem extends Item {
	public SwordcharmItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_SKILLWINDOW).stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Relic : Knight charms, vengeful sword of the people."));
		list.add(Component.literal("Note : Use this sword in conjunction with the Knights charm to unlock the full parry ability."));
		list.add(Component.literal("Deal more damage after \"blocking\" an attack."));
		list.add(Component.literal("This only works with swords."));
		list.add(Component.literal("You can't have a shield in your off-hand."));
	}
}

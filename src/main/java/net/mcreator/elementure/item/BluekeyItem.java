
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.BluekeySpawnProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class BluekeyItem extends Item {
	public BluekeyItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_FORGOTTENSPECIALITEMS_TAB).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A7l\u00A71A super-rare key. It trembles with energy, what might you be able to do with it?"));
		list.add(new TextComponent("WIP ITEM. You can use it, but it hasn't been fully implemented yet."));
		list.add(new TextComponent("\u00A7ksee you later"));
		list.add(new TextComponent("\u00A7ksonic and knuckles on the sega genesis"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		BluekeySpawnProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}

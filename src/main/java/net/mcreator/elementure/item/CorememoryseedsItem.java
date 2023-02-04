
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

import net.mcreator.elementure.procedures.CorememoryseedsPlantProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class CorememoryseedsItem extends Item {
	public CorememoryseedsItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_FORGOTTEN_ITEMS_TAB).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("A seed used to harvest core memories."));
		list.add(new TextComponent("-Grows on cobblestone"));
		list.add(new TextComponent("-Water helps"));
		list.add(new TextComponent("-Mossy cobblestone helps"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		CorememoryseedsPlantProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}


package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.MemoryseedsPlantProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class MemoryseedsItem extends Item {
	public MemoryseedsItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_FORGOTTEN_ITEMS_TAB).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("A seed used to harvest memories."));
		list.add(Component.literal("-Grows on cobblestone"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MemoryseedsPlantProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}

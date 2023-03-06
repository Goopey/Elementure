
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

import net.mcreator.elementure.procedures.GlassbellboatSummonProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class GlassbellboatItem extends Item {
	public GlassbellboatItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDITEMS).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal(
				"The hull of the ship is simply made out of the lightweight, unrefined and tough diver's stone, which paired with the diver's alloy, the glass dome, the glass light on the back and the diver's alloy apparatus allows it to dive endlessly and to provide a great experience to any user."));
		list.add(Component.literal("Also has small guns to get rid of small foes. Unfortunately, they just spray burning stuff around."));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		GlassbellboatSummonProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}

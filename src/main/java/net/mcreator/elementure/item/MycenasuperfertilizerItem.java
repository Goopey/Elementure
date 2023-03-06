
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

import net.mcreator.elementure.procedures.MycenasuperfertilizerSummonMycenaShroomlordProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class MycenasuperfertilizerItem extends Item {
	public MycenasuperfertilizerItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDBOSS).stacksTo(16).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Boss item : It's a mushroom surrounded with so much bone-meal, it's sure to grow to huge proportions as soon as you plant it."));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		MycenasuperfertilizerSummonMycenaShroomlordProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}

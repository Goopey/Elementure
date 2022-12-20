
package net.mcreator.elementure.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

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

import net.mcreator.elementure.procedures.ArmageddonRightClickedOnBlockProcedure;

import java.util.List;

public class ArmageddonItem extends Item {
	public ArmageddonItem() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"IMPORTANT : This item better be used in the overworld or the result might not be favorable... If you wish to obtain the Abyss Heart, do so at your own peril..."));
		list.add(new TextComponent("Using this item might cause some damage..."));
		list.add(new TextComponent("Proceed anyway?"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ArmageddonRightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getZ(),
				context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}

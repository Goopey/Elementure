
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
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.SignofinfectionSummonProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class SignofinfectionItem extends Item {
	public SignofinfectionItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDBOSS).stacksTo(1).rarity(Rarity.COMMON));
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
		list.add(Component.literal("Calls forth from the ground impure bacterium..."));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		SignofinfectionSummonProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}

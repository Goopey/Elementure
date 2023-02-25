
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.VamiteingotSlowProcedure;
import net.mcreator.elementure.procedures.VamiteQuickenProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class VamiteingotItem extends Item {
	public VamiteingotItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDORE).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("You feel faster"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			VamiteQuickenProcedure.execute(entity, itemstack);
		VamiteingotSlowProcedure.execute(entity, itemstack);
	}
}

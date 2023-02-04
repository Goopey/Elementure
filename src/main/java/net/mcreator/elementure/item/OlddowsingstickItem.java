
package net.mcreator.elementure.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.procedures.OlddowsingstickReduceDurabilityProcedure;
import net.mcreator.elementure.procedures.DowsingdetectMobsProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class OlddowsingstickItem extends Item {
	public OlddowsingstickItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_FORGOTTEN_ITEMS_TAB).durability(400).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		Entity entity = Minecraft.getInstance().player;
		return DowsingdetectMobsProcedure.execute(entity.level, entity);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("-\"It's a bent stick.\""));
		list.add(new TextComponent("-\"It's not just a stick, it's a friend!\""));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			OlddowsingstickReduceDurabilityProcedure.execute(world, entity, itemstack);
	}
}

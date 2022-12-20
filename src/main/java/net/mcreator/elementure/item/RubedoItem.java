
package net.mcreator.elementure.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class RubedoItem extends Item {
	public RubedoItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_SKILLWINDOW).stacksTo(1).rarity(Rarity.EPIC));
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
		list.add(new TextComponent("Artifact : Heart of the Nether."));
		list.add(new TextComponent("The world is just a canvas you can set fire to."));
		list.add(new TextComponent("You gain rage over time. The lower your health is, the more rage you get. *You lose rage at max health."));
		list.add(new TextComponent("Use rage to burn your foes until nothing remains."));
	}
}

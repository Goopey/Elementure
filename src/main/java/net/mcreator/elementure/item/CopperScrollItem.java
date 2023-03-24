
package net.mcreator.elementure.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.WeaponArtScrollShineProcedure;
import net.mcreator.elementure.procedures.WeaponArtDescriptionReturnProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class CopperScrollItem extends Item {
	public CopperScrollItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDEDITEMS).stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return WeaponArtScrollShineProcedure.execute(itemstack);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("The cylinder may seem unassuming, but it hides something golden within."));
		String weaponArtText = WeaponArtDescriptionReturnProcedure.execute(itemstack);
		if (weaponArtText.isEmpty()) {
			list.add(Component.literal("Used to store away Weapon Arts."));
		} else {
			String[] parts = weaponArtText.split("*");
			for (int i = 0; i < parts.length; i++) {
				list.add(Component.literal(parts[i]));
			}
		}
	}
}

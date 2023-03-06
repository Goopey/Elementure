
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.CookedgoldenchubEffectProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class CookedGoldenchubItem extends Item {
	public CookedGoldenchubItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDDEDFOOD).stacksTo(64).rarity(Rarity.UNCOMMON).food((new FoodProperties.Builder()).nutrition(6).saturationMod(2.4f)

				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A76A cooked golden chub, which enhances the haste effect provided."));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CookedgoldenchubEffectProcedure.execute(entity);
		return retval;
	}
}

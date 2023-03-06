
package net.mcreator.elementure.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.procedures.RedstonefishHealthbuffProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

import java.util.List;

public class RedstonefishItem extends Item {
	public RedstonefishItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_FISHINGTAB).stacksTo(64).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.3f).alwaysEat().meat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("A very healthy fish. Maybe if you ate some, you would be too?"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		RedstonefishHealthbuffProcedure.execute(entity);
		return retval;
	}
}


package net.mcreator.elementure.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;

import net.mcreator.elementure.procedures.DiversberryPlaceProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

public class DiversberryItem extends Item {
	public DiversberryItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_TABMODDDEDFOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.8f)

				.build()));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		DiversberryPlaceProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}

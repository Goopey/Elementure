
package net.mcreator.elementure.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.elementure.procedures.CursedmemoryseedsPlantProcedure;
import net.mcreator.elementure.init.ElementureModTabs;

public class CursedforgottenseedsItem extends Item {
	public CursedforgottenseedsItem() {
		super(new Item.Properties().tab(ElementureModTabs.TAB_FORGOTTEN_ITEMS_TAB).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		CursedmemoryseedsPlantProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}

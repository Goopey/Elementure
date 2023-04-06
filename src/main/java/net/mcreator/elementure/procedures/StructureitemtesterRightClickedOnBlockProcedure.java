package net.mcreator.elementure.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;

public class StructureitemtesterRightClickedOnBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double LocalX = 0;
		double LocalZ = 0;
		ItemStack book = ItemStack.EMPTY;
		book = new ItemStack(ElementureModItems.COPPER_SCROLL.get());
		book.getOrCreateTag().putString("weaponArtName", "chop");
		if (entity instanceof Player _player) {
			ItemStack _setstack = book;
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}

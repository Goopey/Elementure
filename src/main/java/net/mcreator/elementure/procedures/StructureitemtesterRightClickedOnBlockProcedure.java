package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

import net.mcreator.elementure.ElementureMod;

public class StructureitemtesterRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double LocalX = 0;
		double LocalZ = 0;
		ItemStack book = ItemStack.EMPTY;
		ElementureMod.queueServerWork(10, () -> {
			AngelfishChannelerBallProcedure.execute(world, (x - 3), y, z);
		});
	}
}

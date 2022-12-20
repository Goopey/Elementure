package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class GreenslimeturfSpreadDecoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.125) {
			if (Math.random() < 0.7) {
				world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.GREENSLIMESPROUT.get().defaultBlockState(), 3);
			} else if (Math.random() < 0.7) {
				world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.GREENSLIMEFOL.get().defaultBlockState(), 3);
			} else if (Math.random() < 0.15) {
				JellypoolRandomGenProcedure.execute(world, x, y, z);
			}
		}
	}
}

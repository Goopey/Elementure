package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class RuingranitePlatformGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double locXMax = 0;
		double locZMax = 0;
		double platSize = 0;
		double platLimit = 0;
		double xLimit = 0;
		double zLimit = 0;
		double locXMin = 0;
		double locZMin = 0;
		locXMax = Math.round(2 + Math.random() * 2);
		locZMax = Math.round(2 + Math.random() * 2);
		locXMin = (-1) * locXMax;
		locZMin = (-1) * locZMax;
		locX = locXMin;
		locZ = locZMin;
		if (locXMax >= locZMax) {
			platLimit = locXMax * locXMax;
		} else {
			platLimit = locZMax * locZMax;
		}
		xLimit = Math.round(4 / locXMax);
		zLimit = Math.round(4 / locZMax);
		for (int index0 = 0; index0 < (int) (100); index0++) {
			if ((locX * locX) / xLimit + (locZ * locZ) / zLimit <= platLimit) {
				world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.POLISHEDRUINGRANITE.get().defaultBlockState(), 3);
			}
			locX = locX + 1;
			if (locX >= locXMax) {
				locX = locXMin;
				locZ = locZ + 1;
				if (locZ >= locZMax) {
					locX = locXMin;
					locZ = locZMin;
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.POLISHEDRUINGRANITE.get().defaultBlockState(), 3);
	}
}

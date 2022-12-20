package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class CrystalPalaceBoxSidesGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double repeatTimes = 0;
		double rad2 = 0;
		double platRndX = 0;
		double platRndZ = 0;
		locX = -30;
		locY = -14;
		locZ = -30;
		repeatTimes = (locX * (-2) + 1) * (locY * (-2) + 1) * (locZ * (-2) + 1);
		rad2 = locX * locX * 1.33;
		platRndX = Math.random() * 2 + 1;
		platRndZ = Math.random() * 2 + 1;
		for (int index0 = 0; index0 < (int) (repeatTimes); index0++) {
			if (Math.abs(locX) == 30 || Math.abs(locY) == 14 || Math.abs(locZ) == 30) {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.CRYSTALPALACESKY.get().defaultBlockState(), 3);
			} else if (locX * locX * platRndX + locZ * locZ * platRndZ < rad2 && locY < -2) {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), Blocks.CALCITE.defaultBlockState(), 3);
			} else if (locY < -12) {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), Blocks.AIR.defaultBlockState(), 3);
			}
			locX = locX + 1;
			if (locX > 30) {
				locX = -30;
				locY = locY + 1;
				if (locY > 14) {
					locX = -30;
					locY = -14;
					locZ = locZ + 1;
					if (locZ > 30) {
						locX = -30;
						locY = -14;
						locZ = -30;
					}
				}
			}
		}
	}
}

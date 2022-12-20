package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DiverscrownlilypadSmallRootProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double xOff = 0;
		double zOff = 0;
		locX = -1;
		locY = -1;
		locZ = -1;
		xOff = Math.random() * 4 - 2;
		zOff = Math.random() * 4 - 2;
		for (int index0 = 0; index0 < (int) (27); index0++) {
			if (locX * locX + locY * locY + locZ * locZ <= 1) {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.LILYPADLOG_FULL.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + locX + xOff, y + locY + 2, z + locZ + zOff),
						ElementureModBlocks.LILYPADLOG_FULL.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + locX + xOff * 2, y + locY + 4, z + locZ + zOff * 2),
						ElementureModBlocks.LILYPADLOG_FULL.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + locX + xOff * 3, y + locY + 6, z + locZ + zOff * 3),
						ElementureModBlocks.LILYPADLOG_FULL.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + locX + xOff * 3, y + locY + 8, z + locZ + zOff * 3),
						ElementureModBlocks.LILYPADLOG_FULL.get().defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + locX + xOff * 3, y + locY + 10, z + locZ + zOff * 3),
						ElementureModBlocks.LILYPADLOG_FULL.get().defaultBlockState(), 3);
			}
			locX = locX + 1;
			if (locX > 1) {
				locX = -1;
				locZ = locZ + 1;
				if (locZ > 1) {
					locX = -1;
					locY = locY + 1;
					locZ = -1;
					if (locY > 1) {
						locX = -1;
						locY = -1;
						locZ = -1;
					}
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DiverscrownMainRootProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		locX = -12;
		locY = -9;
		locZ = -12;
		for (int index0 = 0; index0 < (int) (11875); index0++) {
			if (locX * locX + locY * locY * 2 + locZ * locZ < 144) {
				if (locY > 2 && Math.random() < 0.03) {
					DiverscrownlilypadSmallRootProcedure.execute(world, (x + locX), (y + locY), (z + locZ));
				} else if (locY < 3 && Math.random() < 0.0025) {
					DiverscrownBottomRootsProcedure.execute(world, (x + locX), (y + locY), (z + locZ));
				}
				if (Math.random() < 0.002) {
					if (Math.random() < 0.05) {
						world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.RAREGLASSLIGHT.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.GLASSLIGHT.get().defaultBlockState(), 3);
					}
				} else {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.LILYPADLOG_FULL.get().defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 12) {
				locX = -12;
				locY = locY + 1;
				if (locY > 9) {
					locX = -12;
					locY = -9;
					locZ = locZ + 1;
					if (locZ > 12) {
						locX = -12;
						locY = -9;
						locZ = -12;
					}
				}
			}
		}
	}
}

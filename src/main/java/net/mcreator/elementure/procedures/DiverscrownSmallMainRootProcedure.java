package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DiverscrownSmallMainRootProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		locX = -10;
		locY = -7;
		locZ = -10;
		for (int index0 = 0; index0 < (int) (6615); index0++) {
			if (locX * locX + locY * locY * 2 + locZ * locZ < 100) {
				if (locY > 2 && Math.random() < 0.03) {
					DiverscrownlilypadSmallRootProcedure.execute(world, (x + locX), (y + locY), (z + locZ));
				} else if (locY < 3 && Math.random() < 0.0055) {
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
			if (locX > 10) {
				locX = -10;
				locY = locY + 1;
				if (locY > 7) {
					locX = -10;
					locY = -7;
					locZ = locZ + 1;
					if (locZ > 10) {
						locX = -10;
						locY = -7;
						locZ = -10;
					}
				}
			}
		}
	}
}

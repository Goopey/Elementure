package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DeepruinsRoadGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double locY = 0;
		boolean wasBuried = false;
		locX = -2;
		locZ = -2;
		for (int index0 = 0; index0 < (int) (25); index0++) {
			if (locX * locX + locZ * locZ < 8) {
				locY = y;
				if (world.getBlockState(new BlockPos(x + locX, locY, z + locZ)).canOcclude()) {
					while (world.getBlockState(new BlockPos(x + locX, locY, z + locZ)).canOcclude() && locY < 12) {
						locY = locY + 1;
					}
					if (locY <= 11) {
						world.setBlock(new BlockPos(x + locX, locY - 1, z + locZ), Blocks.DEEPSLATE_TILES.defaultBlockState(), 3);
					}
				} else {
					while (!world.getBlockState(new BlockPos(x + locX, locY, z + locZ)).canOcclude() && locY > -64) {
						locY = locY - 1;
					}
					if (locY >= -63) {
						world.setBlock(new BlockPos(x + locX, locY, z + locZ), Blocks.DEEPSLATE_TILES.defaultBlockState(), 3);
					}
				}
			}
			locX = locX + 1;
			if (locX >= 2) {
				locX = -2;
				locZ = locZ + 1;
				if (locZ >= 2) {
					locX = -2;
					locZ = -2;
				}
			}
		}
	}
}

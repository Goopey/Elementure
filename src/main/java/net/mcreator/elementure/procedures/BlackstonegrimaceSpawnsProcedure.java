package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BlackstonegrimaceSpawnsProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		boolean shouldSpawn = false;
		locX = -1;
		locY = -1;
		locZ = -1;
		for (int index0 = 0; index0 < (int) (27); index0++) {
			if ((world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == Blocks.BLACKSTONE || (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == Blocks.BASALT) {
				shouldSpawn = true;
			}
			locX = locX + 1;
			if (locX >= 1) {
				locX = -1;
				locZ = locZ + 1;
				if (locZ >= 1) {
					locX = -1;
					locY = locY + 1;
					locZ = -1;
					if (locY >= 1) {
						locX = -1;
						locY = -1;
						locZ = -1;
					}
				}
			}
		}
		return shouldSpawn;
	}
}

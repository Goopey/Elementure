package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class UndergroundbiomeBubbleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		locX = -3;
		locY = -3;
		locZ = -3;
		for (int index0 = 0; index0 < (int) (343); index0++) {
			if (locX * locX + locY * locY + locZ * locZ < 9) {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), Blocks.AIR.defaultBlockState(), 3);
			}
			locX = locX + 1;
			if (locX >= 3) {
				locX = -3;
				locZ = locZ + 1;
				if (locZ >= 3) {
					locX = -3;
					locY = locY + 1;
					locZ = -3;
					if (locY >= 3) {
						locX = -3;
						locY = -3;
						locZ = -3;
					}
				}
			}
		}
	}
}

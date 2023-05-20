package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class TestprocedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean e = false;
		double lol = 0;
		double lolY = 0;
		double lolZ = 0;
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		double numLogs = 0;
		double num = 0;
		double repeatTimes = 0;
		double locZ = 0;
		double rad2 = 0;
		double locX = 0;
		double locY = 0;
		locX = -60;
		locY = -60;
		locZ = -60;
		repeatTimes = (locX * (-2) + 1) * (locY * (-2) + 1) * (locZ * (-2) + 1);
		rad2 = locX * locX;
		for (int index0 = 0; index0 < (int) (repeatTimes); index0++) {
			if (locX * locX + locY * locY + locZ * locZ < rad2) {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), Blocks.STONE.defaultBlockState(), 3);
			}
			locX = locX + 1;
			if (locX > 60) {
				locX = -60;
				locY = locY + 1;
				if (locY > 60) {
					locX = -60;
					locY = -60;
					locZ = locZ + 1;
					if (locZ > 60) {
						locX = -60;
						locY = -60;
						locZ = -60;
					}
				}
			}
		}
	}
}

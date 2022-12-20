package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BabystarGenAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		CoordsX = -3;
		CoordsY = -3;
		CoordsZ = -3;
		for (int index0 = 0; index0 < (int) (343); index0++) {
			if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 9) {
				if (y + CoordsY > 0) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 3) {
				CoordsX = -3;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 3) {
					CoordsX = -3;
					CoordsY = CoordsY + 1;
					CoordsZ = -3;
					if (CoordsY == 3) {
						CoordsX = -3;
						CoordsY = -3;
						CoordsZ = -3;
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BabystarGenAirBigProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsZ = 0;
		double CoordsX = 0;
		double CoordsY = 0;
		CoordsX = -4;
		CoordsY = -4;
		CoordsZ = -4;
		for (int index0 = 0; index0 < (int) (729); index0++) {
			if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 16) {
				if (y + CoordsY > 0) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 4) {
				CoordsX = -4;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 4) {
					CoordsX = -4;
					CoordsY = CoordsY + 1;
					CoordsZ = -4;
					if (CoordsY == 4) {
						CoordsX = -4;
						CoordsY = -4;
						CoordsZ = -4;
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}

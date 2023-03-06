package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenadepthsgroundmossgenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		boolean YUsed = false;
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.MYCENIUMMOSS.get().defaultBlockState(), 3);
		CoordsX = -3;
		CoordsY = -7;
		CoordsZ = -3;
		for (int index0 = 0; index0 < (int) (735); index0++) {
			if (YUsed == false && (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.AIR && world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ)).canOcclude()) {
				world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.MYCENIUMMOSS.get().defaultBlockState(), 3);
				YUsed = true;
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 3) {
				CoordsX = -3;
				CoordsY = CoordsY + 1;
				if (CoordsY == 7) {
					YUsed = false;
					CoordsX = -3;
					CoordsY = -7;
					CoordsZ = CoordsZ + 1;
					if (CoordsZ == 3) {
						CoordsX = -3;
						CoordsY = -7;
						CoordsZ = -3;
					}
				}
			}
		}
	}
}

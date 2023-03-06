package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class SunturfspreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		if (world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude() && Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.ACTIVENETHERUM.get().defaultBlockState(), 3);
		}
		if (Math.random() < 0.00041) {
			CoordsX = -2;
			CoordsY = -2;
			CoordsZ = -2;
			for (int index0 = 0; index0 < (int) (125); index0++) {
				if (4 * CoordsY * CoordsY + CoordsX * CoordsX + CoordsZ * CoordsZ < 4
						&& ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.ACTIVENETHERUM.get()
								|| (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.ACTIVENETHERUMSHINY.get())
						&& !world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ)).canOcclude()) {
					if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.ACTIVENETHERUMSHINY.get()) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ), ElementureModBlocks.SPARKLINGSTARS.get().defaultBlockState(), 3);
					}
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.SUNTURFBLOCK.get().defaultBlockState(), 3);
				}
				CoordsX = CoordsX + 1;
				if (CoordsX == 2) {
					CoordsX = -2;
					CoordsZ = CoordsZ + 1;
					if (CoordsZ == 2) {
						CoordsX = -2;
						CoordsZ = -2;
						CoordsY = CoordsY + 1;
						if (CoordsY == 2) {
							CoordsX = -2;
							CoordsZ = -2;
							CoordsY = -2;
						}
					}
				}
			}
		}
	}
}

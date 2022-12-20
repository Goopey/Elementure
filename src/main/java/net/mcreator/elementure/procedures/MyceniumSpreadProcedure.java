package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MyceniumSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.MYCENAVINE.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.MYCENASPROUTS.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get())
				&& Math.random() < 0.024) {
			world.setBlock(new BlockPos(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
		}
		CoordsX = -4;
		CoordsY = -4;
		CoordsZ = -4;
		for (int index0 = 0; index0 < (int) (729); index0++) {
			if (16 * CoordsY * CoordsY + CoordsX * CoordsX + CoordsZ * CoordsZ < 16
					&& (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.DIRT
					&& ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ)))
									.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get()
							|| (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ)))
									.getBlock() == ElementureModBlocks.MYCENAVINE.get()
							|| (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ)))
									.getBlock() == ElementureModBlocks.MYCENASPROUTS.get())
					&& Math.random() < 0.000081) {
				world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.MYCENIUM.get().defaultBlockState(), 3);
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 4) {
				CoordsX = -4;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 4) {
					CoordsX = -4;
					CoordsZ = -4;
					CoordsY = CoordsY + 1;
					if (CoordsY == 4) {
						CoordsX = -4;
						CoordsZ = -4;
						CoordsY = -4;
					}
				}
			}
		}
	}
}

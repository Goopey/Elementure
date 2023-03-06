package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MycenaRoofReliefGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsZ = 0;
		double CoordsY = 0;
		CoordsX = -3;
		CoordsZ = -3;
		CoordsY = -6;
		for (int index0 = 0; index0 < (int) (324); index0++) {
			if (!(CoordsX < -2) && !(CoordsZ < -2) && !(CoordsX > 2) && !(CoordsZ < -2) && !(CoordsX < -2) && !(CoordsZ > 2) && !(CoordsX > 2) && !(CoordsZ > 2)) {
				if (CoordsX == 3 || CoordsX == -3 || CoordsZ == -3 || CoordsZ == 3) {
					if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.AIR && !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ))).getBlock() == Blocks.AIR)) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.STONE.defaultBlockState(), 3);
						if (Math.random() < 0.006) {
							RoofreliefMycenaDepthsDecorationProcedure.execute(world, (x + CoordsX), ((y + CoordsY) - 1), (z + CoordsZ));
						}
						if (CoordsY <= -4) {
							world.setBlock(new BlockPos(x, y - 1, z), Blocks.STONE.defaultBlockState(), 3);
						}
					}
				} else if (CoordsX == 2 || CoordsX == -2 || CoordsZ == 2 || CoordsZ == -2) {
					if (CoordsY >= -4) {
						if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.AIR && !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ))).getBlock() == Blocks.AIR)) {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.STONE.defaultBlockState(), 3);
							if (Math.random() < 0.006) {
								RoofreliefMycenaDepthsDecorationProcedure.execute(world, (x + CoordsX), ((y + CoordsY) - 1), (z + CoordsZ));
							}
							if (CoordsY <= -3) {
								world.setBlock(new BlockPos(x, y - 1, z), Blocks.STONE.defaultBlockState(), 3);
							}
						}
					}
				} else if (CoordsX == 1 || CoordsX == -1 || CoordsZ == 1 || CoordsZ == -1) {
					if (CoordsY >= -2) {
						if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.AIR && !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ))).getBlock() == Blocks.AIR)) {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.STONE.defaultBlockState(), 3);
							if (Math.random() < 0.006) {
								RoofreliefMycenaDepthsDecorationProcedure.execute(world, (x + CoordsX), ((y + CoordsY) - 1), (z + CoordsZ));
							}
						}
					}
				} else {
					if (CoordsY >= -2) {
						if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.AIR && !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ))).getBlock() == Blocks.AIR)) {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.STONE.defaultBlockState(), 3);
							if (Math.random() < 0.006) {
								RoofreliefMycenaDepthsDecorationProcedure.execute(world, (x + CoordsX), ((y + CoordsY) - 1), (z + CoordsZ));
							}
						}
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 3) {
				CoordsX = -3;
				CoordsY = CoordsY + 1;
				if (CoordsY == 2) {
					CoordsX = -3;
					CoordsY = -6;
					CoordsZ = CoordsZ + 1;
					if (CoordsZ == 3) {
						CoordsX = -3;
						CoordsY = -6;
						CoordsZ = -3;
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), Blocks.STONE.defaultBlockState(), 3);
	}
}

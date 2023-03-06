package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class WindyshoresIslandGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double quadM = 0;
		double quad1 = 0;
		double quad2 = 0;
		double quad3 = 0;
		double quad4 = 0;
		boolean canPlace = false;
		locX = -18;
		locZ = -18;
		for (int index0 = 0; index0 < (int) (1369); index0++) {
			if (locX * locX + locZ * locZ < 324 && world.isEmptyBlock(new BlockPos(x + locX, y, z + locZ))
					&& (world.isEmptyBlock(new BlockPos(x + locX, y - 1, z + locZ)) || (world.getBlockState(new BlockPos(x + locX, y - 1, z + locZ))).getBlock() == ElementureModBlocks.CLOUDBLOCK.get())) {
				world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.CLOUDBLOCK.get().defaultBlockState(), 3);
			}
			locX = locX + 1;
			if (locX >= 18) {
				locX = -18;
				locZ = locZ + 1;
				if (locZ >= 18) {
					locX = -18;
					locZ = -18;
				}
			}
		}
		quadM = 1 + Math.random() * 3;
		quad1 = quadM + Math.random() * 1.5 + 0.5;
		quad2 = quadM + Math.random() * 1.5 + 0.5;
		quad3 = quadM + Math.random() * 1.5 + 0.5;
		quad4 = quadM + Math.random() * 1.5 + 0.5;
		locX = -20;
		locY = -5;
		locZ = -20;
		for (int index1 = 0; index1 < (int) (35301); index1++) {
			if (locX < 0 && locZ < 0) {
				if (quad1 * locX * locX + quad1 * locZ * locZ + Math.abs(5 * locY * locY * locY) < 400) {
					canPlace = true;
				}
			} else if (locX >= 0 && locZ < 0) {
				if (quad2 * locX * locX + quad2 * locZ * locZ + Math.abs(5 * locY * locY * locY) < 400) {
					canPlace = true;
				}
			} else if (locX >= 0 && locZ >= 0) {
				if (quad3 * locX * locX + quad3 * locZ * locZ + Math.abs(5 * locY * locY * locY) < 400) {
					canPlace = true;
				}
			} else {
				if (quad4 * locX * locX + quad4 * locZ * locZ + Math.abs(5 * locY * locY * locY) < 400) {
					canPlace = true;
				}
			}
			if (canPlace) {
				if (locY <= -2 && (world.isEmptyBlock(new BlockPos(x + locX, y + locY + 1, z + locZ)) || (world.getBlockState(new BlockPos(x + locX, y + locY + 1, z + locZ))).getBlock() == ElementureModBlocks.CLOUDBLOCK.get())) {
					world.setBlock(new BlockPos(x + locX, y + locY + 1, z + locZ), Blocks.STONE.defaultBlockState(), 3);
				} else if (locY == 1 && (world.isEmptyBlock(new BlockPos(x + locX, y + locY, z + locZ)) || (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == ElementureModBlocks.CLOUDBLOCK.get())) {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.CLOUDSAND.get().defaultBlockState(), 3);
				} else if (locY >= 3 && (world.isEmptyBlock(new BlockPos(x + locX, (y + locY) - 1, z + locZ)) || (world.getBlockState(new BlockPos(x + locX, (y + locY) - 1, z + locZ))).getBlock() == ElementureModBlocks.CLOUDBLOCK.get())) {
					if (Math.random() < 0.012) {
						WindyshoresIslandDecorationProcedure.execute(world, (x + locX), ((y + locY) - 1), (z + locZ));
					}
					world.setBlock(new BlockPos(x + locX, (y + locY) - 1, z + locZ), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
				}
			}
			canPlace = false;
			locX = locX + 1;
			if (locX >= 20) {
				locX = -20;
				locZ = locZ + 1;
				if (locZ >= 20) {
					locX = -20;
					locY = locY + 1;
					locZ = -20;
					if (locY >= 15) {
						locX = -20;
						locY = -5;
						locZ = -20;
					}
				}
			}
		}
		BeachstarsSpreadProcedure.execute(world, (x + Math.random() * 10 - 5), (y + 3), (z + Math.random() * 10 - 5));
	}
}

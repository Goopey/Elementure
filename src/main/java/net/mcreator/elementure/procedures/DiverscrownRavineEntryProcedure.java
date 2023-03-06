package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DiverscrownRavineEntryProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double factorOne = 0;
		double factorTwo = 0;
		double largeness = 0;
		factorOne = Math.random() * 2.5;
		factorTwo = Math.random() * 5 - 2.5;
		locX = -8;
		locZ = -8;
		largeness = 1 + Math.round(Math.random() * 3);
		if (Math.random() < 0.5) {
			for (int index0 = 0; index0 < (int) (289); index0++) {
				if ((locX * factorOne + locX * factorTwo) - locZ < Math.abs(largeness - locX) && (locX * factorOne + locX * factorTwo) - locZ > 0) {
					if ((world.getBlockState(new BlockPos(x + locX, y - 4, z + locZ))).getBlock() == ElementureModBlocks.LILYPADBLOCK.get()
							|| (world.getBlockState(new BlockPos(x + locX, y - 4, z + locZ))).getBlock() == ElementureModBlocks.LILYPADRIMBLOCK.get()) {
						world.setBlock(new BlockPos(x + locX, y - 1, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 2, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 3, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 4, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 5, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 6, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 7, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 8, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 9, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 10, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						if (DiverscrownravineCanWaterPlaceProcedure.execute(world, x + locX, y, z + locZ)) {
							world.setBlock(new BlockPos(x + locX, y, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						}
					}
				}
				locX = locX + 1;
				if (locX > 8) {
					locX = -8;
					locZ = locZ + 1;
					if (locZ > 8) {
						locX = -8;
						locZ = -8;
					}
				}
			}
		} else {
			for (int index1 = 0; index1 < (int) (289); index1++) {
				if ((locZ * factorOne + locZ * factorTwo) - locX < Math.abs(largeness - locZ) && (locZ * factorOne + locZ * factorTwo) - locX > 0) {
					if ((world.getBlockState(new BlockPos(x + locX, y - 4, z + locZ))).getBlock() == ElementureModBlocks.LILYPADBLOCK.get()
							|| (world.getBlockState(new BlockPos(x + locX, y - 4, z + locZ))).getBlock() == ElementureModBlocks.LILYPADRIMBLOCK.get()) {
						world.setBlock(new BlockPos(x + locX, y - 1, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 2, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 3, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 4, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 5, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 6, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 7, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 8, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 9, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, y - 10, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						if (DiverscrownravineCanWaterPlaceProcedure.execute(world, x + locX, y, z + locZ)) {
							world.setBlock(new BlockPos(x + locX, y, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						}
					}
				}
				locX = locX + 1;
				if (locX > 8) {
					locX = -8;
					locZ = locZ + 1;
					if (locZ > 8) {
						locX = -8;
						locZ = -8;
					}
				}
			}
		}
	}
}

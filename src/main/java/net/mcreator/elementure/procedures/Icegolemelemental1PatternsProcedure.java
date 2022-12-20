package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class Icegolemelemental1PatternsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double localY = 0;
		double localX = 0;
		double localZ = 0;
		if (Math.random() < 0.0007) {
			for (int index0 = 0; index0 < (int) (Math.random() * 4); index0++) {
				localX = Math.random() * 3;
				localZ = Math.random() * 3;
				if (Math.random() < 0.25) {
					if ((world.getBlockState(new BlockPos(x + localX, y + 1, z + localZ))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x + localX, y + 1, z + localZ), ElementureModBlocks.ICEMINE.get().defaultBlockState(), 3);
					}
				} else if (Math.random() < 0.5 && Math.random() > 0.25) {
					if ((world.getBlockState(new BlockPos(x - localX, y + 1, z + localZ))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x - localX, y + 1, z + localZ), ElementureModBlocks.ICEMINE.get().defaultBlockState(), 3);
					}
				} else if (Math.random() < 0.75 && Math.random() > 0.5) {
					if ((world.getBlockState(new BlockPos(x - localX, y + 1, z - localZ))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x - localX, y + 1, z - localZ), ElementureModBlocks.ICEMINE.get().defaultBlockState(), 3);
					}
				} else {
					if ((world.getBlockState(new BlockPos(x + localX, y + 1, z - localZ))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x + localX, y + 1, z - localZ), ElementureModBlocks.ICEMINE.get().defaultBlockState(), 3);
					}
				}
			}
		}
		if (Math.random() > 0.9993) {
			for (int index1 = 0; index1 < (int) (7); index1++) {
				if ((world.getBlockState(new BlockPos(x, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE_5.get()
						|| (world.getBlockState(new BlockPos(x, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE_2.get()
						|| (world.getBlockState(new BlockPos(x, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE_4.get()
						|| (world.getBlockState(new BlockPos(x, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE_3.get()
						|| (world.getBlockState(new BlockPos(x, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE.get()) {
					world.setBlock(new BlockPos(x, y + localY, z), ElementureModBlocks.CRACKINGICE.get().defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y + localY, z))).getBlock() == Blocks.AIR
						&& ((world.getBlockState(new BlockPos(x, y + localY, z - 1))).getBlock() == ElementureModBlocks.CRACKINGICE_5.get()
								|| (world.getBlockState(new BlockPos(x, y + localY, z + 1))).getBlock() == ElementureModBlocks.CRACKINGICE_5.get()
								|| (world.getBlockState(new BlockPos(x + 1, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE_5.get()
								|| (world.getBlockState(new BlockPos(x - 1, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE_5.get()
								|| (world.getBlockState(new BlockPos(x, y + localY, z - 1))).getBlock() == ElementureModBlocks.CRACKINGICE_2.get()
								|| (world.getBlockState(new BlockPos(x, y + localY, z + 1))).getBlock() == ElementureModBlocks.CRACKINGICE_2.get()
								|| (world.getBlockState(new BlockPos(x + 1, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE_2.get()
								|| (world.getBlockState(new BlockPos(x - 1, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE_2.get()
								|| (world.getBlockState(new BlockPos(x, y + localY, z - 1))).getBlock() == ElementureModBlocks.CRACKINGICE.get()
								|| (world.getBlockState(new BlockPos(x, y + localY, z + 1))).getBlock() == ElementureModBlocks.CRACKINGICE.get()
								|| (world.getBlockState(new BlockPos(x + 1, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE.get()
								|| (world.getBlockState(new BlockPos(x - 1, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE.get()
								|| (world.getBlockState(new BlockPos(x, y + localY, z - 1))).getBlock() == ElementureModBlocks.CRACKINGICE_4.get()
								|| (world.getBlockState(new BlockPos(x, y + localY, z + 1))).getBlock() == ElementureModBlocks.CRACKINGICE_4.get()
								|| (world.getBlockState(new BlockPos(x + 1, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE_4.get()
								|| (world.getBlockState(new BlockPos(x - 1, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE_4.get()
								|| (world.getBlockState(new BlockPos(x, y + localY, z - 1))).getBlock() == ElementureModBlocks.CRACKINGICE_3.get()
								|| (world.getBlockState(new BlockPos(x, y + localY, z + 1))).getBlock() == ElementureModBlocks.CRACKINGICE_3.get()
								|| (world.getBlockState(new BlockPos(x + 1, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE_3.get()
								|| (world.getBlockState(new BlockPos(x - 1, y + localY, z))).getBlock() == ElementureModBlocks.CRACKINGICE_3.get())) {
					world.setBlock(new BlockPos(x, y + localY, z), ElementureModBlocks.CRACKINGICE.get().defaultBlockState(), 3);
				} else {
					localY = localY - 1;
				}
			}
		}
		world.setBlock(new BlockPos(x, y - 1, z), ElementureModBlocks.CRACKINGICE.get().defaultBlockState(), 3);
	}
}

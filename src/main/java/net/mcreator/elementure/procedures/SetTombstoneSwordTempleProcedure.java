package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class SetTombstoneSwordTempleProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double rnd = 0;
		double locY = 0;
		rnd = Math.random();
		locY = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z);
		world.setBlock(new BlockPos(x, locY, z), Blocks.POLISHED_ANDESITE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, locY + 1, z), Blocks.POLISHED_ANDESITE_SLAB.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, locY - 1, z), Blocks.POLISHED_ANDESITE.defaultBlockState(), 3);
		if (rnd < 0.25) {
			world.setBlock(new BlockPos(x + 1, locY - 1, z), Blocks.COARSE_DIRT.defaultBlockState(), 3);
			if (Math.random() < 0.125) {
				world.setBlock(new BlockPos(x + 1, locY, z), ElementureModBlocks.BURIEDRUSTYIRONSWORD_1.get().defaultBlockState(), 3);
			}
		} else if (rnd < 0.5) {
			world.setBlock(new BlockPos(x - 1, locY - 1, z), Blocks.COARSE_DIRT.defaultBlockState(), 3);
			if (Math.random() < 0.125) {
				world.setBlock(new BlockPos(x - 1, locY, z), ElementureModBlocks.BURIEDRUSTYIRONSWORD_1.get().defaultBlockState(), 3);
			}
		} else if (rnd < 0.75) {
			world.setBlock(new BlockPos(x, locY - 1, z - 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
			if (Math.random() < 0.125) {
				world.setBlock(new BlockPos(x, locY, z - 1), ElementureModBlocks.BURIEDRUSTYIRONSWORD_1.get().defaultBlockState(), 3);
			}
		} else {
			world.setBlock(new BlockPos(x, locY - 1, z + 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
			if (Math.random() < 0.125) {
				world.setBlock(new BlockPos(x, locY, z - 1), ElementureModBlocks.BURIEDRUSTYIRONSWORD_1.get().defaultBlockState(), 3);
			}
		}
	}
}

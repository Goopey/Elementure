package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.ElementureMod;

public class DiverscrownHillSideGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locY = 0;
		if (y > 14) {
			if (Math.random() < 0.005) {
				ElementureMod.queueServerWork(5, () -> {
					BoulderPatchGenProcedure.execute(world, x, y, z);
				});
			}
			locY = -3;
			while (!world.getBlockState(new BlockPos(x, y + locY, z)).canOcclude() && y + locY > 14) {
				world.setBlock(new BlockPos(x, y + locY, z), Blocks.STONE.defaultBlockState(), 3);
				locY = locY - 1;
			}
			world.setBlock(new BlockPos(x, y + locY, z), Blocks.STONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, (y + locY) - 1, z), Blocks.STONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, (y + locY) - 2, z), Blocks.STONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, (y + locY) - 3, z), Blocks.STONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, (y + locY) - 4, z), Blocks.STONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, (y + locY) - 5, z), Blocks.STONE.defaultBlockState(), 3);
			ElementureMod.queueServerWork(3, () -> {
				if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.STONE)) {
					world.setBlock(new BlockPos(x, y, z), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x, y - 1, z), Blocks.DIRT.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x, y - 2, z), Blocks.DIRT.defaultBlockState(), 3);
				}
			});
		}
	}
}

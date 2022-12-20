package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class CormunculusGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locY = 0;
		double CoordsY = 0;
		CoordsY = 3 + 3 * Math.random();
		world.setBlock(new BlockPos(x, y, z), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
		locY = 2;
		while (locY < CoordsY) {
			world.setBlock(new BlockPos(x, y + locY, z), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
			locY = locY + 1;
		}
		world.setBlock(new BlockPos(x - 1, y + locY, z - 1), ElementureModBlocks.CORMUNCULUSBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + locY, z), ElementureModBlocks.CORMUNCULUSBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + locY, z + 1), ElementureModBlocks.CORMUNCULUSBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + locY, z - 1), ElementureModBlocks.CORMUNCULUSBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + locY, z), ElementureModBlocks.CORMUNCULUSBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + locY, z + 1), ElementureModBlocks.CORMUNCULUSBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + locY, z - 1), ElementureModBlocks.CORMUNCULUSBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + locY, z), ElementureModBlocks.CORMUNCULUSBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + locY, z + 1), ElementureModBlocks.CORMUNCULUSBLOCK.get().defaultBlockState(), 3);
	}
}

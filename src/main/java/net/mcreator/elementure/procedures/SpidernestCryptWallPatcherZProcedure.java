package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SpidernestCryptWallPatcherZProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.7) {
			world.setBlock(new BlockPos(x, y, z), Blocks.DEEPSLATE_TILES.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y, z), Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), 3);
		}
		if (Math.random() < 0.7) {
			world.setBlock(new BlockPos(x, y, z + 1), Blocks.DEEPSLATE_TILES.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y, z + 1), Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), 3);
		}
		if (Math.random() < 0.7) {
			world.setBlock(new BlockPos(x, y, z - 1), Blocks.DEEPSLATE_TILES.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y, z - 1), Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), 3);
		}
		world.setBlock(new BlockPos(x, y + 1, z), Blocks.CHISELED_DEEPSLATE.defaultBlockState(), 3);
		if (Math.random() < 0.7) {
			world.setBlock(new BlockPos(x, y + 1, z + 1), Blocks.DEEPSLATE_TILES.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y + 1, z + 1), Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), 3);
		}
		if (Math.random() < 0.7) {
			world.setBlock(new BlockPos(x, y + 1, z - 1), Blocks.DEEPSLATE_TILES.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y + 1, z - 1), Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), 3);
		}
		if (Math.random() < 0.7) {
			world.setBlock(new BlockPos(x, y + 2, z), Blocks.DEEPSLATE_TILES.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y + 2, z), Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), 3);
		}
		if (Math.random() < 0.7) {
			world.setBlock(new BlockPos(x, y + 2, z + 1), Blocks.DEEPSLATE_TILES.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y + 2, z + 1), Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), 3);
		}
		if (Math.random() < 0.7) {
			world.setBlock(new BlockPos(x, y + 2, z - 1), Blocks.DEEPSLATE_TILES.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y + 2, z - 1), Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), 3);
		}
	}
}

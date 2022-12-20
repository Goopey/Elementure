package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SwordtempleWallPatcherXProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 1, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + 1, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SwordtempleWallPatcherZSecretProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), Blocks.ANDESITE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z + 1), Blocks.ANDESITE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z - 1), Blocks.ANDESITE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z), Blocks.POLISHED_ANDESITE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z + 1), Blocks.POLISHED_ANDESITE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z - 1), Blocks.POLISHED_ANDESITE.defaultBlockState(), 3);
	}
}

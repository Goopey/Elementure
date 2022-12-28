package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SpidernestWallPatcherZProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), Blocks.TUFF.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z + 1), Blocks.TUFF.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z - 1), Blocks.TUFF.defaultBlockState(), 3);
		if (Math.random() < 0.7) {
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.STONE.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
		}
		if (Math.random() < 0.7) {
			world.setBlock(new BlockPos(x, y + 1, z + 1), Blocks.STONE.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y + 1, z + 1), Blocks.COBBLESTONE.defaultBlockState(), 3);
		}
		if (Math.random() < 0.7) {
			world.setBlock(new BlockPos(x, y + 1, z - 1), Blocks.STONE.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y + 1, z - 1), Blocks.COBBLESTONE.defaultBlockState(), 3);
		}
	}
}

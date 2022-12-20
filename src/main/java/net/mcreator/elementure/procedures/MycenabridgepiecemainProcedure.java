package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenabridgepiecemainProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z + 1), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z - 1), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z + 1), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z - 1), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y, z), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y, z + 1), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y, z - 1), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		MycenahousepillargenProcedure.execute(world, x, (y - 1), z);
	}
}

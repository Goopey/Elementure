package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenabridgepiecewestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z + 1), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z - 1), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z + 1), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z - 1), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + 2, z), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + 1, z + 1), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + 1, z - 1), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		while ((world.getBlockState(new BlockPos(x - 1, y - CoordsY + 1, z))).getBlock() == Blocks.AIR && y - CoordsY + 1 > 0) {
			world.setBlock(new BlockPos(x - 1, y - CoordsY + 1, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
			CoordsY = CoordsY + 1;
		}
		MycenahousepillargenProcedure.execute(world, x, (y - 1), z);
	}
}

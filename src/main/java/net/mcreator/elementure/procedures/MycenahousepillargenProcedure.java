package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenahousepillargenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		while (y - CoordsY > 0 && !((world.getBlockState(new BlockPos(x, y - CoordsY, z))).getBlock() == ElementureModBlocks.MYCENAMOSSYGRASS.get()
				|| (world.getBlockState(new BlockPos(x, y - CoordsY, z))).getBlock() == Blocks.DIRT
				|| (world.getBlockState(new BlockPos(x, y - CoordsY, z))).getBlock() == Blocks.STONE
				|| (world.getBlockState(new BlockPos(x, y - CoordsY, z))).getBlock() == ElementureModBlocks.ENERGYDIORITE.get()
				|| (world.getBlockState(new BlockPos(x, y - CoordsY, z))).getBlock() == ElementureModBlocks.LIGHTNINGANDESITE.get()
				|| (world.getBlockState(new BlockPos(x, y - CoordsY, z))).getBlock() == ElementureModBlocks.RUINGRANITE.get()
				|| (world.getBlockState(new BlockPos(x, y - CoordsY, z))).getBlock() == ElementureModBlocks.MYCENIUM.get())) {
			world.setBlock(new BlockPos(x, y - CoordsY, z), Blocks.MUSHROOM_STEM.defaultBlockState(), 3);
			CoordsY = CoordsY + 1;
		}
	}
}

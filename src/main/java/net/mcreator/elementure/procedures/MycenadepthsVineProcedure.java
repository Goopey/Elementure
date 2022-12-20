package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenadepthsVineProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
		CoordsY = Math.random() * 4 + 3;
		while (CoordsY > 0) {
			if ((world.getBlockState(new BlockPos(x, y - CoordsY, z))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x, y - CoordsY, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
			}
			CoordsY = CoordsY - 1;
		}
	}
}

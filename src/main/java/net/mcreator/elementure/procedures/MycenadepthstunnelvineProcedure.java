package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenadepthstunnelvineProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 1, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
		if (Math.random() < 0.5) {
			world.setBlock(new BlockPos(x, y - 2, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
		}
	}
}

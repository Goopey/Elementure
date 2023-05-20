package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class OstreeLogRandomizerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rnd = 0;
		rnd = Math.random();
		if (rnd < 0.45) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.OSTREELOG.get().defaultBlockState(), 3);
		} else if (rnd < 0.9) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.OSTREELOG_2.get().defaultBlockState(), 3);
		} else if (rnd < 0.93) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.OSTREELOG_3.get().defaultBlockState(), 3);
		} else if (rnd < 0.96) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.OSTREELOG_4.get().defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.OSTREELOG_5.get().defaultBlockState(), 3);
		}
	}
}

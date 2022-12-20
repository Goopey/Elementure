package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class Crackingice3BreakingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.05) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.CRACKINGICE_5.get().defaultBlockState(), 3);
		} else if (Math.random() > 0.05 && Math.random() < 0.65) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.CRACKINGICE_4.get().defaultBlockState(), 3);
		}
	}
}

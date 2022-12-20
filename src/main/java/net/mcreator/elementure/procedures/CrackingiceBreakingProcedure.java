package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class CrackingiceBreakingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.3) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.CRACKINGICE_2.get().defaultBlockState(), 3);
		} else if (Math.random() > 0.3 && Math.random() < 0.35) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.CRACKINGICE_3.get().defaultBlockState(), 3);
		}
	}
}

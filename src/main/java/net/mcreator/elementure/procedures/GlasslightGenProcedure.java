package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class GlasslightGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.DIVINGVINE_BEARING.get().defaultBlockState(), 3);
		if (Math.random() < 0.7) {
			if (Math.random() < 0.05) {
				world.setBlock(new BlockPos(x, y - 1, z), ElementureModBlocks.RAREGLASSLIGHT.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y - 1, z), ElementureModBlocks.GLASSLIGHT.get().defaultBlockState(), 3);
			}
		} else {
			world.setBlock(new BlockPos(x, y - 1, z), ElementureModBlocks.DIVINGVINE_BEARING.get().defaultBlockState(), 3);
			if (Math.random() < 0.05) {
				world.setBlock(new BlockPos(x, y - 2, z), ElementureModBlocks.RAREGLASSLIGHT.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y - 2, z), ElementureModBlocks.GLASSLIGHT.get().defaultBlockState(), 3);
			}
		}
	}
}

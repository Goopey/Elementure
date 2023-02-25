package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.ElementureMod;

public class LilypadsaplingGrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.011) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.LILYPADLOG.get().defaultBlockState(), 3);
			ElementureMod.queueServerWork(0, () -> {
				LilypadTreeGenProcedure.execute(world, x, y, z);
			});
		}
	}
}

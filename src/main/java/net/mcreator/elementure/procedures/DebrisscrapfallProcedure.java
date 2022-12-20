package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DebrisscrapfallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double height = 0;
		while (!world.getBlockState(new BlockPos(x, y - 1 + height, z)).canOcclude()) {
			height = height - 1;
		}
		world.setBlock(new BlockPos(x, y + height, z), ElementureModBlocks.DEBRISSCRAPS.get().defaultBlockState(), 3);
	}
}

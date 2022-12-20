package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MushyslimeProcedureCarpetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z - 0.5))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x, y - 1, z - 0.5))).getBlock() == Blocks.AIR)) {
			world.setBlock(new BlockPos(x, y, z - 0.5), ElementureModBlocks.MUSHYSLIMEGLUE.get().defaultBlockState(), 3);
		}
	}
}

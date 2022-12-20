package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MerthiumchannelerDriesBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WET_SPONGE) {
			world.setBlock(new BlockPos(x, y, z), Blocks.SPONGE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WATER) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WATER) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}

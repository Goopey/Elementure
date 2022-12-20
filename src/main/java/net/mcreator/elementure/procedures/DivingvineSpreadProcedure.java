package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DivingvineSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.05 && (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WATER) {
			world.setBlock(new BlockPos(x, y - 1, z), ElementureModBlocks.DIVINGVINE.get().defaultBlockState(), 3);
		}
	}
}

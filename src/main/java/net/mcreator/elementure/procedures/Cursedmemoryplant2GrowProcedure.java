package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class Cursedmemoryplant2GrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double waterNum = 0;
		if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() instanceof LiquidBlock) {
			waterNum = waterNum + 0.025;
		}
		if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() instanceof LiquidBlock) {
			waterNum = waterNum + 0.025;
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() instanceof LiquidBlock) {
			waterNum = waterNum + 0.025;
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() instanceof LiquidBlock) {
			waterNum = waterNum + 0.025;
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.MOSSY_COBBLESTONE) {
			if (Math.random() < 0.1 + waterNum) {
				world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.CURSEDMEMORYPLANT_3.get().defaultBlockState(), 3);
			}
		} else {
			if (Math.random() < 0.05 + waterNum) {
				world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.CURSEDMEMORYPLANT_3.get().defaultBlockState(), 3);
			}
		}
	}
}

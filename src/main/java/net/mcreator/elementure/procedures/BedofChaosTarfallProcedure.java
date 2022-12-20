package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class BedofChaosTarfallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locY = 0;
		while ((world.getBlockState(new BlockPos(x, y + locY, z))).getBlock() == Blocks.WATER && y + locY > -64) {
			if (Math.random() < 0.11) {
				world.setBlock(new BlockPos(x, y + locY, z), ElementureModBlocks.BURNINGTARBLOCK.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y + locY, z), ElementureModBlocks.TAR.get().defaultBlockState(), 3);
			}
			locY = locY - 1;
		}
	}
}

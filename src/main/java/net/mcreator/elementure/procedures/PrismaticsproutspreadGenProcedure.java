package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class PrismaticsproutspreadGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double numSpikes = 0;
		double locX = 0;
		double locZ = 0;
		numSpikes = 3 + Math.round(Math.random() * 4);
		for (int index0 = 0; index0 < (int) (numSpikes); index0++) {
			locX = Math.random() * 8 - 4;
			locZ = Math.random() * 8 - 4;
			if (world.getBlockState(new BlockPos(x + locX, y - 1, z + locX)).canOcclude()
					&& (world.getBlockState(new BlockPos(x + locX, y, z + locX))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.PRISMATICSPROUT.get().defaultBlockState(), 3);
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class BeachstarsSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double locY = 0;
		double locY1 = 0;
		double locY2 = 0;
		locY1 = y - 6;
		locY2 = y + 6;
		for (int index0 = 0; index0 < (int) (18); index0++) {
			if (Math.random() < 0.67) {
				locX = Math.random() * 16 - 8;
				locZ = Math.random() * 16 - 8;
				locY = y;
				if (world.getBlockState(new BlockPos(x + locX, locY, z + locZ)).canOcclude()) {
					while (world.getBlockState(new BlockPos(x + locX, locY, z + locZ)).canOcclude() && locY < locY2) {
						locY = locY + 1;
					}
					if (locY < locY2 - 1 && (world.getBlockState(new BlockPos(x + locX, locY - 1, z + locZ))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x + locX, locY, z + locZ), ElementureModBlocks.BEACHSTARS.get().defaultBlockState(), 3);
					}
				} else {
					while (!world.getBlockState(new BlockPos(x + locX, locY, z + locZ)).canOcclude() && locY > locY1) {
						locY = locY - 1;
					}
					if (locY > locY1 + 1 && (world.getBlockState(new BlockPos(x + locX, locY, z + locZ))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x + locX, locY + 1, z + locZ), ElementureModBlocks.BEACHSTARS.get().defaultBlockState(), 3);
					}
				}
			}
		}
	}
}

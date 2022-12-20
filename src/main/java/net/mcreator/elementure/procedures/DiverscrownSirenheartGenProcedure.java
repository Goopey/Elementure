package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DiverscrownSirenheartGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		locX = -5;
		locY = -5;
		locZ = -5;
		for (int index0 = 0; index0 < (int) (1331); index0++) {
			if (locX * locX + locY * locY + locZ * locZ < 25) {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
			}
			locX = locX + 1;
			if (locX > 5) {
				locX = -5;
				locY = locY + 1;
				if (locY > 5) {
					locX = -5;
					locY = -5;
					locZ = locZ + 1;
					if (locZ > 5) {
						locX = -5;
						locY = -5;
						locZ = -5;
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.SIRENHEART.get().defaultBlockState(), 3);
		world.scheduleTick(new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)).getBlock(), 100);
	}
}

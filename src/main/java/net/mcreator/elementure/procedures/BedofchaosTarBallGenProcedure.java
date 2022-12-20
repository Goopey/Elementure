package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class BedofchaosTarBallGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		locX = -4;
		locY = -4;
		locZ = -4;
		for (int index0 = 0; index0 < (int) (729); index0++) {
			if (locX * locX + locY * locY + locZ * locZ < 16
					&& ((world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == Blocks.WATER
							|| (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == ElementureModBlocks.TAR.get())) {
				if (locX * locX + locY * locY + locZ * locZ > 8 && Math.random() < 0.025) {
					if (Math.random() < 0.5) {
						if (Math.random() < 0.75) {
							BedofChaosTarfallProcedure.execute(world, (x + 1 + locX), (y + locY), (z + locZ));
						}
						if (Math.random() < 0.75) {
							BedofChaosTarfallProcedure.execute(world, (x - 1 + locX), (y + locY), (z + locZ));
						}
					} else {
						if (Math.random() < 0.75) {
							BedofChaosTarfallProcedure.execute(world, (x + locX), (y + locY), (z + 1 + locZ));
						}
						if (Math.random() < 0.75) {
							BedofChaosTarfallProcedure.execute(world, (x + locX), (y + locY), (z - 1 + locZ));
						}
					}
					BedofChaosTarfallProcedure.execute(world, (x + locX), (y + locY), (z + locZ));
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.TARBLOCK.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.TARBLOCK.get().defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 4) {
				locX = -4;
				locY = locY + 1;
				if (locY > 4) {
					locX = -4;
					locY = -4;
					locZ = locZ + 1;
					if (locZ > 4) {
						locX = -4;
						locY = -4;
						locZ = -4;
					}
				}
			}
		}
	}
}

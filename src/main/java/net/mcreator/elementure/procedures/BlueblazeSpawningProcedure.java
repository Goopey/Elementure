package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class BlueblazeSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		boolean shouldSpawn = false;
		locX = -3;
		locY = -3;
		locZ = -3;
		for (int index0 = 0; index0 < (int) (343); index0++) {
			if ((world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == ElementureModBlocks.NETHERUMCARPET.get()
					|| (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == ElementureModBlocks.BABYNETHERSTARBLOCK
							.get()) {
				shouldSpawn = true;
			}
			locX = locX + 1;
			if (locX >= 3) {
				locX = -3;
				locZ = locZ + 1;
				if (locZ >= 3) {
					locX = -3;
					locY = locY + 1;
					locZ = -3;
					if (locY >= 3) {
						locX = -3;
						locY = -3;
						locZ = -3;
					}
				}
			}
		}
		return shouldSpawn;
	}
}

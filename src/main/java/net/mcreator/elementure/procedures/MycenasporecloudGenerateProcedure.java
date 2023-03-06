package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenasporecloudGenerateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double repeatTimes = 0;
		double locZ = 0;
		double rad2 = 0;
		double locX = 0;
		double locY = 0;
		double rndX = 0;
		double rndZ = 0;
		locX = -4;
		locY = -4;
		locZ = -4;
		repeatTimes = (locX * locX + 1) * (locY * locY + 1) * (locZ * locZ + 1);
		rad2 = locX * locX;
		rndX = Math.random() + 1;
		rndZ = Math.random() + 1;
		for (int index0 = 0; index0 < (int) (repeatTimes); index0++) {
			if (locX * locX * rndX + locY * locY * 2 + locZ * locZ * rndZ < rad2 && (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.MYCENASPORECLOUD_BLOCK.get().defaultBlockState(), 3);
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

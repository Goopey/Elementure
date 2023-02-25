package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.ElementureMod;

public class DiverscrownlilypadGrassPatchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double rndRad = 0;
		double largeRndRad = 0;
		rndRad = 9 + Math.random() * 3;
		largeRndRad = rndRad * 2 + 1;
		locX = rndRad * (-1);
		locZ = rndRad * (-1);
		for (int index0 = 0; index0 < (int) (largeRndRad * largeRndRad); index0++) {
			if (locX * locX + locZ * locZ <= rndRad * rndRad) {
				if ((world.getBlockState(new BlockPos(x + locX, y - 1, z + locZ))).getBlock() == ElementureModBlocks.LILYPADBLOCK.get()
						|| (world.getBlockState(new BlockPos(x + locX, y - 1, z + locZ))).getBlock() == ElementureModBlocks.LILYPADRIMBLOCK.get()) {
					world.setBlock(new BlockPos(x + locX, y, z + locZ), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > rndRad) {
				locX = rndRad * (-1);
				locZ = locZ + 1;
				if (locZ > rndRad) {
					locX = rndRad * (-1);
					locZ = rndRad * (-1);
				}
			}
		}
		ElementureMod.queueServerWork(2, () -> {
			DiverscrownBonemealGrassProcedure.execute(world, x, y, z);
		});
		DiverscrownlilypadGrassPatch3Procedure.execute(world, x, (y + 1), z);
		for (int index1 = 0; index1 < (int) (5); index1++) {
			if (Math.random() < 0.67) {
				locX = x + Math.random() * 16 - 8;
				locZ = z + Math.random() * 16 - 8;
				DiverscrownlilipadGrassPatch2Procedure.execute(world, locX, y, locZ);
			}
		}
	}
}

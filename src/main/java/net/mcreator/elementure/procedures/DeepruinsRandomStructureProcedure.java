package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DeepruinsRandomStructureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double locY = 0;
		double actY = 0;
		actY = y;
		while (!world.getBlockState(new BlockPos(x, actY, z)).canOcclude() && actY > -64) {
			actY = actY - 1;
		}
		DeepRuinsPlaceHouseProcedure.execute(world, x, actY, z);
		for (int index1 = 0; index1 < (int) (8); index1++) {
			if (Math.random() < 0.5) {
				locX = x + Math.random() * 14 - 7;
				locZ = z + Math.random() * 14 - 7;
				locY = actY + 6;
				while (!world.getBlockState(new BlockPos(locX, locY, locZ)).canOcclude() && locY > -64) {
					locY = locY - 1;
				}
				locY = locY + 1;
				if (locY >= -63) {
					world.setBlock(new BlockPos(locX, locY, locZ), Blocks.POLISHED_DEEPSLATE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(locX, locY + 1, locZ), Blocks.CHISELED_DEEPSLATE.defaultBlockState(), 3);
					if (Math.random() < 0.35) {
						world.setBlock(new BlockPos(locX, locY + 2, locZ), ElementureModBlocks.DEEPSLATEBRICK_POT.get().defaultBlockState(), 3);
					}
				}
			}
		}
	}
}

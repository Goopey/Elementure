package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class EnergydioritehousepillarProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locY = 0;
		locY = y;
		while (!world.getBlockState(new BlockPos(x, locY, z)).canOcclude() && locY > -64) {
			if (Math.random() < 0.7) {
				world.setBlock(new BlockPos(x, locY, z), ElementureModBlocks.ENERGYDIORITEBRICKS_WALLS.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, locY, z), ElementureModBlocks.ENERGYDIORITETILE_WALLS.get().defaultBlockState(), 3);
			}
			locY = locY - 1;
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class CrystalPalaceBoxGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double repeatTimes = 0;
		double rad2 = 0;
		double platRndX = 0;
		double platRndZ = 0;
		locX = -20;
		locY = -14;
		locZ = -20;
		repeatTimes = (locX * (-2) + 1) * (locY * (-2) + 1) * (locZ * (-2) + 1);
		rad2 = locX * locX * 1.33;
		platRndX = Math.random() * 2 + 1;
		platRndZ = Math.random() * 2 + 1;
		world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.CRYSTALPALACESKY.get().defaultBlockState(), 3);
	}
}

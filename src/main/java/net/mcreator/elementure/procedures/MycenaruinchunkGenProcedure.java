package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MycenaruinchunkGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		MycenasingularruinGenProcedure.execute(world, x, y, z);
		for (int index0 = 0; index0 < (int) (1 + Math.round(Math.random())); index0++) {
			locX = x + Math.random() * 12 - 6;
			locZ = z + Math.random() * 12 - 6;
			MycenasingularruinGenProcedure.execute(world, locX, y, locZ);
		}
	}
}

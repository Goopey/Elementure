package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MycenasingularruinGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		MycenaruinPickProcedure.execute(world, x, y, z);
		for (int index0 = 0; index0 < (int) (4); index0++) {
			if (Math.random() < 0.4) {
				locX = x + Math.random() * 8 - 4;
				locZ = z + Math.random() * 8 - 4;
				MycenabrickpotOfferingGenProcedure.execute(world, locX, y, locZ);
			}
		}
	}
}

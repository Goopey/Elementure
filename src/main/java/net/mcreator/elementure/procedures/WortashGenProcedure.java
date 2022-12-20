package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class WortashGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		for (int index0 = 0; index0 < (int) (4); index0++) {
			if (Math.random() < 0.67) {
				locX = Math.random() < 0.5 ? Math.random() * 16 + 3 : Math.random() * (-16) - 3;
				locZ = Math.random() < 0.5 ? Math.random() * 16 + 3 : Math.random() * (-16) - 3;
				WortashtreeGenProcedure.execute(world, (x + locX), (y + Math.random() * 6 - 3), (z + locZ));
			}
		}
	}
}

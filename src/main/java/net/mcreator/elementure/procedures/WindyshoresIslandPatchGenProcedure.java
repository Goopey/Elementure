package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.elementure.ElementureMod;

public class WindyshoresIslandPatchGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locI = 0;
		ElementureMod.queueServerWork(0, () -> {
			WindyshoresIslandGenProcedure.execute(world, x, y, z);
		});
		locI = 1;
		for (int index0 = 0; index0 < (int) (4); index0++) {
			if (Math.random() < 0.25) {
				ElementureMod.queueServerWork((int) (locI * 2), () -> {
					WindyshoresIslandGenProcedure.execute(world, (x - 10 + Math.random() * 20), (y - 1 + (Math.random() * 3 * Math.random() * 3) / 3), (z - 10 + Math.random() * 20));
				});
			}
			locI = locI + 1;
		}
	}
}

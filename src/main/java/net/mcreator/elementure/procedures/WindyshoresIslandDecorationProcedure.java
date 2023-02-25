package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.elementure.ElementureMod;

public class WindyshoresIslandDecorationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ElementureMod.queueServerWork(14, () -> {
			if (Math.random() < 0.1) {
				BluethorntreeGenProcedure.execute(world, x, y, z);
			} else if (Math.random() < 0.1) {
				BeachstarsSpreadProcedure.execute(world, x, y, z);
			} else if (Math.random() < 0.33) {
				BoulderWindyShoresPatchProcedure.execute(world, x, y, z);
			} else if (Math.random() < 0.5) {
				FlufftreeWindyShoresPatchProcedure.execute(world, x, y, z);
			} else {
				WindyshoresBonemealGrassProcedure.execute(world, x, y, z);
			}
		});
	}
}

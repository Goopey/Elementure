package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MycenahotspringChunkGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		double CoordsX = 0;
		double CoordsZ = 0;
		double maxChecks = 0;
		CoordsX = Math.random() * 10 - 5;
		CoordsZ = Math.random() * 10 - 5;
		maxChecks = 0;
		while (maxChecks <= 4) {
			if (Math.random() < 0.7) {
				MycenahotspringpickProcedure.execute(world, (x + CoordsX), y, (z + CoordsZ));
			}
			CoordsX = Math.random() * 10 - 5;
			CoordsZ = Math.random() * 10 - 5;
			maxChecks = maxChecks + 1;
		}
	}
}

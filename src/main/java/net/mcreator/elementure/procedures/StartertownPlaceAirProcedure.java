package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.elementure.ElementureMod;

public class StartertownPlaceAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		ElementureMod.queueServerWork(0, () -> {
			StartertownPlaceAir2Procedure.execute(world, x, y, z);
		});
	}
}

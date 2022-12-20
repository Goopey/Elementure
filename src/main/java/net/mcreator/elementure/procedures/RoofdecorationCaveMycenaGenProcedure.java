package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class RoofdecorationCaveMycenaGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.85) {
			MycenadepthsVineProcedure.execute(world, x, y, z);
		} else if (Math.random() > 0.85 && Math.random() < 0.9) {
			MycenaroofmushroomsProcedure.execute(world, x, y, z);
		} else if (Math.random() > 0.9 && Math.random() < 0.95) {
			MycenadepthstalagtiteProcedure.execute(world, x, y, z);
		} else {
			MycenaRoofReliefGenProcedure.execute(world, x, y, z);
		}
	}
}

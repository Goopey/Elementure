package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class RoofreliefMycenaDepthsDecorationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			MycenadepthsVineProcedure.execute(world, x, y, z);
		} else if (Math.random() > 0.5 && Math.random() < 0.82) {
			MycenaroofmushroomsProcedure.execute(world, x, y, z);
		} else {
			MycenadepthstalagtiteProcedure.execute(world, x, y, z);
		}
	}
}

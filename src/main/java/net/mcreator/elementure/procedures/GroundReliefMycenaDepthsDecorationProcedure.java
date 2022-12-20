package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class GroundReliefMycenaDepthsDecorationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.65) {
			MycenadepthsgroundmossgenProcedure.execute(world, x, y, z);
		} else if (Math.random() > 0.8) {
			MycenamushroomBigProcedure.execute(world, x, y, z);
		} else {
			MycenadepthstalagmiteProcedure.execute(world, x, y, z);
		}
	}
}

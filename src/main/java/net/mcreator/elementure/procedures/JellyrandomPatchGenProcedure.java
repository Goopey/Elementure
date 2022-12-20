package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class JellyrandomPatchGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.33) {
			JellyfloatbiomeGreenPatchProcedure.execute(world, x, y, z);
		} else if (Math.random() < 0.5) {
			JellyfloatbiomeBluePatchProcedure.execute(world, x, y, z);
		} else {
			JellyfloatbiomePinkPatchProcedure.execute(world, x, y, z);
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class DeepruinsXGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		DeepruinsRoadGenProcedure.execute(world, x, y, z);
		DeepruinsRoadGenProcedure.execute(world, (x + 5), y, z);
		if (Math.random() < 0.88) {
			DeepruinsHouseGenProcedure.execute(world, (x + 3), y, (z + 4));
		}
		if (Math.random() < 0.88) {
			DeepruinsHouseGenProcedure.execute(world, (x + 3), y, (z - 4));
		}
	}
}

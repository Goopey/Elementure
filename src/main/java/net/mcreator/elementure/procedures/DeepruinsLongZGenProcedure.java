package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class DeepruinsLongZGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		DeepruinsRoadGenProcedure.execute(world, x, y, z);
		DeepruinsRoadGenProcedure.execute(world, x, y, (z + 5));
		DeepruinsRoadGenProcedure.execute(world, x, y, (z + 10));
		if (Math.random() < 0.66) {
			DeepruinsHouseGenProcedure.execute(world, (x + 4), y, (z + 3));
		}
		if (Math.random() < 0.66) {
			DeepruinsHouseGenProcedure.execute(world, (x - 4), y, (z + 3));
		}
		if (Math.random() < 0.66) {
			DeepruinsHouseGenProcedure.execute(world, (x + 4), y, (z + 8));
		}
		if (Math.random() < 0.66) {
			DeepruinsHouseGenProcedure.execute(world, (x - 4), y, (z + 8));
		}
	}
}

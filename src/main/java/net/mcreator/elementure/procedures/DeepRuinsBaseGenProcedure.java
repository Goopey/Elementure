package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class DeepRuinsBaseGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		DeepruinsRoadGenProcedure.execute(world, x, y, z);
		if (Math.random() < 0.5) {
			if (Math.random() < 0.5) {
				DeepruinsLongXProcedure.execute(world, (x + 5), y, z);
			} else {
				DeepruinsXGenProcedure.execute(world, (x + 5), y, z);
			}
			if (Math.random() < 0.5) {
				DeepruinsLongXProcedure.execute(world, (x - 14), y, z);
			} else {
				DeepruinsXGenProcedure.execute(world, (x - 9), y, z);
			}
			DeepruinsZGenProcedure.execute(world, x, y, (z + 5));
			DeepruinsZGenProcedure.execute(world, x, y, (z - 9));
		} else {
			if (Math.random() < 0.5) {
				DeepruinsLongZGenProcedure.execute(world, x, y, (z + 5));
			} else {
				DeepruinsZGenProcedure.execute(world, x, y, (z + 5));
			}
			if (Math.random() < 0.5) {
				DeepruinsLongZGenProcedure.execute(world, x, y, (z - 14));
			} else {
				DeepruinsZGenProcedure.execute(world, x, y, (z - 9));
			}
			DeepruinsXGenProcedure.execute(world, (x + 5), y, z);
			DeepruinsXGenProcedure.execute(world, (x - 9), y, z);
		}
	}
}

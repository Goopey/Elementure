package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

public class SpawnTombstonesSwordTempleProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double rnd = 0;
		double locX = 0;
		double locZ = 0;
		rnd = Math.round(Math.random() * 8 + 4);
		for (int index0 = 0; index0 < (int) (rnd); index0++) {
			if (Math.random() < 0.5) {
				locX = 4 + Math.random() * 8;
			} else {
				locX = (-4) - Math.random() * 8;
			}
			if (Math.random() < 0.5) {
				locZ = 4 + Math.random() * 8;
			} else {
				locZ = (-4) - Math.random() * 8;
			}
			SetTombstoneSwordTempleProcedure.execute(world, (x + locX), (z + locZ));
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;

public class DiverscrownLilypadtreePatchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		LilypadTreeGenProcedure.execute(world, x, y, z);
		for (int index0 = 0; index0 < (int) (11); index0++) {
			if (Math.random() < 0.8) {
				locX = x + Math.random() * 24 - 12;
				locZ = z + Math.random() * 24 - 12;
				LilypadTreeGenProcedure.execute(world, locX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) locX, (int) locZ)),
						locZ);
			}
		}
	}
}

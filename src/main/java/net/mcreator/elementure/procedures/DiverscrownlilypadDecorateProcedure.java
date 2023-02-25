package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.elementure.ElementureMod;

public class DiverscrownlilypadDecorateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ElementureMod.queueServerWork(1, () -> {
			if (Math.random() < 0.72) {
				if (Math.random() < 0.1) {
					DiverscrownRavineEntryProcedure.execute(world, x, y, z);
				}
				DiverscrownlilypadGrassPatchProcedure.execute(world, x, y, z);
			} else if (Math.random() < 0.44) {
				ElementureMod.queueServerWork(40, () -> {
					DiverscrownLilypadtreePatchProcedure.execute(world, x, y, z);
				});
			} else {
				BoulderPatchGenProcedure.execute(world, x, y, z);
			}
		});
	}
}

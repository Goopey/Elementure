package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.elementure.ElementureMod;

public class DiverscrownRavineEntryWaitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ElementureMod.queueServerWork(5, () -> {
			DiverscrownlilypadGrassPatchProcedure.execute(world, x, y, z);
			DiverscrownRavineEntryProcedure.execute(world, x, y, z);
		});
	}
}

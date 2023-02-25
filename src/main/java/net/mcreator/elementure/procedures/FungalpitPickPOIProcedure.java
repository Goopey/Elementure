package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.elementure.ElementureMod;

public class FungalpitPickPOIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ElementureMod.queueServerWork(1, () -> {
			if (Math.random() < 0.7) {
				MycenahotspringChunkGenProcedure.execute(world, x, y, z);
			} else {
				MycenaruinchunkGenProcedure.execute(world, x, y, z);
			}
		});
	}
}

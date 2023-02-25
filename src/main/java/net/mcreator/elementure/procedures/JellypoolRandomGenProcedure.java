package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.elementure.ElementureMod;

public class JellypoolRandomGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ElementureMod.queueServerWork(5, () -> {
			if (Math.random() < 0.33) {
				GreenjellyPoolGenProcedure.execute(world, x, y, z);
			} else if (Math.random() < 0.5) {
				BluejellyPoolGenProcedure.execute(world, x, y, z);
			} else {
				PinkjellyPoolGenProcedure.execute(world, x, y, z);
			}
		});
	}
}

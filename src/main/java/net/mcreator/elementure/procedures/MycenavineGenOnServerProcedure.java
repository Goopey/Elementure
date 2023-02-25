package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.elementure.ElementureMod;

public class MycenavineGenOnServerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ElementureMod.queueServerWork(1, () -> {
			MycenavineGenProcedure.execute(world, x, y, z);
		});
	}
}

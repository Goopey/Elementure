package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class IronknightSpawnConditionsProcedure {
	public static boolean execute(LevelAccessor world) {
		return Math.random() < 0.1 && world instanceof Level _lvl && _lvl.isDay();
	}
}

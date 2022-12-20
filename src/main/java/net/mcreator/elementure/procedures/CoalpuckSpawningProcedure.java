package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class CoalpuckSpawningProcedure {
	public static boolean execute(LevelAccessor world, double y) {
		return (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.OVERWORLD) && y <= 48;
	}
}

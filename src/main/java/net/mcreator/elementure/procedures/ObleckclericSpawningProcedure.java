package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.Difficulty;

import net.mcreator.elementure.network.ElementureModVariables;

public class ObleckclericSpawningProcedure {
	public static boolean execute(LevelAccessor world) {
		return ElementureModVariables.WorldVariables.get(world).elementalOreObtained && !(world.getDifficulty() == Difficulty.PEACEFUL)
				&& Math.random() < 0.05;
	}
}

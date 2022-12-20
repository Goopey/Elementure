package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.Difficulty;

public class ScrapguardianAttackOnDifficultyProcedure {
	public static boolean execute(LevelAccessor world) {
		return !(world.getDifficulty() == Difficulty.PEACEFUL);
	}
}

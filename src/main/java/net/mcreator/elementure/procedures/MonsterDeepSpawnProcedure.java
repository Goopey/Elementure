package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.Difficulty;

public class MonsterDeepSpawnProcedure {
	public static boolean execute(LevelAccessor world, double y) {
		return y <= -8 && !(world.getDifficulty() == Difficulty.PEACEFUL);
	}
}

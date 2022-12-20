package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.Difficulty;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;

public class DizmiteSpawningHasOreBeenObtainedProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) >= 7 && ElementureModVariables.WorldVariables.get(world).elementalOreObtained
				&& !(world.getDifficulty() == Difficulty.PEACEFUL) && world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) && world.dayTime() > 12000;
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class StarflowertestDownProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getBlockState(new BlockPos(x, y - 1, z)).canOcclude();
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DeepruinsHouseGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double actY = 0;
		actY = y;
		while (!world.getBlockState(new BlockPos(x, actY, z)).canOcclude() && actY > -64) {
			actY = actY - 1;
		}
		if (actY > -63) {
			DeepRuinsPlaceHouseProcedure.execute(world, x, actY, z);
		}
	}
}

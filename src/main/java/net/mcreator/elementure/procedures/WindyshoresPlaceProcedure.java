package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class WindyshoresPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.scheduleTick(new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)).getBlock(), 6);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;

public class DarklurkerSpawnProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getMaxLocalRawBrightness(new BlockPos(x, y, z)) <= 2 && ElementureModVariables.MapVariables.get(world).isHalloween && y <= 56
				&& (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.OVERWORLD);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;

public class MinoskullHalloweenProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return ElementureModVariables.MapVariables.get(world).isHalloween && (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.OVERWORLD) || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SPAWNER;
	}
}

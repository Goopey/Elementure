package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class AnimochromaticprismaticcrystalRevertProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world instanceof Level _lvl_isPow ? _lvl_isPow.hasNeighborSignal(new BlockPos(x, y, z)) : false)) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.PRISMATICCRYSTALBLOCK.get().defaultBlockState(), 3);
		}
	}
}

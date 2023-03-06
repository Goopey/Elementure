package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class StarryrootsTestUpProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.STARRYROOTS.get() || world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude();
	}
}

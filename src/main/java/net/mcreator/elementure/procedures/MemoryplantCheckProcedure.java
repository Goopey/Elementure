package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MemoryplantCheckProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.COBBLESTONE || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.MOSSY_COBBLESTONE;
	}
}

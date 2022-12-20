package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class SpringwateralphanUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.CHECKINGBLOCKALPHAN.get()) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.SPRINGWATER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.SPRINGWATER.get()) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.SPRINGWATER.get().defaultBlockState(), 3);
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class TarOverlayIsInTarProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		return (world.getBlockState(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == ElementureModBlocks.TAR.get()
				|| (world.getBlockState(new BlockPos(entity.getX(), entity.getY() + 1, entity.getZ()))).getBlock() == ElementureModBlocks.TAR.get();
	}
}

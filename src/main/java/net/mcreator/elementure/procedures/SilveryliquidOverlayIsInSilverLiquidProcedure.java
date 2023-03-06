package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class SilveryliquidOverlayIsInSilverLiquidProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		return (world.getBlockState(new BlockPos(entity.getX(), entity.getY() + 1.65, entity.getZ()))).getBlock() == ElementureModBlocks.SILVERSHORESLIQUID.get();
	}
}

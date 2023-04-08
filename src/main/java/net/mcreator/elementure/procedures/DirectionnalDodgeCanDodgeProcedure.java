package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class DirectionnalDodgeCanDodgeProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		return !entity.isInWaterOrBubble() && !((world.getBlockState(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == Blocks.LADDER) && (entity instanceof LivingEntity _livEnt ? _livEnt.isBlocking() : false)
				&& entity.getDeltaMovement().y() >= 0;
	}
}

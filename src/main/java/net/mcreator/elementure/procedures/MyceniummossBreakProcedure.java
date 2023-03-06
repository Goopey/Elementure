package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MyceniummossBreakProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getBlockState(new BlockPos(x, y - 1, z)).canOcclude() && !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x - 0.5), y, (z - 0.5), new ItemStack(ElementureModBlocks.MYCENIUMMOSS.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}

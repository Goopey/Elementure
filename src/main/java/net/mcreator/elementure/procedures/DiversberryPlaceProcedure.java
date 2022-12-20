package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DiversberryPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.DIVINGVINE.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.DIVINGVINE_BEARING.get()
				|| world.getBlockState(new BlockPos(x, y, z)).canOcclude())
				&& (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WATER) {
			(itemstack).shrink(1);
			world.setBlock(new BlockPos(x, y - 1, z), ElementureModBlocks.DIVINGVINE.get().defaultBlockState(), 3);
		}
	}
}

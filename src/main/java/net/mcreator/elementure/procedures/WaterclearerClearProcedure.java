package net.mcreator.elementure.procedures;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.FluidTags;
import net.minecraft.core.BlockPos;

public class WaterclearerClearProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double repeatTimes = 0;
		double locZ = 0;
		double locX = 0;
		double locY = 0;
		BlockState bState = Blocks.AIR.defaultBlockState();
		BlockPos thisBlock = new BlockPos(x, y, z);
		locX = -8;
		locY = -8;
		locZ = -8;
		repeatTimes = ((locX * locX + 1) * (locY * locY + 1) * (locZ * locZ + 1)) / 2;
		for (int index0 = 0; index0 < (int) (repeatTimes); index0++) {
			FluidState fState = (world.getFluidState(new BlockPos(x + locX, y + locY, z + locZ)));
			bState = (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ)));
			if (fState.is(FluidTags.WATER)) {
				world.setBlock(thisBlock, Blocks.AIR.defaultBlockState(), 2);
				world.levelEvent(2001, thisBlock, Block.getId(Blocks.WATER.defaultBlockState()));
			}
			locX = locX + 1;
			if (locX > 8) {
				locX = -8;
				locY = locY + 1;
				if (locY > 8) {
					locX = -8;
					locY = -8;
					locZ = locZ + 1;
					if (locZ > 8) {
						locX = -8;
						locY = -8;
						locZ = -8;
					}
				}
			}
		}
	}
}

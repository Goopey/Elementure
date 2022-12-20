package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DiversvineGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		double BotY = 0;
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.DIVINGVINE.get().defaultBlockState(), 3);
		BotY = Math.random() * (-32) - 96;
		while (CoordsY > BotY) {
			if ((world.getBlockState(new BlockPos(x, y + CoordsY, z))).getBlock() == Blocks.WATER && y + CoordsY > 0) {
				if (Math.random() < 0.1) {
					world.setBlock(new BlockPos(x, y + CoordsY, z), ElementureModBlocks.DIVINGVINE_BEARING.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x, y + CoordsY, z), ElementureModBlocks.DIVINGVINE.get().defaultBlockState(), 3);
				}
			}
			CoordsY = CoordsY - 1;
		}
	}
}

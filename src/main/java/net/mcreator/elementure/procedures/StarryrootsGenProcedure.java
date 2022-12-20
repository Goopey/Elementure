package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class StarryrootsGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		CoordsY = Math.random() * (-32);
		while (y + CoordsY < 128) {
			if (world.isEmptyBlock(new BlockPos(x, y + CoordsY, z)) && y + CoordsY > 0) {
				world.setBlock(new BlockPos(x, y + CoordsY, z), ElementureModBlocks.STARRYROOTS.get().defaultBlockState(), 3);
			}
			CoordsY = CoordsY + 1;
		}
	}
}

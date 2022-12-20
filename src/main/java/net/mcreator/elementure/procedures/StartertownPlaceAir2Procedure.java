package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class StartertownPlaceAir2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		CoordsY = y;
		while (CoordsY < 88) {
			world.setBlock(new BlockPos(x, CoordsY, z), Blocks.AIR.defaultBlockState(), 3);
			CoordsY = CoordsY + 1;
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;

public class AbyssspreadingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		if (ElementureModVariables.WorldVariables.get(world).isAbyssalSingularityAlive == true) {
			if (Math.random() < 0.00057) {
				if (Math.random() < 0.25) {
					CoordsX = 0 - Math.random() * 2;
					CoordsY = 0 - (Math.random() * 4 - 2);
					CoordsZ = 0 - Math.random() * 2;
				} else if (Math.random() < 0.5 && Math.random() > 0.25) {
					CoordsX = 0 - Math.random() * 2;
					CoordsY = 0 - (Math.random() * 4 - 2);
					CoordsZ = 0 + Math.random() * 2;
				} else if (Math.random() < 0.75 && Math.random() > 0.5) {
					CoordsX = 0 + Math.random() * 2;
					CoordsY = 0 - (Math.random() * 4 - 2);
					CoordsZ = 0 - Math.random() * 2;
				} else {
					CoordsX = 0 + Math.random() * 2;
					CoordsY = 0 - (Math.random() * 4 - 2);
					CoordsZ = 0 + Math.random() * 2;
				}
				if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.SANDSTONE_STAIRS) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
				}
			}
		}
	}
}

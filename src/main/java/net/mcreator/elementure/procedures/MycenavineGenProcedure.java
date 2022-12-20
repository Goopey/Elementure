package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenavineGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		double locY = 0;
		CoordsY = 20;
		locY = Math.random() * (-24);
		while (CoordsY >= locY) {
			if ((world.isEmptyBlock(new BlockPos(x, y + CoordsY, z))
					|| (world.getBlockState(new BlockPos(x, y + CoordsY, z))).getBlock() == ElementureModBlocks.MYCENASPORECLOUD_BLOCK.get())
					&& y + CoordsY > -64) {
				world.setBlock(new BlockPos(x, y + CoordsY, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
			}
			CoordsY = CoordsY - 1;
		}
	}
}

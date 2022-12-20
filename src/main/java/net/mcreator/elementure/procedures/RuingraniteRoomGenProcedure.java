package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RuingraniteRoomGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		locX = -12;
		locY = -8;
		locZ = -12;
		for (int index0 = 0; index0 < (int) (10625); index0++) {
			if ((locX * locX) / 5 + (locY * locY) / 2 + (locZ * locZ) / 5 <= 40 && locY + y > -64) {
				if (Math.random() < 0.996) {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), Blocks.AIR.defaultBlockState(), 3);
				} else {
					if (Math.random() < 0.02) {
						RuingranitehouseGenProcedure.execute(world, (x + locX), (y + locY), (z + locZ));
					} else {
						RuingranitePlatformGenProcedure.execute(world, (x + locX), (y + locY), (z + locZ));
					}
				}
			}
			locX = locX + 1;
			if (locX >= 12) {
				locX = -12;
				locZ = locZ + 1;
				if (locZ >= 12) {
					locX = -12;
					locY = locY + 1;
					locZ = -12;
					if (locY >= 8) {
						locX = -12;
						locY = -8;
						locZ = -12;
					}
				}
			}
		}
	}
}

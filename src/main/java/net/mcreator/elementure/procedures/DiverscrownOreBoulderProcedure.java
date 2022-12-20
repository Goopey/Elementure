package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DiverscrownOreBoulderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double xOff = 0;
		double zOff = 0;
		double yOff = 0;
		double rndSize = 0;
		BlockState ore = Blocks.AIR.defaultBlockState();
		locX = -5;
		locY = -5;
		locZ = -5;
		xOff = Math.random() * 3 + 1;
		yOff = Math.random() * 3 + 1;
		zOff = Math.random() * 3 + 1;
		rndSize = 3 + Math.random() * 3;
		rndSize = rndSize * rndSize;
		if (Math.random() < 0.08) {
			ore = Blocks.LAPIS_ORE.defaultBlockState();
			rndSize = 2 + Math.random() * 2;
			rndSize = rndSize * rndSize;
		} else if (Math.random() < 0.7) {
			ore = Blocks.IRON_ORE.defaultBlockState();
		} else {
			ore = Blocks.GOLD_ORE.defaultBlockState();
		}
		world.setBlock(new BlockPos(x, y, z), ore, 3);
		for (int index0 = 0; index0 < (int) (1331); index0++) {
			if (locX * locX * xOff + locY * locY * yOff + locZ * locZ * zOff <= rndSize) {
				if (Math.random() < 0.55) {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), Blocks.TUFF.defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ore, 3);
				}
			}
			locX = locX + 1;
			if (locX > 5) {
				locX = -5;
				locZ = locZ + 1;
				if (locZ > 5) {
					locX = -5;
					locY = locY + 1;
					locZ = -5;
					if (locY > 5) {
						locX = -5;
						locY = -5;
						locZ = -5;
					}
				}
			}
		}
	}
}

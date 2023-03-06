package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DiverscrownLilypadGroundSlopeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double locR = 0;
		double locRSmall = 0;
		boolean isAir = false;
		locX = -43;
		locY = 0;
		locZ = -43;
		locR = 87;
		locRSmall = 43;
		isAir = true;
		while (isAir) {
			isAir = false;
			locX = locRSmall * (-1);
			locZ = locRSmall * (-1);
			for (int index1 = 0; index1 < (int) (locR * locR); index1++) {
				if (locX * locX + locZ * locZ > (locRSmall - 3.2) * (locRSmall - 3.2) && locX * locX + locZ * locZ <= locRSmall * locRSmall) {
					if (y + locY * Math.sqrt(locRSmall - 43) <= 0) {
						isAir = false;
						break;
					} else if (locRSmall > 45) {
						if (!world.getBlockState(new BlockPos(x + locX, (y + locY * Math.sqrt(locRSmall - 43)) - (Math.abs(locX) + Math.abs(locZ)) / Math.max(locRSmall - 43, 8), z + locZ)).canOcclude()) {
							isAir = true;
							DiverscrownHillSideGenProcedure.execute(world, (x + locX), ((y + locY * Math.sqrt(locRSmall - 43)) - (Math.abs(locX) + Math.abs(locZ)) / Math.max(locRSmall - 43, 8)), (z + locZ));
						}
					} else {
						isAir = true;
						DiverscrownHillSideGenProcedure.execute(world, (x + locX), ((y + locY * Math.sqrt(locRSmall - 43)) - (Math.abs(locX) + Math.abs(locZ)) / Math.max(locRSmall - 43, 8)), (z + locZ));
					}
				}
				locX = locX + 1;
				if (locX > locRSmall) {
					locX = locRSmall * (-1);
					locZ = locZ + 1;
					if (locZ > locRSmall) {
						locX = locRSmall * (-1);
						locZ = locRSmall * (-1);
					}
				}
			}
			locY = locY - 2;
			locR = locR + 2;
			locRSmall = locRSmall + 1;
		}
	}
}

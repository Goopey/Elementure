package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class NetherstarcrustGenPatchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsZ = 0;
		double CoordsX = 0;
		double CoordsY = 0;
		if (!(world.isEmptyBlock(new BlockPos(x, y + 1, z)) && world.isEmptyBlock(new BlockPos(x, y - 1, z)) && world.isEmptyBlock(new BlockPos(x + 1, y, z)) && world.isEmptyBlock(new BlockPos(x - 1, y, z))
				&& world.isEmptyBlock(new BlockPos(x, y, z + 1)) && world.isEmptyBlock(new BlockPos(x, y, z - 1)))) {
			if (Math.random() < 0.01) {
				world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.NETHERSTARCRUSTPATCHSHINY.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.NETHERSTARCRUSTPATCH.get().defaultBlockState(), 3);
			}
		}
		CoordsX = -3;
		CoordsY = -3;
		CoordsZ = -3;
		for (int index0 = 0; index0 < (int) (343); index0++) {
			if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 9) {
				if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERSTARCRUST.get()) {
					if (Math.random() < 0.01) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.NETHERSTARCRUSTPATCHSHINY.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.NETHERSTARCRUSTPATCH.get().defaultBlockState(), 3);
					}
				} else if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERUM.get() && Math.random() < 0.33) {
					if (Math.random() < 0.01) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.NETHERSTARCRUSTPATCHSHINY.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.NETHERSTARCRUSTPATCH.get().defaultBlockState(), 3);
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 3) {
				CoordsX = -3;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 3) {
					CoordsX = -3;
					CoordsY = CoordsY + 1;
					CoordsZ = -3;
					if (CoordsY == 3) {
						CoordsX = -3;
						CoordsY = -3;
						CoordsZ = -3;
					}
				}
			}
		}
	}
}

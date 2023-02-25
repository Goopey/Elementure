package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class StarryplainsFloorGen2Procedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double CoordsX = 0;
		double CoordsZ = 0;
		CoordsX = -116;
		CoordsZ = -116;
		for (int index0 = 0; index0 < (int) (54289); index0++) {
			if (!(new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos(x + CoordsX, 0, z + CoordsZ), "netherstarUsed")) && CoordsX * CoordsX + CoordsZ * CoordsZ > 2916
					&& CoordsX * CoordsX + CoordsZ * CoordsZ <= 13456
					&& !((world.getBlockState(new BlockPos(x + CoordsX, 129, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERUM.get())) {
				if (Math.random() < 0.01) {
					world.setBlock(new BlockPos(x + CoordsX, 129, z + CoordsZ), ElementureModBlocks.NETHERUMCARPETSHINY.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + CoordsX, 129, z + CoordsZ), ElementureModBlocks.NETHERUMCARPET.get().defaultBlockState(), 3);
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 116) {
				CoordsX = -116;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 116) {
					CoordsX = -116;
					CoordsZ = -116;
				}
			}
		}
	}
}

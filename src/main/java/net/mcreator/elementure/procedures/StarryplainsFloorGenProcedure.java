package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.ElementureMod;

public class StarryplainsFloorGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsZ = 0;
		CoordsX = -118;
		CoordsZ = -118;
		for (int index0 = 0; index0 < (int) (56169); index0++) {
			if (CoordsX * CoordsX + CoordsZ * CoordsZ > 2916 && !(new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos(x + CoordsX, 0, z + CoordsZ), "netherstarUsed")) && CoordsX * CoordsX + CoordsZ * CoordsZ <= 13924
					&& !((world.getBlockState(new BlockPos(x + CoordsX, 128, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERUM.get())) {
				if (Math.random() < 0.01) {
					world.setBlock(new BlockPos(x + CoordsX, 128, z + CoordsZ), ElementureModBlocks.NETHERUMCARPETSHINY.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + CoordsX, 128, z + CoordsZ), ElementureModBlocks.NETHERUMCARPET.get().defaultBlockState(), 3);
				}
				if (!((world.getBlockState(new BlockPos(x + CoordsX, 0, z + CoordsZ))).getBlock() == ElementureModBlocks.PERVADEDBEDROCK.get())) {
					world.setBlock(new BlockPos(x + CoordsX, 0, z + CoordsZ), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX, 0, z + CoordsZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putBoolean("netherstarOutsideUsed", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 118) {
				CoordsX = -118;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 118) {
					CoordsX = -118;
					CoordsZ = -118;
				}
			}
		}
		ElementureMod.queueServerWork(10, () -> {
			StarryplainsFloorGen2Procedure.execute(world, x, z);
		});
		ElementureMod.queueServerWork(20, () -> {
			StarryplainsFloorGen3Procedure.execute(world, x, (y + 2), z);
		});
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class JellypoolsOmeganSmallBaseGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		CoordsX = -2;
		CoordsZ = -2;
		CoordsY = -12;
		for (int index0 = 0; index0 < (int) (625); index0++) {
			if ((world.getBlockState(new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11))).getBlock() == Blocks.GRAVEL
					&& !world.getBlockState(new BlockPos(x + CoordsX * 11, y + CoordsY + 1, z + CoordsZ * 11)).canOcclude()) {
				world.setBlock(new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11),
						ElementureModBlocks.JELLYFLOAT_ALPHAN.get().defaultBlockState(), 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("jellyAlphanRole", 1);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			CoordsY = CoordsY + 1;
			if (CoordsY == 12) {
				CoordsY = -12;
				CoordsX = CoordsX + 1;
				if (CoordsX == 2) {
					CoordsX = -2;
					CoordsY = -12;
					CoordsZ = CoordsZ + 1;
					if (CoordsZ == 2) {
						CoordsX = -2;
						CoordsY = -12;
						CoordsZ = -2;
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.JELLYFLOAT_ALPHAN.get().defaultBlockState(), 3);
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putDouble("jellyAlphanRole", 1);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}

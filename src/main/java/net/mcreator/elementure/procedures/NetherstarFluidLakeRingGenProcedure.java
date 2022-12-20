package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class NetherstarFluidLakeRingGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsZ = 0;
		CoordsX = -24;
		CoordsZ = -24;
		for (int index0 = 0; index0 < (int) (2401); index0++) {
			if (CoordsX * CoordsX + CoordsZ * CoordsZ <= 576 && CoordsX * CoordsX + CoordsZ * CoordsZ >= 512) {
				world.setBlock(new BlockPos(x + CoordsX, y, z + CoordsZ), ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x + CoordsX, y, z + CoordsZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("netherstarAGenRole", 3);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x + CoordsX, y, z + CoordsZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("lakeSize", Math.round(2 * Math.random() + 2));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 24) {
				CoordsX = -24;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 24) {
					CoordsX = -24;
					CoordsZ = -24;
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}

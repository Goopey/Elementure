package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class NetherstaroutskirtsGenProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double CoordsX = 0;
		double CoordsZ = 0;
		double randomHeight = 0;
		CoordsX = -21;
		CoordsZ = -21;
		randomHeight = 48 * Math.random() + 40;
		for (int index0 = 0; index0 < (int) (79507); index0++) {
			if (CoordsX * CoordsX + CoordsZ * CoordsZ <= 441 && !(new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos(x + CoordsX, 0, z + CoordsZ), "netherstarUsed"))) {
				if (Math.random() < 0.0001) {
					world.setBlock(new BlockPos(x + CoordsX, randomHeight, z + CoordsZ), ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
					if (Math.random() < 0.5) {
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + CoordsX, randomHeight, z + CoordsZ);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("netherstarAGenRole", 4);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else {
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + CoordsX, randomHeight, z + CoordsZ);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("netherstarAGenRole", 5);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				}
				if (Math.random() < 0.0005) {
					world.setBlock(new BlockPos(x + CoordsX, randomHeight, z + CoordsZ), ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX, randomHeight, z + CoordsZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("netherstarAGenRole", 6);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				if (Math.random() < 0.000025) {
					if (Math.random() < 0.15) {
						world.setBlock(new BlockPos(x + CoordsX, randomHeight / 1.5, z + CoordsZ), ElementureModBlocks.BABYNETHERSTARSHINY.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX, randomHeight / 1.5, z + CoordsZ), ElementureModBlocks.BABYNETHERSTARBLOCK.get().defaultBlockState(), 3);
					}
				}
			}
			randomHeight = 48 * Math.random() + 40;
			CoordsX = CoordsX + 1;
			if (CoordsX == 21) {
				CoordsX = -21;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 21) {
					CoordsX = -21;
					CoordsZ = -21;
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenaomeganBaseGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		boolean placementUsed = false;
		CoordsX = -6;
		CoordsZ = -6;
		CoordsY = -12;
		for (int index0 = 0; index0 < (int) (4225); index0++) {
			if ((world.getBlockState(new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11))).getBlock() == Blocks.GRASS_BLOCK
					|| (world.getBlockState(new BlockPos(x + CoordsX * 11, y + CoordsY + 1, z + CoordsZ * 11))).getBlock() == Blocks.OAK_LOG
							&& (world.getBlockState(new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11))).getBlock() == Blocks.DIRT
					|| (world.getBlockState(new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11))).getBlock() == Blocks.SAND
							&& (world.getBlockState(new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11))).getBlock() == Blocks.AIR
					|| (world.getBlockState(new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11))).getBlock() == Blocks.GRAVEL
							&& (world.getBlockState(new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11))).getBlock() == Blocks.AIR) {
				if (CoordsX == 5 || CoordsX == -5 || CoordsZ == -5 || CoordsZ == 5) {
					if (Math.random() < 0.89) {
						world.setBlock(new BlockPos(x + CoordsX * 11, y + CoordsY + 1, z + CoordsZ * 11), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + CoordsX * 11, y + CoordsY + 2, z + CoordsZ * 11), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11),
								ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("omeganGenRole", 3);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				} else if (CoordsX == 6 || CoordsX == -6 || CoordsZ == -6 || CoordsZ == 6) {
					if (Math.random() < 0.62) {
						world.setBlock(new BlockPos(x + CoordsX * 11, y + CoordsY + 1, z + CoordsZ * 11), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + CoordsX * 11, y + CoordsY + 2, z + CoordsZ * 11), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11),
								ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("omeganGenRole", 3);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				} else {
					world.setBlock(new BlockPos(x + CoordsX * 11, y + CoordsY + 1, z + CoordsZ * 11), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + CoordsX * 11, y + CoordsY + 2, z + CoordsZ * 11), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11),
							ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX * 11, y + CoordsY, z + CoordsZ * 11);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("omeganGenRole", 3);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				placementUsed = true;
			} else {
				if (CoordsY == 12 && placementUsed == false) {
					if (CoordsX == 5 || CoordsX == -5 || CoordsZ == -5 || CoordsZ == 5) {
						if (Math.random() < 0.89) {
							world.setBlock(new BlockPos(x + CoordsX * 11, y + 1, z + CoordsZ * 11), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x + CoordsX * 11, y + 2, z + CoordsZ * 11), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x + CoordsX * 11, y, z + CoordsZ * 11),
									ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x + CoordsX * 11, y, z + CoordsZ * 11);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("omeganGenRole", 3);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						}
					} else if (CoordsX == 6 || CoordsX == -6 || CoordsZ == -6 || CoordsZ == 6) {
						if (Math.random() < 0.62) {
							world.setBlock(new BlockPos(x + CoordsX * 11, y + 1, z + CoordsZ * 11), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x + CoordsX * 11, y + 2, z + CoordsZ * 11), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x + CoordsX * 11, y, z + CoordsZ * 11),
									ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x + CoordsX * 11, y, z + CoordsZ * 11);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getPersistentData().putDouble("omeganGenRole", 3);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						}
					} else {
						world.setBlock(new BlockPos(x + CoordsX * 11, y + 1, z + CoordsZ * 11), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + CoordsX * 11, y + 2, z + CoordsZ * 11), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + CoordsX * 11, y, z + CoordsZ * 11),
								ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + CoordsX * 11, y, z + CoordsZ * 11);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("omeganGenRole", 3);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				}
			}
			CoordsY = CoordsY + 1;
			if (CoordsY == 12) {
				placementUsed = false;
				CoordsY = -12;
				CoordsX = CoordsX + 1;
				if (CoordsX == 6) {
					CoordsX = -6;
					CoordsY = -12;
					CoordsZ = CoordsZ + 1;
					if (CoordsZ == 6) {
						CoordsX = -6;
						CoordsY = -12;
						CoordsZ = -6;
					}
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class OstreeGenLeavesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double repeatTimes = 0;
		double locZ = 0;
		double rad2 = 0;
		double locX = 0;
		double locY = 0;
		double rad = 0;
		double distance = 0;
		locX = -180;
		locY = -30;
		locZ = -180;
		repeatTimes = (locX * (-2) + 1) * (locZ * (-2) + 1);
		rad = locX * locX;
		rad2 = (locX + 32) * (locX + 32);
		for (int index0 = 0; index0 < (int) (repeatTimes); index0++) {
			locY = (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "ostreeLocY")) - 30;
			distance = locX * locX + 36 * locY * locY + locZ * locZ;
			if (distance < rad && (locY != 0 || locX != 0 || locZ != 0)) {
				if (distance >= rad2) {
					if (locY < -6) {
						if (locX * locX + locZ * locZ > 86 * 86 && 1.6 * locX * locX + 16 * (locY - 2) * (locY - 2) + 1.6 * locZ * locZ > rad && distance > 100 * 100) {
							world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.BLUE_OSTREE_LEAVES.get().defaultBlockState(), 3);
						}
					} else if (locY < -2) {
						if (distance > 120 * 120) {
							world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.LIGHT_BLUE_OSTREE_LEAVES.get().defaultBlockState(), 3);
						}
					} else if (locY < 2) {
						if (distance > 140 * 140) {
							world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.OSTREE_LEAVES.get().defaultBlockState(), 3);
						}
					} else if (locY < 6 && locY >= 2) {
						world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.ORANGE_OSTREE_LEAVES.get().defaultBlockState(), 3);
					} else if (locY >= 6) {
						world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.RED_OSTREE_LEAVES.get().defaultBlockState(), 3);
					}
				} else if (locY > 3 - (Math.sqrt(Math.abs(locX)) + Math.sqrt(Math.abs(locZ))) && (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.BLUE_OSTREE_LEAVES.get().defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 180) {
				locX = -180;
				locZ = locZ + 1;
				if (locZ > 180) {
					locX = -180;
					locZ = -180;
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("ostreeLocY", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "ostreeLocY") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "ostreeLocY") > 60) {
						locX = -180;
						locZ = -180;
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("ostreeLocY", 0);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.BLUE_OSTREE_LEAVES.get().defaultBlockState(), 3);
					}
				}
			}
		}
	}
}

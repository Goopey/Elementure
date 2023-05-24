package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class OstreeGenTrunkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double repeatTimes = 0;
		double locZ = 0;
		double rad2 = 0;
		double locX = 0;
		double locYMax = 0;
		double distance = 0;
		double rad = 0;
		double locY = 0;
		double locYRing = 0;
		double internalRad = 0;
		double distance2 = 0;
		locX = -56;
		locYMax = 180;
		locZ = -56;
		repeatTimes = (locX * (-2) + 1) * (locZ * (-2) + 1) * 2;
		rad = locX * locX;
		rad2 = (locX + 14) * (locX + 14);
		internalRad = 4 * 4;
		for (int index0 = 0; index0 < (int) (repeatTimes); index0++) {
			locY = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "ostreeLocY");
			locYRing = Math.min(locY - 16, 8) / 6;
			distance = 2.1 * locX * locX + Math.pow(locY, 1.1) * 3 + locYRing * locYRing * locYRing * locYRing * locYRing * 24 + 2.1 * locZ * locZ;
			distance2 = locX * locX + locZ * locZ;
			if (distance < rad && distance2 >= internalRad) {
				if (locX != 0 || locZ != 0 || new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "ostreeLocY") + 59 != y) {
					if (distance >= rad2) {
						OstreeFullLogRandomizerProcedure.execute(world, (x + locX), (59 + new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "ostreeLocY")), (z + locZ));
					} else {
						OstreeLogRandomizerProcedure.execute(world, (x + locX), (59 + new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "ostreeLocY")), (z + locZ));
					}
				}
			}
			locX = locX + 1;
			if (locX > 56) {
				locX = -56;
				locZ = locZ + 1;
				if (locZ > 56) {
					locX = -56;
					locZ = -56;
					OstreeGenTrunkBottomProcedure.execute(world, x, y, z);
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
					}.getValue(world, new BlockPos(x, y, z), "ostreeLocY") > locYMax) {
						locX = -56;
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("ostreeLocY", 0);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						locZ = -56;
						OstreeLogRandomizerProcedure.execute(world, x, y, z);
						world.setBlock(new BlockPos(x, 240, z), ElementureModBlocks.OSTREEOMEGAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x, 240, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("ostreeOmeganRole", 1);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				}
			}
		}
	}
}

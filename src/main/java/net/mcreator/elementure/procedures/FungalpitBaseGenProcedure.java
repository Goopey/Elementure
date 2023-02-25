package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class FungalpitBaseGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double repeatTimes = 0;
		double locZ = 0;
		double rad2 = 0;
		double locX = 0;
		double locY = 0;
		double area = 0;
		double rad = 0;
		double locYCalc = 0;
		double rad3 = 0;
		locX = -50;
		locY = -24;
		locZ = -50;
		repeatTimes = (locX * locX + 1) * (locZ * locZ + 1) + 2;
		rad = locX * locX;
		rad2 = (locX + 2) * (locX + 2);
		rad3 = (locX + 4) * (locX + 4);
		for (int index0 = 0; index0 < (int) (repeatTimes); index0++) {
			locYCalc = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "localY");
			area = locX * locX + Math.pow(Math.abs(locYCalc), 1.2) * 64 + locZ * locZ;
			if (area < rad) {
				if (!(locX == 0) || !(locYCalc == 0) || !(locZ == 0)) {
					if (area > rad2) {
						world.setBlock(new BlockPos(x + locX, y + locYCalc, z + locZ), Blocks.DEEPSLATE.defaultBlockState(), 3);
					} else if (area > rad3) {
						if (locYCalc < -4) {
							if (Math.random() < 0.15) {
								if (Math.random() < 0.021) {
									FungalpitPickPOIProcedure.execute(world, (x + locX), (y + locYCalc), (z + locZ));
								} else if (Math.random() < 0.85) {
									world.setBlock(new BlockPos(x + locX, y + 1 + locYCalc, z + locZ),
											ElementureModBlocks.MYCENASHROOMBLOCK.get().defaultBlockState(), 3);
								} else {
									world.setBlock(new BlockPos(x + locX, y + 1 + locYCalc, z + locZ),
											ElementureModBlocks.MYCENASPROUTS.get().defaultBlockState(), 3);
								}
							}
							if (Math.random() < 0.7) {
								world.setBlock(new BlockPos(x + locX, y + locYCalc, z + locZ), ElementureModBlocks.MYCENIUM.get().defaultBlockState(),
										3);
							} else {
								world.setBlock(new BlockPos(x + locX, y + locYCalc, z + locZ),
										ElementureModBlocks.MYCENAMOSSYGRASS.get().defaultBlockState(), 3);
							}
							world.setBlock(new BlockPos(x + locX, y - 1 + locYCalc, z + locZ), Blocks.COARSE_DIRT.defaultBlockState(), 3);
							if (Math.random() < 0.005) {
								MycenaplaceGiantMushroomProcedure.execute(world, (x + locX), (y + 1 + locYCalc), (z + locZ));
							}
						} else if (locYCalc > 6) {
							if (Math.random() < 0.04) {
								MycenavineGenOnServerProcedure.execute(world, (x + locX), (y + locYCalc), (z + locZ));
							} else {
								world.setBlock(new BlockPos(x + locX, y + locYCalc, z + locZ), Blocks.AIR.defaultBlockState(), 3);
							}
						} else {
							world.setBlock(new BlockPos(x + locX, y + locYCalc, z + locZ), Blocks.AIR.defaultBlockState(), 3);
						}
					} else if (!((world.getBlockState(new BlockPos(x + locX, y + locYCalc, z + locZ)))
							.getBlock() == ElementureModBlocks.BIGGLOWINGMUSHROOM.get())
							&& !((world.getBlockState(new BlockPos(x + locX, y + locYCalc, z + locZ))).getBlock() == Blocks.MUSHROOM_STEM)
							&& !((world.getBlockState(new BlockPos(x + locX, y + locYCalc, z + locZ))).getBlock() == ElementureModBlocks.MYCENASPROUTS
									.get())
							&& !((world.getBlockState(new BlockPos(x + locX, y + locYCalc, z + locZ)))
									.getBlock() == ElementureModBlocks.MYCENASHROOMBLOCK.get())
							&& !((world.getBlockState(new BlockPos(x + locX, y + locYCalc, z + locZ))).getBlock() == ElementureModBlocks.MYCENAVINE
									.get())) {
						world.setBlock(new BlockPos(x + locX, y + locYCalc, z + locZ), Blocks.AIR.defaultBlockState(), 3);
						if (Math.random() < 0.00125 && locYCalc > 4) {
							MycenasporecloudChunkGenProcedure.execute(world, (x + locX), (y + locYCalc), (z + locZ));
						}
					}
				}
			}
			locX = locX + 1;
			if (locX > 50) {
				locX = -50;
				locZ = locZ + 1;
				if (locZ > 50) {
					locX = -50;
					locZ = -50;
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("localY", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "localY") + 1));
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
					}.getValue(world, new BlockPos(x, y, z), "localY") > 24) {
						locX = -50;
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("localY", (-24));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						locZ = -50;
						world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					}
				}
			}
		}
	}
}

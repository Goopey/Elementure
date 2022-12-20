package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DiverscrownBottomRootsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double height = 0;
		double xOff = 0;
		double zOff = 0;
		double BEDROCK_LEVEL = 0;
		BEDROCK_LEVEL = -64;
		xOff = 4 * Math.random() - 2;
		zOff = 4 * Math.random() - 2;
		while (y - height * 4 > 5) {
			locX = -5;
			locY = -5;
			locZ = -5;
			for (int index1 = 0; index1 < (int) (1331); index1++) {
				if (y - height * 4 > 60) {
					if (locX * locX + locY * locY + locZ * locZ < 22) {
						if (Math.random() < 0.002) {
							if (Math.random() < 0.05) {
								world.setBlock(new BlockPos(x + locX + xOff * height, (y + locY) - height * 4, z + locZ + zOff * height),
										ElementureModBlocks.RAREGLASSLIGHT.get().defaultBlockState(), 3);
							} else {
								world.setBlock(new BlockPos(x + locX + xOff * height, (y + locY) - height * 4, z + locZ + zOff * height),
										ElementureModBlocks.GLASSLIGHT.get().defaultBlockState(), 3);
							}
						} else {
							world.setBlock(new BlockPos(x + locX + xOff * height, (y + locY) - height * 4, z + locZ + zOff * height),
									ElementureModBlocks.LILYPADLOG_FULL.get().defaultBlockState(), 3);
						}
					}
				} else {
					if (locX * locX + locY * locY + locZ * locZ < 18) {
						if (Math.random() < 0.002) {
							if (Math.random() < 0.05) {
								world.setBlock(new BlockPos(x + locX + xOff * height, (y + locY) - height * 4, z + locZ + zOff * height),
										ElementureModBlocks.RAREGLASSLIGHT.get().defaultBlockState(), 3);
							} else {
								world.setBlock(new BlockPos(x + locX + xOff * height, (y + locY) - height * 4, z + locZ + zOff * height),
										ElementureModBlocks.GLASSLIGHT.get().defaultBlockState(), 3);
							}
						} else {
							world.setBlock(new BlockPos(x + locX + xOff * height, (y + locY) - height * 4, z + locZ + zOff * height),
									ElementureModBlocks.LILYPADLOG_FULL.get().defaultBlockState(), 3);
						}
					}
				}
				locX = locX + 1;
				if (locX > 5) {
					locX = -5;
					locY = locY + 1;
					if (locY > 5) {
						locX = -5;
						locY = -5;
						locZ = locZ + 1;
						if (locZ > 5) {
							locX = -5;
							locY = -5;
							locZ = -5;
						}
					}
				}
			}
			if (!(new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos(x + xOff * height, BEDROCK_LEVEL, z + zOff * height), "diverscrowncenterUsed"))) {
				world.setBlock(new BlockPos(x + xOff * height, y - height * 4, z + zOff * height),
						ElementureModBlocks.DIVERSCROWN_OMEGAN.get().defaultBlockState(), 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x + xOff * height, y - height * 4, z + zOff * height);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("diverscrownOmeganRole", 1);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				break;
			} else if (Math.random() < 0.14) {
				if (Math.random() < 0.2) {
					DiverscrownBottomRootsProcedure.execute(world, (x + xOff * height), (y - height * 4), (z + zOff * height));
				} else {
					world.setBlock(new BlockPos(x + xOff * height, y - height * 4, z + zOff * height),
							ElementureModBlocks.DIVERSCROWN_OMEGAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + xOff * height, y - height * 4, z + zOff * height);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("diverscrownOmeganRole", 1);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			height = height + 1;
		}
	}
}

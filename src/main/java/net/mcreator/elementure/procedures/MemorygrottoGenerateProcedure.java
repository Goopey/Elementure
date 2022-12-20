package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MemorygrottoGenerateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsZ = 0;
		double CoordsX = 0;
		double CoordsY = 0;
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z), "generateAround")) == true) {
			CoordsX = -12;
			CoordsY = -12;
			CoordsZ = -12;
			for (int index0 = 0; index0 < (int) (15625); index0++) {
				if (CoordsY + y > -64 && CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 144) {
					if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ >= 112) {
						if (Math.random() < 0.01) {
							if (Math.random() < 0.5) {
								GeneratememorycrystalshellchunkProcedure.execute(world, (x + CoordsX), (y + CoordsY), (z + CoordsZ));
							} else {
								GeneratememorycrystalchunkProcedure.execute(world, (x + CoordsX), (y + CoordsY), (z + CoordsZ));
							}
						} else {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
									ElementureModBlocks.MEMORYCRYSTALSHELL.get().defaultBlockState(), 3);
						}
					} else if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ < 112
							&& CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ >= 92) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
								ElementureModBlocks.MEMORYCRYSTAL.get().defaultBlockState(), 3);
					} else if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 92
							&& CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ >= 84) {
						if (CoordsY < 0 && Math.random() < 0.02) {
							if (Math.random() < 0.4) {
								world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
										ElementureModBlocks.MEMORYCRYSTAL.get().defaultBlockState(), 3);
								GeneratememoryspiresProcedure.execute(world, (x + CoordsX), (y + CoordsY), (z + CoordsZ));
							} else if (Math.random() > 0.6) {
								world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
										ElementureModBlocks.MEMORYCRYSTAL.get().defaultBlockState(), 3);
								GeneratelongmemoryspiresProcedure.execute(world, (x + CoordsX), (y + CoordsY), (z + CoordsZ));
							} else {
								if (Math.random() < 0.5) {
									GeneratememorycrystalshellchunkProcedure.execute(world, (x + CoordsX), (y + CoordsY), (z + CoordsZ));
								} else {
									GeneratememorycrystalchunkProcedure.execute(world, (x + CoordsX), (y + CoordsY), (z + CoordsZ));
								}
							}
						} else if (CoordsY >= 0 && Math.random() < 0.02) {
							if (Math.random() < 0.4) {
								world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
										ElementureModBlocks.MEMORYCRYSTAL.get().defaultBlockState(), 3);
								GeneratememoryspiresProcedure.execute(world, (x + CoordsX), ((y + CoordsY) - 4), (z + CoordsZ));
							} else if (Math.random() > 0.6) {
								world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
										ElementureModBlocks.MEMORYCRYSTAL.get().defaultBlockState(), 3);
								GeneratelongmemoryspiresProcedure.execute(world, (x + CoordsX), ((y + CoordsY) - 4), (z + CoordsZ));
							} else {
								if (Math.random() < 0.5) {
									GeneratememorycrystalshellchunkProcedure.execute(world, (x + CoordsX), (y + CoordsY), (z + CoordsZ));
								} else {
									GeneratememorycrystalchunkProcedure.execute(world, (x + CoordsX), (y + CoordsY), (z + CoordsZ));
								}
							}
						} else {
							if (!((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
									.getBlock() == ElementureModBlocks.MEMORYCRYSTALSHELL.get())
									|| !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
											.getBlock() == ElementureModBlocks.MEMORYCRYSTAL.get())) {
								world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
							}
						}
					} else {
						if (!((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
								.getBlock() == ElementureModBlocks.MEMORYCRYSTALSHELL.get())
								|| !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
										.getBlock() == ElementureModBlocks.MEMORYCRYSTAL.get())) {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
						}
					}
				}
				CoordsX = CoordsX + 1;
				if (CoordsX == 12) {
					CoordsX = -12;
					CoordsZ = CoordsZ + 1;
					if (CoordsZ == 12) {
						CoordsX = -12;
						CoordsY = CoordsY + 1;
						CoordsZ = -12;
						if (CoordsY == 12) {
							CoordsX = -12;
							CoordsY = -12;
							CoordsZ = -12;
						}
					}
				}
			}
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.MEMORYHEART.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putBoolean("generateAround", (false));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}

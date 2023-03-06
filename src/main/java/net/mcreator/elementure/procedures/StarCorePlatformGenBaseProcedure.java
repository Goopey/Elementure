package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class StarCorePlatformGenBaseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsZ = 0;
		double CoordsY = 0;
		double CoordsX = 0;
		double MaxSize = 0;
		CoordsX = (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "platformSize")) * (-1);
		CoordsY = (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "platformSize")) * (-1);
		CoordsZ = (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "platformSize")) * (-1);
		MaxSize = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "platformSize");
		for (int index0 = 0; index0 < (int) (((new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "platformSize")) * 2 + 1) * ((new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "platformSize")) * 2 + 1) * ((new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "platformSize")) * 2 + 1)); index0++) {
			if (CoordsX * CoordsX + 6 * CoordsY * CoordsY + CoordsZ * CoordsZ <= (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "platformSize")) * (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "platformSize"))) {
				if (CoordsY < 0) {
					if (!((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.OBSIDIAN) && !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.NETHER_PORTAL)
							&& (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.ACTIVENETHERUM.get())
							&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get())
							&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get())) {
						if (CoordsY < -2) {
							if (Math.random() < 0.05) {
								world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putDouble("netherstarAGenRole", 9);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							} else {
								if (Math.random() < 0.01) {
									world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.ACTIVENETHERUMSHINY.get().defaultBlockState(), 3);
								} else {
									world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.ACTIVENETHERUM.get().defaultBlockState(), 3);
								}
							}
						} else {
							if (Math.random() < 0.01) {
								world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.ACTIVENETHERUMSHINY.get().defaultBlockState(), 3);
							} else {
								world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.ACTIVENETHERUM.get().defaultBlockState(), 3);
							}
						}
					}
				} else if (CoordsX * CoordsX + 16 * CoordsY * CoordsY + CoordsZ * CoordsZ <= (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "platformSize")) * (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "platformSize")) && !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.OBSIDIAN)
						&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.NETHER_PORTAL)) {
					if (!((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get())
							&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get())
							&& (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.AIR
							&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == ElementureModBlocks.ACTIVENETHERUM.get())) {
						if (Math.random() < 0.01) {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.ACTIVENETHERUMSHINY.get().defaultBlockState(), 3);
						} else {
							world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.ACTIVENETHERUM.get().defaultBlockState(), 3);
						}
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == MaxSize) {
				CoordsX = MaxSize * (-1);
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == MaxSize) {
					CoordsX = MaxSize * (-1);
					CoordsY = CoordsY + 1;
					CoordsZ = MaxSize * (-1);
					if (CoordsY == MaxSize) {
						CoordsX = MaxSize * (-1);
						CoordsY = MaxSize * (-1);
						CoordsZ = MaxSize * (-1);
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.ACTIVENETHERUM.get().defaultBlockState(), 3);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenadepthswestwayProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "wait") > 1) {
			if (((world.getBlockState(new BlockPos(x, -64, z))).getBlock() == ElementureModBlocks.PERVADEDBEDROCK.get()
					|| (world.getBlockState(new BlockPos(x, -64, z))).getBlock() == ElementureModBlocks.EMPTIEDBEDROCK.get())
					&& Math.random() < 3 - (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "w")) / 2) {
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "secretRoomNumber") < 2 && Math.random() < 0.05 && (new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getBoolean(tag);
						return false;
					}
				}.getValue(world, new BlockPos(x, y, z), "secretRoom")) == false && (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "w") == 3 || new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "w") == 4)) {
					if (Math.random() < 0.5) {
						MycenadepthssecretroomProcedure.execute(world, x, y, (z + 10));
					} else {
						MycenadepthssecretroomProcedure.execute(world, x, y, (z - 13));
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x - 3, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putBoolean("secretRoom", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putBoolean("secretRoom", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x - 3, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("secretRoomNumber", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "secretRoomNumber") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("secretRoomNumber", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "secretRoomNumber") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				world.setBlock(new BlockPos(x - 3, y, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 3, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("alphanGenRole", 9);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 3, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("w", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "w") + 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 3, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("roomW", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "roomW")));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 3, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putBoolean("stairway", (new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x, y, z), "stairway")));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 3, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putBoolean("secretRoom", (new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x, y, z), "secretRoom")));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 3, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("secretRoomNumber", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "secretRoomNumber")));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 3, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("roomDirection", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "roomDirection")));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else if (!((world.getBlockState(new BlockPos(x, -64, z))).getBlock() == ElementureModBlocks.PERVADEDBEDROCK.get())
					&& !((world.getBlockState(new BlockPos(x, -64, z))).getBlock() == ElementureModBlocks.EMPTIEDBEDROCK.get())) {
				if (Math.random() < 0.33) {
					world.setBlock(new BlockPos(x - 7, y, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x - 7, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("alphanGenRole", 17);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (Math.random() < 0.5 && y < 50) {
						world.setBlock(new BlockPos(x - 18, y - 2, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x - 18, y - 2, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("alphanGenRole", 21);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x - 18, y - 2, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("weight", 10);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				} else {
					if ((new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x, y, z), "stairway")) == true) {
						if ((world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.AIR
								|| (world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.WATER
								|| (world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.LAVA) {
							world.setBlock(new BlockPos(x - 3, y, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x - 3, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putDouble("alphanGenRole", 13);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							MycenaStairwayGenProcedure.execute(world, (x - 7), y, z);
						} else {
							world.setBlock(new BlockPos(x - 7, y, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x - 7, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putDouble("alphanGenRole", 8);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x - 7, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putBoolean("stairway", (false));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						}
					} else {
						if ((world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.AIR
								|| (world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.WATER
								|| (world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.LAVA) {
							world.setBlock(new BlockPos(x - 3, y, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x - 3, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putDouble("alphanGenRole", 13);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						} else {
							world.setBlock(new BlockPos(x - 7, y, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x - 7, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putDouble("alphanGenRole", 7);
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
							if (!world.isClientSide()) {
								BlockPos _bp = new BlockPos(x - 7, y, z);
								BlockEntity _blockEntity = world.getBlockEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_blockEntity != null)
									_blockEntity.getTileData().putBoolean("stairway", (new Object() {
										public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
											BlockEntity blockEntity = world.getBlockEntity(pos);
											if (blockEntity != null)
												return blockEntity.getTileData().getBoolean(tag);
											return false;
										}
									}.getValue(world, new BlockPos(x, y, z), "stairway")));
								if (world instanceof Level _level)
									_level.sendBlockUpdated(_bp, _bs, _bs, 3);
							}
						}
					}
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 7, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("direction", 5);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			} else {
				if ((new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getBoolean(tag);
						return false;
					}
				}.getValue(world, new BlockPos(x, y, z), "stairway")) == true && Math.random() > 0.33 + ((new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "roomW")) - 1) / 3) {
					if ((world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.WATER
							|| (world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.LAVA) {
						world.setBlock(new BlockPos(x - 3, y, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x - 3, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("alphanGenRole", 13);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						MycenaStairwayGenProcedure.execute(world, (x - 7), y, z);
					} else {
						world.setBlock(new BlockPos(x - 7, y, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x - 7, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("alphanGenRole", 8);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x - 7, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putBoolean("stairway", (false));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				} else {
					if ((world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.WATER
							|| (world.getBlockState(new BlockPos(x - 7, y, z))).getBlock() == Blocks.LAVA) {
						if ((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x, y, z), "stairway")) == true) {
							MycenaStairwayGenProcedure.execute(world, (x - 7), y, z);
						}
						world.setBlock(new BlockPos(x - 3, y, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x - 3, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("alphanGenRole", 13);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else {
						world.setBlock(new BlockPos(x - 7, y, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x - 7, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("alphanGenRole", 7);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x - 7, y, z);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putBoolean("stairway", (new Object() {
									public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
										BlockEntity blockEntity = world.getBlockEntity(pos);
										if (blockEntity != null)
											return blockEntity.getTileData().getBoolean(tag);
										return false;
									}
								}.getValue(world, new BlockPos(x, y, z), "stairway")));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 7, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("secretRoomNumber", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "secretRoomNumber")));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 7, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("roomW", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "roomW")));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 7, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("roomDirection", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "roomDirection")));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "roomDirection") > 0) {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x - 7, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("direction", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, y, z), "roomDirection")));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x - 7, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("direction", 2);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x - 3, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putBoolean("isLastFloor", (new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x, y, z), "isLastFloor")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x - 7, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putBoolean("isLastFloor", (new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x, y, z), "isLastFloor")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			MycenaWestEastTunnelGenProcedure.execute(world, x, y, z);
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("wait", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "wait") + 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}

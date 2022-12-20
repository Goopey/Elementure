package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class MycenaBiomeAlphanGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "alphanGenRole") == 1) {
			MycenaCaveOpeningGenProcedure.execute(world, x, y, z);
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "alphanGenRole") == 2) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			MycenawestvillagewayProcedure.execute(world, x, y, z);
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "alphanGenRole") == 3) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			MycenaeastvillagewayProcedure.execute(world, x, y, z);
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "alphanGenRole") == 4) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			MycenanorthvillagewayProcedure.execute(world, x, y, z);
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "alphanGenRole") == 5) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			MycenasouthvillagewayProcedure.execute(world, x, y, z);
		} else if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "alphanGenRole") > 5) {
			Mycenaalphangen2Procedure.execute(world, x, y, z);
		} else {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "wait") == 1) {
				if (!((new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getBoolean(tag);
						return false;
					}
				}.getValue(world, new BlockPos(x + 1, -64, z), "mycenaUsed")) == true) || !((new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getBoolean(tag);
						return false;
					}
				}.getValue(world, new BlockPos(x - 1, -64, z), "mycenaUsed")) == true) || !((new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getBoolean(tag);
						return false;
					}
				}.getValue(world, new BlockPos(x, -64, z - 1), "mycenaUsed")) == true) || !((new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getBoolean(tag);
						return false;
					}
				}.getValue(world, new BlockPos(x, -64, z + 1), "mycenaUsed")) == true)) {
					Mycenasidegen1Procedure.execute(world, x, y, z);
				} else {
					if (!((new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x + 2, -64, z), "mycenaUsed")) == true) || !((new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x - 2, -64, z), "mycenaUsed")) == true) || !((new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x, -64, z - 2), "mycenaUsed")) == true) || !((new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x, -64, z + 2), "mycenaUsed")) == true) || !((new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x + 1, -64, z + 1), "mycenaUsed")) == true) || !((new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x + 1, -64, z - 1), "mycenaUsed")) == true) || !((new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x - 1, -64, z + 1), "mycenaUsed")) == true) || !((new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x - 1, -64, z - 1), "mycenaUsed")) == true)) {
						Mycenasidegen2Procedure.execute(world, x, y, z);
					} else {
						if (!((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x + 3, -64, z), "mycenaUsed")) == true) || !((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x - 3, -64, z), "mycenaUsed")) == true) || !((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x, -64, z + 3), "mycenaUsed")) == true) || !((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x, -64, z - 3), "mycenaUsed")) == true) || !((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x + 2, -64, z + 1), "mycenaUsed")) == true) || !((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x + 2, -64, z - 1), "mycenaUsed")) == true) || !((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x - 2, -64, z - 1), "mycenaUsed")) == true) || !((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x - 2, -64, z + 1), "mycenaUsed")) == true) || !((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x + 1, -64, z + 2), "mycenaUsed")) == true) || !((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x + 1, -64, z - 2), "mycenaUsed")) == true) || !((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x - 1, -64, z + 2), "mycenaUsed")) == true) || !((new Object() {
							public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getTileData().getBoolean(tag);
								return false;
							}
						}.getValue(world, new BlockPos(x - 1, -64, z - 2), "mycenaUsed")) == true)) {
							Mycenasidegen3Procedure.execute(world, x, y, z);
						} else {
							if (!((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x + 4, -64, z), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x - 4, -64, z), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x, -64, z + 4), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x, -64, z - 4), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x + 3, -64, z + 1), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x + 3, -64, z - 1), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x - 3, -64, z + 1), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x - 3, -64, z - 1), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x + 1, -64, z + 3), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x + 1, -64, z - 3), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x - 1, -64, z + 3), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x - 1, -64, z - 3), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x + 2, -64, z + 2), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x + 2, -64, z - 2), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x - 2, -64, z + 2), "mycenaUsed")) == true) || !((new Object() {
								public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getTileData().getBoolean(tag);
									return false;
								}
							}.getValue(world, new BlockPos(x - 2, -64, z - 2), "mycenaUsed")) == true)) {
								Mycenasidegen4Procedure.execute(world, x, y, z);
							} else {
								MycenabiomealphanNormGenProcedure.execute(world, x, y, z);
							}
						}
					}
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("wait", 1);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}

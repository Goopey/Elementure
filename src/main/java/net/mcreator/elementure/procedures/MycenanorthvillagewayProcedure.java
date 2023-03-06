package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.entity.MycenashroomguardEntity;

public class MycenanorthvillagewayProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		double CoordsY2 = 0;
		if (Math.random() < 0.5) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, -64, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("XOff", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, -64, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("XOff", (-1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (((world.getBlockState(new BlockPos(x + new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "XOff"), y - 1, z))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos(x + new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "XOff"), y - 1, z))).getBlock() == ElementureModBlocks.MYCENIUM.get() || (world.getBlockState(new BlockPos(x + new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "XOff"), y - 1, z))).getBlock() == ElementureModBlocks.MYCENAMOSSYGRASS.get() || (world.getBlockState(new BlockPos(x + new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "XOff"), y - 1, z))).getBlock() == Blocks.STONE || (world.getBlockState(new BlockPos(x + new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "XOff"), y - 2, z))).getBlock() == Blocks.DIRT || (world.getBlockState(new BlockPos(x + new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "XOff"), y - 2, z))).getBlock() == ElementureModBlocks.MYCENIUM.get() || (world.getBlockState(new BlockPos(x + new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "XOff"), y - 2, z))).getBlock() == ElementureModBlocks.MYCENAMOSSYGRASS.get() || (world.getBlockState(new BlockPos(x + new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "XOff"), y - 2, z))).getBlock() == Blocks.STONE) && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, -64, z), "bridgeLength") > 0) {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, -64, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("low", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			for (int index0 = 0; index0 < (int) (6); index0++) {
				if ((world.getBlockState(new BlockPos(x + new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, -64, z), "XOff"), y + CoordsY, z))).getBlock() == Blocks.DIRT) {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, -64, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putBoolean("high", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				CoordsY = CoordsY + 1;
				if (CoordsY == 5) {
					CoordsY = 0;
				}
			}
		}
		if ((world.getBlockState(new BlockPos(x, -64, z))).getBlock() == ElementureModBlocks.PERVADEDBEDROCK.get() || (world.getBlockState(new BlockPos(x, -64, z))).getBlock() == ElementureModBlocks.EMPTIEDBEDROCK.get()) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, -64, z), "bridgeLength") < 9) {
				if ((new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getBoolean(tag);
						return false;
					}
				}.getValue(world, new BlockPos(x, -64, z), "high")) == true) {
					if (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, -64, z), "bridgeLength") == 5) {
						if (Math.random() < 0.33) {
							WestmycenahousesProcedure.execute(world, (x + 6), (y - 2), z);
						} else if (Math.random() > 0.66) {
							EastmycenahousesProcedure.execute(world, (x - 6), (y - 2), z);
						} else {
							WestmycenahousesProcedure.execute(world, (x + 6), (y - 2), z);
							EastmycenahousesProcedure.execute(world, (x - 6), (y - 2), z);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MycenashroomguardEntity(ElementureModEntities.MYCENASHROOMGUARD.get(), _level);
							entityToSpawn.moveTo(x, (y + 2), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					MycenabridgepieceNorthProcedure.execute(world, (x + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, -64, z), "XOff")), y, z);
					world.setBlock(new BlockPos(x, y - 2, z - 3), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, -64, z - 3);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("bridgeLength", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, -64, z), "bridgeLength") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y - 2, z - 3);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("alphanGenRole", 4);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if ((new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getBoolean(tag);
						return false;
					}
				}.getValue(world, new BlockPos(x, -64, z), "low")) == true) {
					if (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, -64, z), "bridgeLength") == 5) {
						if (Math.random() < 0.33) {
							WestmycenahousesProcedure.execute(world, (x + 6), (y + 2), z);
						} else if (Math.random() > 0.66) {
							EastmycenahousesProcedure.execute(world, (x - 6), (y + 2), z);
						} else {
							WestmycenahousesProcedure.execute(world, (x + 6), (y + 2), z);
							EastmycenahousesProcedure.execute(world, (x - 6), (y + 2), z);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MycenashroomguardEntity(ElementureModEntities.MYCENASHROOMGUARD.get(), _level);
							entityToSpawn.moveTo(x, (y + 2), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					MycenabridgepiecesouthProcedure.execute(world, (x + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, -64, z), "XOff")), (y + 2), z);
					world.setBlock(new BlockPos(x, y + 2, z - 3), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, -64, z - 3);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("bridgeLength", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, -64, z), "bridgeLength") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y + 2, z - 3);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("alphanGenRole", 4);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					if (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, -64, z), "bridgeLength") == 5) {
						if (Math.random() < 0.33) {
							WestmycenahousesProcedure.execute(world, (x + 6), (y - 2), z);
						} else if (Math.random() > 0.66) {
							EastmycenahousesProcedure.execute(world, (x - 6), (y - 2), z);
						} else {
							WestmycenahousesProcedure.execute(world, (x + 6), (y - 2), z);
							EastmycenahousesProcedure.execute(world, (x - 6), (y - 2), z);
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MycenashroomguardEntity(ElementureModEntities.MYCENASHROOMGUARD.get(), _level);
							entityToSpawn.moveTo(x, (y + 2), z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					MycenabridgepiecemainProcedure.execute(world, (x + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, -64, z), "XOff")), y, z);
					world.setBlock(new BlockPos(x, y, z - 3), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, -64, z - 3);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("bridgeLength", (new Object() {
								public double getValue(LevelAccessor world, BlockPos pos, String tag) {
									BlockEntity blockEntity = world.getBlockEntity(pos);
									if (blockEntity != null)
										return blockEntity.getPersistentData().getDouble(tag);
									return -1;
								}
							}.getValue(world, new BlockPos(x, -64, z), "bridgeLength") + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z - 3);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("alphanGenRole", 4);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			} else if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, -64, z), "bridgeLength") == 9) {
				MycenabridgepieceNorthProcedure.execute(world, (x + new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, -64, z), "XOff")), y, z);
			} else {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		} else {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}

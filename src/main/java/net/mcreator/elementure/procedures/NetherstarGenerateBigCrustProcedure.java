package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModBlocks;

public class NetherstarGenerateBigCrustProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsZ = 0;
		double CoordsX = 0;
		double CoordsY = 0;
		double loadWait = 0;
		CoordsX = -54;
		CoordsY = -54;
		CoordsZ = -54;
		for (int index0 = 0; index0 < (int) (1295029); index0++) {
			if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 2916) {
				if (y + CoordsY > 0) {
					if (!((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.OBSIDIAN)
							&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.NETHER_PORTAL)
							&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
									.getBlock() == ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get())
							&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
									.getBlock() == ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get())) {
						if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ >= 2700 && y + CoordsY >= 128 && y + CoordsY <= 130) {
							if (y + CoordsY == 130 && Math.random() < 0.03) {
								world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
										ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
								if (Math.random() < 0.5) {
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getTileData().putDouble("netherstarAGenRole", 15);
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
								} else {
									if (CoordsZ < 0) {
										if (CoordsX < -20) {
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getTileData().putDouble("netherstarAGenRole", 19);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
										} else if (CoordsX > 20) {
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getTileData().putDouble("netherstarAGenRole", 17);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
										} else {
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getTileData().putDouble("netherstarAGenRole", 16);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
										}
									} else {
										if (CoordsX < -20) {
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getTileData().putDouble("netherstarAGenRole", 19);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
										} else if (CoordsX > 20) {
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getTileData().putDouble("netherstarAGenRole", 17);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
										} else {
											if (!world.isClientSide()) {
												BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
												BlockEntity _blockEntity = world.getBlockEntity(_bp);
												BlockState _bs = world.getBlockState(_bp);
												if (_blockEntity != null)
													_blockEntity.getTileData().putDouble("netherstarAGenRole", 18);
												if (world instanceof Level _level)
													_level.sendBlockUpdated(_bp, _bs, _bs, 3);
											}
										}
									}
								}
							} else {
								if (Math.random() < 0.01) {
									world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
											ElementureModBlocks.NETHERUMCARPETSHINY.get().defaultBlockState(), 3);
								} else {
									world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
											ElementureModBlocks.NETHERUMCARPET.get().defaultBlockState(), 3);
								}
							}
						} else if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ >= 2700
								&& CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 2916) {
							if (Math.random() < 0.0035) {
								world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
										ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("netherstarAGenRole", 7);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							} else {
								if (Math.random() < 0.01) {
									world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
											ElementureModBlocks.NETHERSTARCRUSTSHINY.get().defaultBlockState(), 3);
								} else {
									world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
											ElementureModBlocks.NETHERSTARCRUST.get().defaultBlockState(), 3);
								}
							}
						} else if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ < 2700
								&& CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ >= 2350) {
							if (CoordsY < -35) {
								world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
										ElementureModBlocks.PRISMATICCRYSTALBLOCK.get().defaultBlockState(), 3);
							} else if (CoordsY > 38) {
								if (Math.random() < 0.00175) {
									world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
											ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getTileData().putDouble("netherstarAGenRole", 11);
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
								} else {
									if (Math.random() < 0.01) {
										world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
												ElementureModBlocks.NETHERUM.get().defaultBlockState(), 3);
									} else {
										world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
												ElementureModBlocks.NETHERUM.get().defaultBlockState(), 3);
									}
								}
							} else {
								if (Math.random() < 0.01) {
									world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
											ElementureModBlocks.NETHERUM.get().defaultBlockState(), 3);
								} else {
									world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
											ElementureModBlocks.NETHERUM.get().defaultBlockState(), 3);
								}
							}
						} else {
							if (CoordsY < -35) {
								if (CoordsX * CoordsX + Math.floor(Math.abs((CoordsY + 8) / 3.5)) * 216 + CoordsZ * CoordsZ >= 2300) {
									if (CoordsX * CoordsX + Math.floor(Math.abs((CoordsY + 8) / 3.55)) * 216 + CoordsZ * CoordsZ <= 2300
											&& Math.random() < 0.037) {
										world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
												ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("netherstarAGenRole", 12);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									} else {
										world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
												ElementureModBlocks.PRISMATICCRYSTALBLOCK.get().defaultBlockState(), 3);
									}
								} else {
									world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
								}
							} else {
								if (Math.random() < 0.00028 && CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ < 2350
										&& CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ >= 1560) {
									if (Math.random() < 0.15) {
										world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
												ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("netherstarAGenRole", 13);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									} else {
										world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
												ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("netherstarAGenRole", 1);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("platformSize", Math.round(Math.random() * 5 + 1));
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									}
								} else if (Math.random() < 0.000053 && CoordsY > 24) {
									if (Math.random() < 0.15) {
										world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
												ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("netherstarAGenRole", 13);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									} else {
										world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
												ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("netherstarAGenRole", 1);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("platformSize", Math.round(Math.random() * 8 + 4));
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									}
								} else if (Math.random() < 0.00087 && CoordsY > 24 && Math.random() >= 0.00004625) {
									world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
											ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
									if (!world.isClientSide()) {
										BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
										BlockEntity _blockEntity = world.getBlockEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_blockEntity != null)
											_blockEntity.getTileData().putDouble("netherstarAGenRole", 10);
										if (world instanceof Level _level)
											_level.sendBlockUpdated(_bp, _bs, _bs, 3);
									}
								} else if (Math.random() < 0.00038 && CoordsY > -20 && CoordsY < 25) {
									if (Math.random() < 0.15) {
										world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
												ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("netherstarAGenRole", 13);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									} else {
										world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
												ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("netherstarAGenRole", 1);
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
										if (!world.isClientSide()) {
											BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
											BlockEntity _blockEntity = world.getBlockEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_blockEntity != null)
												_blockEntity.getTileData().putDouble("platformSize", Math.round(Math.random() * 8 + 4));
											if (world instanceof Level _level)
												_level.sendBlockUpdated(_bp, _bs, _bs, 3);
										}
									}
								} else {
									world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
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
					}.getValue(world, new BlockPos(x + CoordsX, 0, z + CoordsZ), "netherstarUsed"))) {
						world.setBlock(new BlockPos(x + CoordsX, 0, z + CoordsZ), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + CoordsX, 0, z + CoordsZ);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putBoolean("netherstarUsed", (true));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
						if (CoordsX == 0) {
							world.setBlock(new BlockPos(x + CoordsX, 1, z + CoordsZ), ElementureModBlocks.NETHERITEORE.get().defaultBlockState(), 3);
							if (Math.random() < 0.5) {
								world.setBlock(new BlockPos(x + CoordsX, 2, z + CoordsZ), ElementureModBlocks.NETHERITEORE.get().defaultBlockState(),
										3);
							}
						}
					}
				} else {
					if (!(new Object() {
						public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos(x + CoordsX, 0, z + CoordsZ), "netherstarUsed"))) {
						world.setBlock(new BlockPos(x + CoordsX, 0, z + CoordsZ), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + CoordsX, 0, z + CoordsZ);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putBoolean("netherstarUsed", (true));
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
				}
			} else if (CoordsX * CoordsX + CoordsZ * CoordsZ <= 2916 && CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ >= 2700
					&& y + CoordsY >= 128 && y + CoordsY <= 130) {
				if (y + CoordsY == 130 && Math.random() < 0.03) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
							ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
					if (Math.random() < 0.5) {
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("netherstarAGenRole", 15);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else {
						if (CoordsZ < 0) {
							if (CoordsX < -20) {
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("netherstarAGenRole", 19);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							} else if (CoordsX > 20) {
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("netherstarAGenRole", 17);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							} else {
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("netherstarAGenRole", 16);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							}
						} else {
							if (CoordsX < -20) {
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("netherstarAGenRole", 19);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							} else if (CoordsX > 20) {
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("netherstarAGenRole", 17);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							} else {
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("netherstarAGenRole", 18);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							}
						}
					}
				} else {
					if (Math.random() < 0.01) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
								ElementureModBlocks.NETHERUMCARPETSHINY.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
								ElementureModBlocks.NETHERUMCARPET.get().defaultBlockState(), 3);
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 54) {
				CoordsX = -54;
				CoordsY = CoordsY + 1;
				if (CoordsY == 54) {
					CoordsX = -54;
					CoordsY = -54;
					CoordsZ = CoordsZ + 1;
					if (CoordsZ == 54) {
						CoordsX = -54;
						CoordsY = -54;
						CoordsZ = -54;
						if (loadWait <= 0) {
							if (world instanceof ServerLevel _origLevel) {
								LevelAccessor _worldorig = world;
								world = _origLevel.getServer().getLevel(Level.NETHER);
								if (world != null) {
									if (world instanceof ServerLevel _level)
										_level.getServer().getCommands().performCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3((x + CoordsX), y, (z + CoordsZ)), Vec2.ZERO,
														_level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
												"forceload add ~ ~");
								}
								world = _worldorig;
							}
							loadWait = 16;
						} else {
							loadWait = loadWait - 1;
						}
					}
				}
			}
		}
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "netherstarvillage"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 15, y + 25, z - 12), new BlockPos(x - 15, y + 25, z - 12),
						new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putDouble("netherstarOGenRole", 1);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		StarryplainsFloorGenProcedure.execute(world, x, 129, z);
		if (Math.random() < 0.25) {
			world.setBlock(new BlockPos(x + 28, 58, z), ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x + 28, 58, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("netherstarAGenRole", 8);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (Math.random() < 0.25) {
			world.setBlock(new BlockPos(x - 28, 58, z), ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x - 28, 58, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("netherstarAGenRole", 8);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (Math.random() < 0.25) {
			world.setBlock(new BlockPos(x, 58, z - 28), ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, 58, z - 28);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("netherstarAGenRole", 8);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			world.setBlock(new BlockPos(x, 58, z + 28), ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, 58, z + 28);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("netherstarAGenRole", 8);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}

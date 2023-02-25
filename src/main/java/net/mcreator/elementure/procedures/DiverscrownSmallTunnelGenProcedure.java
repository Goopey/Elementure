package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.ElementureMod;

public class DiverscrownSmallTunnelGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double h1 = 0;
		double h2 = 0;
		double h3 = 0;
		double maxX = 0;
		double repeatTimes = 0;
		double actualHeight = 0;
		actualHeight = 60;
		LilypadSmallGenProcedure.execute(world, x, actualHeight, z);
		ElementureMod.queueServerWork(5, () -> {
			DiverscrownSmallMainRootProcedure.execute(world, x, 48, z);
		});
		locX = -32;
		locY = -9;
		locZ = -32;
		actualHeight = 51;
		for (int index0 = 0; index0 < (int) (38025); index0++) {
			if (locX * locX + (locY + 9) * (locY + 9) * 21.78 + locZ * locZ <= 1024) {
				if (locX * locX + (locY + 9) * (locY + 9) * 21.78 + locZ * locZ > 729) {
					world.setBlock(new BlockPos(x + locX, actualHeight + locY, z + locZ), ElementureModBlocks.DIVERSSTONE.get().defaultBlockState(),
							3);
				} else if (locX * locX + (locY + 9) * (locY + 9) * 21.78 + locZ * locZ > 625) {
					if (Math.random() < 0.15) {
						world.setBlock(new BlockPos(x + locX, actualHeight + locY + 2, z + locZ),
								ElementureModBlocks.DIVERSCROWN_OMEGAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + locX, actualHeight + locY + 2, z + locZ);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("diverscrownOmeganRole", 4);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
					world.setBlock(new BlockPos(x + locX, actualHeight + locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + locX, actualHeight + locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 32) {
				locX = -32;
				locZ = locZ + 1;
				if (locZ > 32) {
					locX = -32;
					locZ = -32;
					locY = locY + 1;
					if (locY > 0) {
						locX = -32;
						locY = -9;
						locZ = -32;
					}
				}
			}
		}
		locX = -32;
		locY = -7;
		locZ = -32;
		for (int index1 = 0; index1 < (int) (38025); index1++) {
			if (locX * locX + (locY - 2) * (locY - 2) * 21.78 + locZ * locZ <= 1024) {
				if (locX * locX + locY * locY * 3 + locZ * locZ < 100) {
					if (locX * locX + locY * locY * 3 + locZ * locZ > 64) {
						world.setBlock(new BlockPos(x + locX, locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, locY - 1, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, locY - 2, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, locY - 3, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, locY - 4, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, locY - 5, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						if (!((world.getBlockState(new BlockPos(x + locX, locY - 6, z + locZ))).getBlock() == Blocks.WATER)) {
							world.setBlock(new BlockPos(x + locX, locY - 6, z + locZ), ElementureModBlocks.TARBLOCK.get().defaultBlockState(), 3);
						}
						if (!((world.getBlockState(new BlockPos(x + locX, locY - 7, z + locZ))).getBlock() == Blocks.WATER)) {
							world.setBlock(new BlockPos(x + locX, locY - 7, z + locZ), ElementureModBlocks.TARBLOCK.get().defaultBlockState(), 3);
						}
					} else {
						world.setBlock(new BlockPos(x + locX, locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, locY - 1, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, locY - 2, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, locY - 3, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, locY - 4, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, locY - 5, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, locY - 6, z + locZ), Blocks.WATER.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + locX, locY - 7, z + locZ), Blocks.WATER.defaultBlockState(), 3);
					}
				} else if (locX * locX + (locY - 2) * (locY - 2) * 21.78 + locZ * locZ > 729) {
					if (Math.random() < 0.0375) {
						DiverscrownSpikeGenProcedure.execute(world, (x + locX), locY, (z + locZ));
					}
					world.setBlock(new BlockPos(x + locX, locY, z + locZ), ElementureModBlocks.DEEPDIVERSSTONE.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + locX, locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 32) {
				locX = -32;
				locZ = locZ + 1;
				if (locZ > 32) {
					locX = -32;
					locZ = -32;
					locY = locY + 1;
					if (locY > 2) {
						locX = -32;
						locY = -7;
						locZ = -32;
					}
				}
			}
		}
		locX = -32;
		locZ = -32;
		actualHeight = 60;
		h1 = 2;
		h2 = actualHeight - 9;
		h3 = actualHeight - 18;
		locY = h1;
		maxX = locX * (-2) + 1;
		for (int index2 = 0; index2 < (int) (maxX * maxX * h3); index2++) {
			if (locX * locX + locZ * locZ <= 961) {
				if (locX * locX + locZ * locZ > 841) {
					if (Math.random() < 0.00035 && locY < 60) {
						world.setBlock(new BlockPos(x + locX, locY, z + locZ), ElementureModBlocks.DIVERSCROWN_OMEGAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + locX, locY, z + locZ);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getPersistentData().putDouble("diverscrownOmeganRole", 2);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					} else {
						world.setBlock(new BlockPos(x + locX, locY, z + locZ), ElementureModBlocks.DIVERSSTONE.get().defaultBlockState(), 3);
						if (Math.random() < 0.5) {
							if (locX < 0 && locZ < 0) {
								world.setBlock(new BlockPos(x + locX + Math.round(Math.random()), locY + Math.round(Math.random() * 2 - 1),
										z + locZ + Math.round(Math.random())), ElementureModBlocks.DIVERSSTONE.get().defaultBlockState(), 3);
							} else if (locX > 0 && locZ < 0) {
								world.setBlock(new BlockPos(x + locX + Math.round(Math.random() * (-1)), locY + Math.round(Math.random() * 2 - 1),
										z + locZ + Math.round(Math.random())), ElementureModBlocks.DIVERSSTONE.get().defaultBlockState(), 3);
							} else if (locX < 0 && locZ > 0) {
								world.setBlock(
										new BlockPos(x + locX + Math.round(Math.random()), locY + Math.round(Math.random() * 2 - 1),
												z + locZ + Math.round(Math.random() * (-1))),
										ElementureModBlocks.DIVERSSTONE.get().defaultBlockState(), 3);
							} else {
								world.setBlock(
										new BlockPos(x + locX + Math.round(Math.random() * (-1)), locY + Math.round(Math.random() * 2 - 1),
												z + locZ + Math.round(Math.random() * (-1))),
										ElementureModBlocks.DIVERSSTONE.get().defaultBlockState(), 3);
							}
						}
					}
				} else {
					world.setBlock(new BlockPos(x + locX, locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 32) {
				locX = -32;
				locZ = locZ + 1;
				if (locZ > 32) {
					locX = -32;
					locZ = -32;
					locY = locY + 1;
					if (locY > h2) {
						locX = -32;
						locZ = -32;
						locY = h1;
					}
				}
			}
		}
		repeatTimes = 1;
		for (int index3 = 0; index3 < (int) (10); index3++) {
			ElementureMod.queueServerWork((int) (repeatTimes * 5), () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, 60, z), Vec2.ZERO, _level, 4, "",
									Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"kill @e[type=minecraft:item, distance=0..40]");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, 30, z), Vec2.ZERO, _level, 4, "",
									Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"kill @e[type=minecraft:item, distance=0..40]");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, 0, z), Vec2.ZERO, _level, 4, "",
									Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"kill @e[type=minecraft:item, distance=0..40]");
			});
			repeatTimes = repeatTimes + 1;
		}
	}
}

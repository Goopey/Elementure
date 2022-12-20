package net.mcreator.elementure.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DiverscrownLargeTunnelGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double h1 = 0;
		double h2 = 0;
		double h3 = 0;
		double maxX = 0;
		double repeatTimes = 0;
		LilypadLargeGenProcedure.execute(world, x, y, z);
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				DiverscrownMainRootProcedure.execute(world, x, (y - 15), z);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 5);
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				DiverscrownSmallTunnelGenProcedure.execute(world, (x - 66), 0, z);
				DiverscrownSmallTunnelGenProcedure.execute(world, (x + 66), 0, z);
				DiverscrownSmallTunnelGenProcedure.execute(world, x, 0, (z - 66));
				DiverscrownSmallTunnelGenProcedure.execute(world, x, 0, (z + 66));
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 10);
		locX = -44;
		locY = -9;
		locZ = -44;
		for (int index0 = 0; index0 < (int) (71289); index0++) {
			if (locX * locX + (locY + 9) * (locY + 9) * 21.78 + locZ * locZ <= 1936) {
				if (locX * locX + (locY + 9) * (locY + 9) * 21.78 + locZ * locZ > 1521) {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.DIVERSSTONE.get().defaultBlockState(), 3);
				} else if (locX * locX + (locY + 9) * (locY + 9) * 21.78 + locZ * locZ > 1369) {
					if (Math.random() < 0.1) {
						world.setBlock(new BlockPos(x + locX, y + locY + 2, z + locZ),
								ElementureModBlocks.DIVERSCROWN_OMEGAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + locX, y + locY + 2, z + locZ);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("diverscrownOmeganRole", 4);
							if (world instanceof Level _level)
								_level.sendBlockUpdated(_bp, _bs, _bs, 3);
						}
					}
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 44) {
				locX = -44;
				locZ = locZ + 1;
				if (locZ > 44) {
					locX = -44;
					locZ = -44;
					locY = locY + 1;
					if (locY > 0) {
						locX = -44;
						locY = -9;
						locZ = -44;
					}
				}
			}
		}
		locX = -44;
		locY = 0;
		locZ = -44;
		for (int index1 = 0; index1 < (int) (71289); index1++) {
			if (locX * locX + (locY - 9) * (locY - 9) * 21.78 + locZ * locZ <= 1936) {
				if (locX * locX + locZ * locZ < 144) {
					world.setBlock(new BlockPos(x + locX, locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, locY - 1, z + locZ), Blocks.WATER.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, locY - 2, z + locZ), Blocks.WATER.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, locY - 3, z + locZ), Blocks.WATER.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, locY - 4, z + locZ), Blocks.WATER.defaultBlockState(), 3);
				} else if (locX * locX + (locY - 9) * (locY - 9) * 21.78 + locZ * locZ > 1521) {
					if (Math.random() < 0.0375) {
						DiverscrownSpikeGenProcedure.execute(world, (x + locX), locY, (z + locZ));
					}
					world.setBlock(new BlockPos(x + locX, locY, z + locZ), ElementureModBlocks.DEEPDIVERSSTONE.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + locX, locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 44) {
				locX = -44;
				locZ = locZ + 1;
				if (locZ > 44) {
					locX = -44;
					locZ = -44;
					locY = locY + 1;
					if (locY > 9) {
						locX = -44;
						locY = 0;
						locZ = -44;
					}
				}
			}
		}
		locX = -44;
		locZ = -44;
		h1 = 9;
		h2 = y - 9;
		h3 = y - 18;
		locY = h1;
		maxX = locX * (-2) + 1;
		for (int index2 = 0; index2 < (int) (maxX * maxX * h3); index2++) {
			if (locX * locX + locZ * locZ <= 1936) {
				if (locX * locX + locZ * locZ > 1521) {
					if (Math.random() < 0.00075 && locY < 60) {
						world.setBlock(new BlockPos(x + locX, locY, z + locZ), ElementureModBlocks.DIVERSCROWN_OMEGAN.get().defaultBlockState(), 3);
						if (!world.isClientSide()) {
							BlockPos _bp = new BlockPos(x + locX, locY, z + locZ);
							BlockEntity _blockEntity = world.getBlockEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_blockEntity != null)
								_blockEntity.getTileData().putDouble("diverscrownOmeganRole", 2);
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
			if (locX > 44) {
				locX = -44;
				locZ = locZ + 1;
				if (locZ > 44) {
					locX = -44;
					locZ = -44;
					locY = locY + 1;
					if (locY > h2) {
						locX = -44;
						locZ = -44;
						locY = h1;
					}
				}
			}
		}
		repeatTimes = 1;
		for (int index3 = 0; index3 < (int) (10); index3++) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
										new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
										"kill @e[type=minecraft:item, distance=0..40]");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 40), z), Vec2.ZERO, _level, 4, "",
												new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
										"kill @e[type=minecraft:item, distance=0..40]");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 80), z), Vec2.ZERO, _level, 4, "",
												new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
										"kill @e[type=minecraft:item, distance=0..40]");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 120), z), Vec2.ZERO, _level, 4, "",
												new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
										"kill @e[type=minecraft:item, distance=0..40]");
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(x, (y - 160), z), Vec2.ZERO, _level, 4, "",
												new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
										"kill @e[type=minecraft:item, distance=0..40]");
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) (repeatTimes * 5));
			repeatTimes = repeatTimes + 1;
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				DiverscrownSirenheartGenProcedure.execute(world, x, 12, z);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 60);
	}
}

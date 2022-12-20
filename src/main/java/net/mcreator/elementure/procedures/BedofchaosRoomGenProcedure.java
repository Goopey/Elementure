package net.mcreator.elementure.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class BedofchaosRoomGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double BEDROCK_LEVEL = 0;
		locX = -64;
		locY = -64;
		locZ = -64;
		BEDROCK_LEVEL = -64;
		for (int index0 = 0; index0 < (int) (16641); index0++) {
			if (Math.pow(Math.abs(locX / 2), 4.0) + Math.pow(Math.abs(locZ / 2), 4.0) <= 1048576) {
				if (!((world.getBlockState(new BlockPos(x + locX, BEDROCK_LEVEL, z + locZ))).getBlock() == ElementureModBlocks.PERVADEDBEDROCK
						.get())) {
					world.setBlock(new BlockPos(x + locX, BEDROCK_LEVEL, z + locZ), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + locX, BEDROCK_LEVEL, z + locZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putBoolean("diverscrownUsed", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			if (Math.pow(Math.abs(locX), 2) + Math.pow(Math.abs(locZ), 2) <= 1444) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x + locX, BEDROCK_LEVEL, z + locZ);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putBoolean("diverscrowncenterUsed", (true));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			locX = locX + 1;
			if (locX > 64) {
				locX = -64;
				locZ = locZ + 1;
				if (locZ > 64) {
					locX = -64;
					locZ = -64;
				}
			}
		}
		locX = -80;
		locY = -64;
		locZ = -80;
		for (int index1 = 0; index1 < (int) (1658944); index1++) {
			if (locY > -64) {
				if (Math.pow(Math.abs(locX / 2), 4.0) + Math.pow((Math.abs(locY) - 40), 4.0) + Math.pow(Math.abs(locZ / 2), 4.0) <= 2560000) {
					if (Math.pow(Math.abs(locX / 2), 4.0) + Math.pow((Math.abs(locY) - 40), 4.0) + Math.pow(Math.abs(locZ / 2), 4.0) >= 1679616) {
						world.setBlock(new BlockPos(x + locX, locY, z + locZ), ElementureModBlocks.TARBLOCK.get().defaultBlockState(), 3);
						if (Math.random() < 0.00105) {
							if (Math.pow(Math.abs(locX / 2), 4.0) + Math.pow((Math.abs(locY) - 40), 4.0)
									+ Math.pow(Math.abs(locZ / 2), 4.0) <= 2085136) {
								if (locY >= -9) {
									BedofchaosDarkspireTopGenProcedure.execute(world, (x + locX), (locY - 4), (z + locZ));
								} else if (Math.abs(locX) >= Math.abs(locZ)) {
									if (locX < 0) {
										BedofchaosDarkspireEastGenProcedure.execute(world, (x + locX + 3), locY, (z + locZ));
									} else {
										BedofchaosDarkspireWestGenProcedure.execute(world, ((x + locX) - 3), locY, (z + locZ));
									}
								} else {
									if (locZ < 0) {
										BedofchaosDarkspireNorthGenProcedure.execute(world, (x + locX), locY, (z + locZ + 3));
									} else {
										BedofchaosDarkspireSouthGenProcedure.execute(world, (x + locX), locY, ((z + locZ) - 3));
									}
								}
							}
						}
					} else {
						if (locY < -59) {
							world.setBlock(new BlockPos(x + locX, locY, z + locZ), ElementureModBlocks.TARBLOCK.get().defaultBlockState(), 3);
						} else if (locY < -58) {
							if (Math.random() < 0.0175) {
								world.setBlock(new BlockPos(x + locX, locY, z + locZ),
										ElementureModBlocks.DIVERSCROWN_OMEGAN.get().defaultBlockState(), 3);
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x + locX, locY, z + locZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("diverscrownOmeganRole", 6);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							} else {
								world.setBlock(new BlockPos(x + locX, locY, z + locZ), ElementureModBlocks.DEEPBRINE.get().defaultBlockState(), 3);
							}
						} else if (locY < -57) {
							world.setBlock(new BlockPos(x + locX, locY, z + locZ), ElementureModBlocks.DEEPBRINE.get().defaultBlockState(), 3);
						} else {
							if (locY < -12 && Math.random() < 0.0001) {
								world.setBlock(new BlockPos(x + locX, locY, z + locZ),
										ElementureModBlocks.DIVERSCROWN_OMEGAN.get().defaultBlockState(), 3);
								if (!world.isClientSide()) {
									BlockPos _bp = new BlockPos(x + locX, locY, z + locZ);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getTileData().putDouble("diverscrownOmeganRole", 7);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							} else {
								world.setBlock(new BlockPos(x + locX, locY, z + locZ), Blocks.WATER.defaultBlockState(), 3);
							}
						}
					}
				}
			}
			locX = locX + 1;
			if (locX > 80) {
				locX = -80;
				locZ = locZ + 1;
				if (locZ > 80) {
					locX = -80;
					locZ = -80;
					locY = locY + 1;
					if (locY > 0) {
						locX = -80;
						locY = -64;
						locZ = -80;
					}
				}
			}
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
				TaravatarshrineGenProcedure.execute(world, x, (-53), z);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 60);
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
				if (Math.random() < 0.25) {
					CrystalPalaceBoxGenProcedure.execute(world, (x - 140), (-30), z);
				} else if (Math.random() < 0.33) {
					CrystalPalaceBoxGenProcedure.execute(world, (x + 140), (-30), z);
				} else if (Math.random() < 0.5) {
					CrystalPalaceBoxGenProcedure.execute(world, x, (-30), (z - 140));
				} else {
					CrystalPalaceBoxGenProcedure.execute(world, x, (-30), (z + 140));
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 60);
	}
}

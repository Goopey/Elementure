package net.mcreator.elementure.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DiverscrownHillSideGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locY = 0;
		if (y > 14) {
			if (Math.random() < 0.005) {
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
						BoulderPatchGenProcedure.execute(world, x, y, z);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 5);
			}
			locY = -3;
			while (!world.getBlockState(new BlockPos(x, y + locY, z)).canOcclude() && y + locY > 14) {
				world.setBlock(new BlockPos(x, y + locY, z), Blocks.STONE.defaultBlockState(), 3);
				locY = locY - 1;
			}
			world.setBlock(new BlockPos(x, y + locY, z), Blocks.STONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, (y + locY) - 1, z), Blocks.STONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, (y + locY) - 2, z), Blocks.STONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, (y + locY) - 3, z), Blocks.STONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, (y + locY) - 4, z), Blocks.STONE.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, (y + locY) - 5, z), Blocks.STONE.defaultBlockState(), 3);
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
					if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.STONE)) {
						world.setBlock(new BlockPos(x, y, z), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x, y - 1, z), Blocks.DIRT.defaultBlockState(), 3);
						world.setBlock(new BlockPos(x, y - 2, z), Blocks.DIRT.defaultBlockState(), 3);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 3);
		}
	}
}

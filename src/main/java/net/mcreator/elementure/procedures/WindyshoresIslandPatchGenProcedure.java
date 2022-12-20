package net.mcreator.elementure.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;

public class WindyshoresIslandPatchGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locI = 0;
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
				WindyshoresIslandGenProcedure.execute(world, x, y, z);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 0);
		locI = 1;
		for (int index0 = 0; index0 < (int) (4); index0++) {
			if (Math.random() < 0.25) {
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
						WindyshoresIslandGenProcedure.execute(world, (x - 10 + Math.random() * 20),
								(y - 1 + (Math.random() * 3 * Math.random() * 3) / 3), (z - 10 + Math.random() * 20));
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) (locI * 2));
			}
			locI = locI + 1;
		}
	}
}

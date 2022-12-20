package net.mcreator.elementure.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;

public class WindyshoresIslandDecorationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
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
				if (Math.random() < 0.1) {
					BluethorntreeGenProcedure.execute(world, x, y, z);
				} else if (Math.random() < 0.1) {
					BeachstarsSpreadProcedure.execute(world, x, y, z);
				} else if (Math.random() < 0.33) {
					BoulderWindyShoresPatchProcedure.execute(world, x, y, z);
				} else if (Math.random() < 0.5) {
					FlufftreeWindyShoresPatchProcedure.execute(world, x, y, z);
				} else {
					WindyshoresBonemealGrassProcedure.execute(world, x, y, z);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 14);
	}
}

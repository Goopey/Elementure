package net.mcreator.elementure.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

public class StructureitemtesterRightClickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double LocalX = 0;
		double LocalZ = 0;
		ItemStack book = ItemStack.EMPTY;
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
				SpidernestBaseGenProcedure.execute(world, x, (y - 10), z);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 10);
	}
}

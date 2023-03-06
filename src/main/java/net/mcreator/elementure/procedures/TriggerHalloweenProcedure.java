package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.elementure.network.ElementureModVariables;

import javax.annotation.Nullable;

import java.util.Calendar;

@Mod.EventBusSubscriber
public class TriggerHalloweenProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double day = 0;
		double month = 0;
		if (Calendar.getInstance().get(Calendar.MONTH) == 9 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) >= 24 || Calendar.getInstance().get(Calendar.MONTH) == 10 && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) <= 1) {
			ElementureModVariables.MapVariables.get(world).isHalloween = true;
			ElementureModVariables.MapVariables.get(world).syncData(world);
		} else {
			ElementureModVariables.MapVariables.get(world).isHalloween = false;
			ElementureModVariables.MapVariables.get(world).syncData(world);
		}
	}
}

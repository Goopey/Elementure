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
public class TriggerChristmasProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.world);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double day = 0;
		double month = 0;
		day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		month = Calendar.getInstance().get(Calendar.MONTH);
		if (month == 12 && day >= 24 || month == 1 && day <= 1) {
			ElementureModVariables.MapVariables.get(world).isChristmas = true;
			ElementureModVariables.MapVariables.get(world).syncData(world);
		} else {
			ElementureModVariables.MapVariables.get(world).isChristmas = false;
			ElementureModVariables.MapVariables.get(world).syncData(world);
		}
	}
}

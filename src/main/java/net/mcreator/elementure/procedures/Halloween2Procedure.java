package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.network.ElementureModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Halloween2Procedure {
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
		if (ElementureModVariables.MapVariables.get(world).isHalloween) {
			if (world instanceof Level _level)
				_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set((false), _level.getServer());
			if (world instanceof ServerLevel _level)
				_level.setDayTime(16000);
		} else if (!world.getLevelData().getGameRules().getBoolean(GameRules.RULE_DAYLIGHT)) {
			if (world instanceof Level _level)
				_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set((true), _level.getServer());
		}
	}
}

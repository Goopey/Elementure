package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InsanityUpdateProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).sanity > 500) {
			{
				double _setval = 500;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.sanity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).sanity < 0) {
			{
				double _setval = 0;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.sanity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (!InsanityIsInDimensionProcedure.execute(entity)) {
			{
				double _setval = 500;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.sanity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).sanity > 0.02) {
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).sanity - 0.03;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.sanity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

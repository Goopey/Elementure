package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ObsidiantearEffectProcedure {
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
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getItem() == ElementureModItems.OBSIDIANTEAR.get()) {
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getOrCreateTag().getDouble("water") > 5) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getOrCreateTag().putDouble("water", 5);
			}
			if (!(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getOrCreateTag().getDouble("water") == 5)) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getOrCreateTag().putDouble("water",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getOrCreateTag().getDouble("water") + 0.01));
			}
			if (entity.isOnFire() && ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getOrCreateTag().getDouble("water") >= 1) {
				entity.clearFire();
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getOrCreateTag().putDouble("water",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getOrCreateTag().getDouble("water") - 1));
			}
		}
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getItem() == ElementureModItems.OBSIDIANTEAR.get()) {
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getOrCreateTag().getDouble("water") > 5) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getOrCreateTag().putDouble("water", 5);
			}
			if (!(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getOrCreateTag().getDouble("water") == 5)) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getOrCreateTag().putDouble("water",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getOrCreateTag().getDouble("water") + 0.01));
			}
			if (entity.isOnFire() && ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getOrCreateTag().getDouble("water") >= 1) {
				entity.clearFire();
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getOrCreateTag().putDouble("water",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getOrCreateTag().getDouble("water") - 1));
			}
		}
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getItem() == ElementureModItems.OBSIDIANTEAR.get()) {
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getOrCreateTag().getDouble("water") > 5) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getOrCreateTag().putDouble("water", 5);
			}
			if (!(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getOrCreateTag().getDouble("water") == 5)) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getOrCreateTag().putDouble("water",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getOrCreateTag().getDouble("water") + 0.01));
			}
			if (entity.isOnFire() && ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getOrCreateTag().getDouble("water") >= 1) {
				entity.clearFire();
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getOrCreateTag().putDouble("water",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getOrCreateTag().getDouble("water") - 1));
			}
		}
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getItem() == ElementureModItems.OBSIDIANTEAR.get()) {
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getOrCreateTag().getDouble("water") > 5) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getOrCreateTag().putDouble("water", 5);
			}
			if (!(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getOrCreateTag().getDouble("water") == 5)) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getOrCreateTag().putDouble("water",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getOrCreateTag().getDouble("water") + 0.01));
			}
			if (entity.isOnFire() && ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getOrCreateTag().getDouble("water") >= 1) {
				entity.clearFire();
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getOrCreateTag().putDouble("water",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getOrCreateTag().getDouble("water") - 1));
			}
		}
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getItem() == ElementureModItems.OBSIDIANTEAR.get()) {
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getOrCreateTag().getDouble("water") > 5) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getOrCreateTag().putDouble("water", 5);
			}
			if (!(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getOrCreateTag().getDouble("water") == 5)) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getOrCreateTag().putDouble("water",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getOrCreateTag().getDouble("water") + 0.01));
			}
			if (entity.isOnFire() && ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getOrCreateTag().getDouble("water") >= 1) {
				entity.clearFire();
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getOrCreateTag().putDouble("water",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getOrCreateTag().getDouble("water") - 1));
			}
		}
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getItem() == ElementureModItems.OBSIDIANTEAR.get()) {
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getOrCreateTag().getDouble("water") > 5) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getOrCreateTag().putDouble("water", 5);
			}
			if (!(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getOrCreateTag().getDouble("water") == 5)) {
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getOrCreateTag().putDouble("water",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getOrCreateTag().getDouble("water") + 0.01));
			}
			if (entity.isOnFire() && ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getOrCreateTag().getDouble("water") >= 1) {
				entity.clearFire();
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getOrCreateTag().putDouble("water",
						(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getOrCreateTag().getDouble("water") - 1));
			}
		}
	}
}

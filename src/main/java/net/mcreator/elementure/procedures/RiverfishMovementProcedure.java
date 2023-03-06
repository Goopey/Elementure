package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RiverfishMovementProcedure {
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
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("chub")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
					{
						double _setval = 5 * Math.random();
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.firstfishlaunch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 2 * (2 * Math.random() - 1);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 32;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 1.5 * Math.random();
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingEratic) - 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("smallBrum")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
					{
						double _setval = 8 * Math.random();
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.firstfishlaunch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 6 * (2 * Math.random() - 1);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 27;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 3 * Math.random();
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingEratic) - 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("trouish")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
					{
						double _setval = 24 * Math.random();
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.firstfishlaunch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 3 * (2 * Math.random() - 1);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 16;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 2 * Math.random();
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingEratic) - 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("trahira")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
					{
						double _setval = 2 * Math.random();
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.firstfishlaunch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = (5 * (2 * Math.random() - 0.5)) / Math.max(1, (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingEratic / 3);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 22;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 11 * Math.random();
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingEratic) - 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("pip")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
					{
						double _setval = 2 * Math.random();
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.firstfishlaunch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 4 * (2 * Math.random() - 1);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 18;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 12 * Math.random();
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingEratic) - 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("pacu")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
					{
						double _setval = 5 * Math.random();
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.firstfishlaunch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 4 * (2 * Math.random() - 1);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 22;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 3 * Math.random();
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingEratic) - 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("delaconcorde")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
					{
						double _setval = 3 * Math.random();
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.firstfishlaunch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 2 * (2 * Math.random() - 1);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 28;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.random();
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingEratic) - 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

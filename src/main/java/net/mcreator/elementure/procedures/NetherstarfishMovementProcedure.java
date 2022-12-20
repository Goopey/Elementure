package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NetherstarfishMovementProcedure {
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
		double temp_prismaticpip_pos = 0;
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("prismaticEel")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
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
						double _setval = 12 * (2 * Math.random() - 1);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 26;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.random() * 4;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ElementureModVariables.PlayerVariables())).fishingEratic)
							- 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("stripedDanio")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
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
						double _setval = (7 + (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer) * (2 * Math.random() - 1);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 26 - (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.random() * 3;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer > 3) {
					{
						double _setval = 0;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer + 1;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ElementureModVariables.PlayerVariables())).fishingEratic)
							- 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("prismaticPip")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if (Math.random() < 0.17) {
					temp_prismaticpip_pos = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishPos;
					{
						double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishPos = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = temp_prismaticpip_pos;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityPos = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
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
						double _setval = 6 * (2 * Math.random() - 1);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).firstabilitylaunch) {
					{
						double _setval = 5 * Math.random();
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = false;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.firstabilitylaunch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 7 * (2 * Math.random() - 1);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 24;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.round(Math.random() * 8);
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ElementureModVariables.PlayerVariables())).fishingEratic)
							- 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos
					+ (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer <= 156
					&& (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos
							+ (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer >= 0) {
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos
							+ (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityPos = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos
					+ (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer < 0) {
				{
					double _setval = 0;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityPos = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos
					+ (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer > 156) {
				{
					double _setval = 156;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityPos = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("crystalPip")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
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
						double _setval = 5 * (2 * Math.random() - 1);
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
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ElementureModVariables.PlayerVariables())).fishingEratic)
							- 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("betaFish")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
					{
						double _setval = 10 * Math.random();
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
						double _setval = 6 * (2 * Math.random() - 0.75);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 30;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.random() * 2;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ElementureModVariables.PlayerVariables())).fishingEratic)
							- 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer > 160) {
				{
					double _setval = 0;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 16;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.bobberStunTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer + 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("crumster")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
					{
						double _setval = 10 * Math.random();
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
						double _setval = 12 * (2 * Math.random() - 1.25);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 30;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.random() * 2;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ElementureModVariables.PlayerVariables())).fishingEratic)
							- 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("netherBrum")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
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
						double _setval = (7 + (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos) * (2 * Math.random() - 1);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = 26 - (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = Math.random() * 3;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingEratic = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer > 10) {
					{
						double _setval = 0;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 0;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityPos = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer > 6) {
					{
						double _setval = 6;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityPos = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer + 1;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer + 1;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				{
					double _setval = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishingWait
							- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new ElementureModVariables.PlayerVariables())).fishingEratic)
							- 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

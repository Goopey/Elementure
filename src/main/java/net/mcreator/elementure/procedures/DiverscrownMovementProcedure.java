package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.elementure.network.ElementureModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DiverscrownMovementProcedure {
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
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("rimeBoid")) {
			FishingbaseMovementProcedure.execute(entity, 32, 6, 10, 5, 3);
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("purpleTrouish")) {
			FishingbaseMovementProcedure.execute(entity, 32, 6, 8, 5, 2);
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).reelingTimer - 0.3;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.reelingTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("daggerLoach")) {
			FishingbaseMovementProcedure.execute(entity, 26, 10, 16, 8, 4);
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("rareDaggerLoach")) {
			FishingbaseMovementProcedure.execute(entity, 22, 12, 16, 8, 8);
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("redSnapper")) {
			FishingbaseMovementProcedure.execute(entity, 20, 8, 8, 4, 4);
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("mountainBrum")) {
			FishingbaseMovementProcedure.execute(entity, 24, 8, 10, 5, 3);
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("tarWormling")) {
			FishingbaseMovementProcedure.execute(entity, 20, 12, 16, 8, 1);
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer >= 80) {
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer + 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).firstabilitylaunch) {
					{
						boolean _setval = false;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.firstabilitylaunch = _setval;
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
					{
						double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).fishPos;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityPos = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos + Math.random() + 0.33;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityPos = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer >= 280) {
					{
						boolean _setval = true;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.firstabilitylaunch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.firstfishlaunch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = -40;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
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
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("cormunculusJelly")) {
			FishingbaseMovementProcedure.execute(entity, 18, 10, 20, 10, 1);
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getX()), (entity.getY() + 0.0125), (entity.getZ()));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getX()), (entity.getY() + 0.0125), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 0));
		}
	}
}

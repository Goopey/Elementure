package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LavafishmovementProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("magmaChub")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
					{
						double _setval = 16 * Math.random();
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
					double _setval = 28;
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
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("highTrahira")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
					{
						double _setval = 240 * Math.random();
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
					double _setval = 36;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 8 * Math.random();
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
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("magmaCarp")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				{
					double _setval = 10 * (2 * Math.random() - 1);
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishSpeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 36;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 4 * Math.random();
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
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("greenDemon")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishingWait <= 0) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
					{
						double _setval = 6 * Math.random();
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
				if (!(entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstabilitylaunch) {
					{
						double _setval = 6 * Math.random() + 2;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityTimer = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						boolean _setval = true;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.firstabilitylaunch = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = 12 * (2 * Math.random() - 1);
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishAbilityTimer = _setval;
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
					double _setval = 4 * Math.random();
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
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos
					+ (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer <= 156
					&& (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos
							+ (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer >= 0) {
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos
							+ (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityPos = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos
					+ (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer < 0) {
				{
					double _setval = 0;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityPos = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos
					+ (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer > 156) {
				{
					double _setval = 156;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityPos = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (Math.abs((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).bobberPos
					- ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos - 16)) - 1 <= 27
					&& Math.abs((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).bobberPos
							- ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityPos - 16)) - 1 >= 0) {
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).reelingTimer - 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.reelingTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("ashenFish")) {
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstfishlaunch) {
				{
					double _setval = 6 * Math.random();
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
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("magtunaBuster")) {
			FishingbaseMovementProcedure.execute(entity, 24, 10, 12, 6, 4);
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).firstabilitylaunch) {
				{
					boolean _setval = false;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.firstabilitylaunch = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 90;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer == 11) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.PLAYERS, (float) 0.7, (float) 0.5);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.PLAYERS, (float) 0.7, (float) 0.5, false);
					}
				}
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishPos;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityPos = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer - 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 24;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishingWait = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishPos <= 40) {
					{
						double _setval = 17;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishPos >= 116) {
					{
						double _setval = -17;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (Math.random() < 0.5) {
					{
						double _setval = 17;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = -17;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.fishSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer <= 0) {
				{
					double _setval = 90;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishAbilityTimer - 1;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishAbilityTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

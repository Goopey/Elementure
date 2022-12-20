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
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StarryislandFishMovementProcedure {
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
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("skyChub")) {
			FishingbaseMovementProcedure.execute(entity, 30, 8, 8, 3, 2);
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("mrL")) {
			FishingbaseMovementProcedure.execute(entity, 30, 8, 8, 5, 3);
			FishingbaseMovementProcedure.execute(entity, 22, 8, 8, 3, 4);
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("skipSnake")) {
			FishingbaseMovementProcedure.execute(entity, 26, 10, 14, 6, 3);
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).fishSpeed
						+ Math.signum((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).fishSpeed);
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fishSpeed = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("clod")) {
			FishingbaseMovementProcedure.execute(entity, 24, 2, 10, 3, 4);
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("angelPip")) {
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
					if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).firstabilitylaunch) {
						{
							double _setval = 12 * (2 * Math.random() - 1);
							entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.fishSpeed = _setval;
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
						{
							double _setval = Math.random() * 3;
							entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.fishingEratic = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						{
							double _setval = 14 * (2 * Math.random() - 1);
							entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.fishSpeed = _setval;
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
						{
							double _setval = Math.random() * 3.5;
							entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.fishingEratic = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
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
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).firstabilitylaunch) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).reelingTimer >= 155) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.large_blast")),
									SoundSource.NEUTRAL, (float) 2.33, (float) 0.33);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.firework_rocket.large_blast")),
									SoundSource.NEUTRAL, (float) 2.33, (float) 0.33, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:negative_dungeon_step_sound")),
									SoundSource.NEUTRAL, (float) 2.33, (float) 0.33);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:negative_dungeon_step_sound")),
									SoundSource.NEUTRAL, (float) 2.33, (float) 0.33, false);
						}
					}
					{
						double _setval = 30;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.reelingTimer = _setval;
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
				}
			} else {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).bobberButtonDown) {
					{
						double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).bobberSpeed + 0.2;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.bobberSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).bobberSpeed - 0.2;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.bobberSpeed = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).reelingTimer - 0.2;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.reelingTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("cometFish")) {
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
					if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).firstabilitylaunch) {
						{
							double _setval = 12 * (2 * Math.random() - 1);
							entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.fishSpeed = _setval;
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
						{
							double _setval = Math.random();
							entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.fishingEratic = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.STARFLOWERPARTICLE.get()), (entity.getX()),
									(entity.getY()), (entity.getZ()), 25, 0.5, 0.5, 0.5, 0.02);
						{
							double _setval = 22 * (2 * Math.random() - 1);
							entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.fishSpeed = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 26;
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
			if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).firstabilitylaunch) {
				if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).reelingTimer >= 155) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal.spawn")), SoundSource.NEUTRAL,
									(float) 1.33, (float) 0.33);
						} else {
							_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal.spawn")), SoundSource.NEUTRAL,
									(float) 1.33, (float) 0.33, false);
						}
					}
					{
						double _setval = 30;
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.reelingTimer = _setval;
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
				}
			} else {
				{
					double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).reelingTimer - 0.5;
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.reelingTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

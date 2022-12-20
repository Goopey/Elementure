package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;

public class DeepOceanfishingpoolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double rng = 0;
		rng = Math.random();
		{
			String _setval = "deepOcean";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fishBiome = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (world.getLevelData().isRaining() || world.getLevelData().isThundering()) {
			if (Math.random() < 0.05) {
				if ((entity.getDisplayName().getString()).equals("Lebigmaigre")) {
					if (Math.random() < 0.1) {
						{
							String _setval = "maxTrahira";
							entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.chosenFish = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						{
							String _setval = "trahira";
							entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.chosenFish = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else {
					{
						String _setval = "maxTrahira";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if (Math.random() < 0.67 && (new ResourceLocation("deep_lukewarm_ocean")
					.equals(world.getBiome(new BlockPos(entity.getX(), entity.getY(), entity.getZ())).value().getRegistryName())
					|| new ResourceLocation("warm_ocean")
							.equals(world.getBiome(new BlockPos(entity.getX(), entity.getY(), entity.getZ())).value().getRegistryName()))) {
				{
					String _setval = "warm";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishBiome = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (rng < 0.12) {
					{
						String _setval = "grapplerCrab";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						String _setval = "melsh";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if (rng < 0.25) {
				{
					String _setval = "chub";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rng < 0.33) {
				{
					String _setval = "greatBrum";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rng < 0.63) {
				{
					String _setval = "halibut";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rng < 0.74) {
				{
					String _setval = "eel";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					String _setval = "cthulhu";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			if (Math.random() < 0.73 && (new ResourceLocation("deep_lukewarm_ocean")
					.equals(world.getBiome(new BlockPos(entity.getX(), entity.getY(), entity.getZ())).value().getRegistryName())
					|| new ResourceLocation("warm_ocean")
							.equals(world.getBiome(new BlockPos(entity.getX(), entity.getY(), entity.getZ())).value().getRegistryName()))) {
				{
					String _setval = "warm";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fishBiome = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (rng < 0.1) {
					{
						String _setval = "grapplerCrab";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						String _setval = "melsh";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if (rng < 0.02) {
				{
					String _setval = "aggressiveShaub";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rng < 0.33) {
				{
					String _setval = "chub";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rng < 0.63) {
				{
					String _setval = "greatBrum";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					String _setval = "halibut";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

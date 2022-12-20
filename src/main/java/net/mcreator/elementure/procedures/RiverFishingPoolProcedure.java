package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class RiverFishingPoolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		rnd = Math.random();
		{
			String _setval = "river";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fishBiome = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (world.dayTime() % 24000 < 11000) {
			if (world.getLevelData().isRaining() || world.getLevelData().isThundering()) {
				if (rnd < 0.13) {
					{
						String _setval = "chub";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (rnd < 0.25) {
					{
						String _setval = "smallBrum";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (rnd < 0.4) {
					{
						String _setval = "trouish";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (rnd < 0.7) {
					{
						String _setval = "pip";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (rnd < 0.705 && !ElementureModVariables.WorldVariables.get(world).delaconcordefound) {
					{
						String _setval = "delaconcorde";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (rnd < 0.8) {
					{
						String _setval = "pacu";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (rnd < 0.95) {
					{
						String _setval = "shaub";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						String _setval = "blabberMouth";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				if (rnd < 0.02) {
					{
						String _setval = "shaub";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (rnd < 0.2) {
					{
						String _setval = "chub";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (rnd < 0.48) {
					{
						String _setval = "smallBrum";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (rnd < 0.7) {
					{
						String _setval = "trahira";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (rnd < 0.78) {
					{
						String _setval = "pip";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (rnd < 0.9) {
					{
						String _setval = "pacu";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						String _setval = "trouish";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else {
			NightRiverFishingPoolProcedure.execute(world, entity);
		}
	}
}

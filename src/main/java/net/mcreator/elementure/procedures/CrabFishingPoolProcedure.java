package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class CrabFishingPoolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		{
			String _setval = "warm";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fishBiome = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		rnd = Math.random();
		if (world.getLevelData().isRaining() || world.getLevelData().isThundering()) {
			if (rnd < 0.2) {
				{
					String _setval = "bubbleCrab";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rnd < 0.32) {
				{
					String _setval = "spikerCrab";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rnd < 0.48) {
				{
					String _setval = "shrimp";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rnd < 0.66) {
				{
					String _setval = "grapplerCrab";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rnd < 0.9) {
				{
					String _setval = "periwinkle";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rnd < 0.98) {
				{
					String _setval = "rarewinkle";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					String _setval = "nanoShrimps";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else {
			if (rnd < 0.18) {
				{
					String _setval = "bubbleCrab";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rnd < 0.36) {
				{
					String _setval = "spikerCrab";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rnd < 0.52) {
				{
					String _setval = "shrimp";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rnd < 0.72) {
				{
					String _setval = "grapplerCrab";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rnd < 0.95) {
				{
					String _setval = "periwinkle";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (rnd < 0.99) {
				{
					String _setval = "rarewinkle";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					String _setval = "nanoShrimps";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}

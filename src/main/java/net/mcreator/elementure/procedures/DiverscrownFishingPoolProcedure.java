package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class DiverscrownFishingPoolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		{
			String _setval = "diversCrown";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fishBiome = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		rnd = Math.random();
		if (rnd < 0.25) {
			{
				String _setval = "rimeBoid";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.42) {
			{
				String _setval = "daggerLoach";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.47) {
			{
				String _setval = "rareDaggerLoach";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.62) {
			{
				String _setval = "mountainBrum";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.69) {
			{
				String _setval = "purpleTrouish";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.77) {
			{
				String _setval = "tarWormling";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.82) {
			{
				String _setval = "cormunculusJelly";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				String _setval = "redSnapper";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

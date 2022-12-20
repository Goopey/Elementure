package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class VoidFishingPoolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		{
			String _setval = "void";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fishBiome = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		rnd = Math.random();
		if (rnd < 0.3) {
			{
				String _setval = "memoryFish";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.5) {
			{
				String _setval = "memoryFishRare";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.8) {
			{
				String _setval = "supremeTrahira";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				String _setval = "chub";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

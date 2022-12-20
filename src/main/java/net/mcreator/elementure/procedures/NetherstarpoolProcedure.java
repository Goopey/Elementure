package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class NetherstarpoolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double rnd = 0;
		{
			String _setval = "netherStar";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fishBiome = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		rnd = Math.random();
		if (rnd < 0.1) {
			{
				String _setval = "prismaticEel";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.2) {
			{
				String _setval = "betaFish";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.25) {
			{
				String _setval = "prismaticPip";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.36) {
			{
				String _setval = "stripedDanio";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.52) {
			{
				String _setval = "crumster";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rnd < 0.78) {
			{
				String _setval = "netherBrum";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				String _setval = "crystalPip";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

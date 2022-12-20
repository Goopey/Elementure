package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class NetherfishingpoolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double rng = 0;
		{
			String _setval = "nether";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fishBiome = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		rng = Math.random();
		if (rng < 0.1) {
			{
				String _setval = "magmaChub";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rng < 0.2) {
			{
				String _setval = "highTRahira";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rng < 0.52) {
			{
				String _setval = "magmaCarp";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rng < 0.75) {
			{
				String _setval = "ashenFish";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (rng < 0.95) {
			{
				String _setval = "greenDemon";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				String _setval = "highTrahira";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

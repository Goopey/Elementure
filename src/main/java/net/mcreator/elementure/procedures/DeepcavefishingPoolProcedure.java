package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class DeepcavefishingPoolProcedure {
	public static void execute(Entity entity) {
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
		{
			String _setval = "trouish";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.chosenFish = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

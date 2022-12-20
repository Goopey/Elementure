package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class DiverscrownFishingPoolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "diversCrown";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fishBiome = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "rimeboid";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.chosenFish = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

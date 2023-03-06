package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class DankbladeGatherProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (Math.random() < 0.25) {
			{
				double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).dark_essence + 7;
				sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.dark_essence = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
			if (Math.random() < 0.5) {
				{
					double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).dark_essence + 3;
					sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.dark_essence = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
			}
		}
	}
}

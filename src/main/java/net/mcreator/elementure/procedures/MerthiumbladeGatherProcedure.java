package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class MerthiumbladeGatherProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (Math.random() < 0.2) {
			{
				double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).water_essence + 3;
				sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.water_essence = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}

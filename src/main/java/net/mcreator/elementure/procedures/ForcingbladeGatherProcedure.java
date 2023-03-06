package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class ForcingbladeGatherProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (Math.random() < 0.4) {
			{
				double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).force_essence + 4;
				sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.force_essence = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class UnholyaxeGatherProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (Math.random() < 0.21) {
			{
				double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).dark_essence + 4;
				sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.dark_essence = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class TruenailsoulgatherProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		{
			double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).soul_essence + 33;
			sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.soul_essence = _setval;
				capability.syncPlayerVariables(sourceentity);
			});
		}
	}
}

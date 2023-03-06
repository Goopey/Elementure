package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class CormunculuschannelerConsumeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (CormunculuschannelerGlowProcedure.execute(entity)) {
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).water_essence - 33;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.water_essence = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

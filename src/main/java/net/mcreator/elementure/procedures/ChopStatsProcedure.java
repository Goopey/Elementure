package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class ChopStatsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 5;
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.hitbox_delay = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 1.5;
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.hitbox_size = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 1;
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.hitbox_distance = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = 1.5;
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.hitbox_damage = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

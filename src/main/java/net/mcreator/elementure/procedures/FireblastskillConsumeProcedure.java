package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class FireblastskillConsumeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.isClientSide()) {
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence - 33;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fire_essence = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

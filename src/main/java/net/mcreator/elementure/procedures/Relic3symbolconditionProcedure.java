package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class Relic3symbolconditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean shouldRender = false;
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getItem() == Blocks.AIR.asItem()) {
			shouldRender = true;
		}
		return shouldRender;
	}
}

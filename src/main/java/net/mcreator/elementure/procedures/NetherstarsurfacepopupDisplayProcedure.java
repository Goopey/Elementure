package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class NetherstarsurfacepopupDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean ret_val = false;
		ret_val = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).zonename).equals("netherstarSurface")
				&& (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).newzonetime <= 60
				&& (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).newzonetime > 0;
		return ret_val;
	}
}

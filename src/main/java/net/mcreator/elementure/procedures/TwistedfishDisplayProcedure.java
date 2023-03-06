package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class TwistedfishDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean isFish = false;
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("twistedFish")) {
			isFish = true;
		} else {
			isFish = false;
		}
		return isFish;
	}
}

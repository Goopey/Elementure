package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class GreengillDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean isGreengill = false;
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("greengill")) {
			isGreengill = true;
		} else {
			isGreengill = false;
		}
		return isGreengill;
	}
}

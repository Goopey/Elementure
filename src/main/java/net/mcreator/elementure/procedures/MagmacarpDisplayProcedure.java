package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class MagmacarpDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean isCurrentFish = false;
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("magmaCarp")) {
			isCurrentFish = true;
		} else {
			isCurrentFish = false;
		}
		return isCurrentFish;
	}
}

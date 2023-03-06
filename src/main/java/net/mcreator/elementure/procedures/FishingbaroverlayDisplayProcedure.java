package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class FishingbaroverlayDisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean displayFishingOverlay = false;
		if (!((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("")) {
			displayFishingOverlay = true;
		} else {
			displayFishingOverlay = false;
		}
		return displayFishingOverlay;
	}
}

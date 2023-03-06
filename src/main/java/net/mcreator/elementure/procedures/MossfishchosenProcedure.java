package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class MossfishchosenProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean isFishChosen = false;
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("mossFish")) {
			isFishChosen = true;
		} else {
			isFishChosen = false;
		}
		return isFishChosen;
	}
}

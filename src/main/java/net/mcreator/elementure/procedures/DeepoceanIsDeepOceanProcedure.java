package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class DeepoceanIsDeepOceanProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fishBiome).equals("deepOcean");
	}
}

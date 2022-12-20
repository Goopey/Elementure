package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class Whitescreen2DisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getDouble("whitescreen") == 3 || entity.getPersistentData().getDouble("whitescreen") == 4;
	}
}

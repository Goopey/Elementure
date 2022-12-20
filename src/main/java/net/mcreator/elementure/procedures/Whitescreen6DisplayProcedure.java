package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class Whitescreen6DisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getDouble("whitescreen") == 11 || entity.getPersistentData().getDouble("whitescreen") == 12;
	}
}

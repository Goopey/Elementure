package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class Whitescreen1DisplayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return entity.getPersistentData().getDouble("white") == 1 || entity.getPersistentData().getDouble("white") == 2;
	}
}

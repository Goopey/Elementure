package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class RocketwormIsSegmentProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean retVal = false;
		retVal = !entity.getPersistentData().getBoolean("cannotSpawn");
		return retVal;
	}
}

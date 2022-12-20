package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class UmbrasylFireBreathTrackProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean shouldLook = false;
		shouldLook = entity.getPersistentData().getDouble("attackType") == 2 && entity.getPersistentData().getDouble("attackCooldown") > 100;
		return shouldLook;
	}
}

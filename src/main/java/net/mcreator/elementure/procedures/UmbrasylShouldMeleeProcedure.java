package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class UmbrasylShouldMeleeProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean shouldMelee = false;
		shouldMelee = entity.getPersistentData().getBoolean("umbrasylWillMelee");
		return shouldMelee;
	}
}

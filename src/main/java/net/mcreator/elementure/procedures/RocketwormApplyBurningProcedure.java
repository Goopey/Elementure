package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class RocketwormApplyBurningProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}

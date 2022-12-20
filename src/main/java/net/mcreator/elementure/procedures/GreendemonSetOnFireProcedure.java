package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class GreendemonSetOnFireProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(60);
	}
}

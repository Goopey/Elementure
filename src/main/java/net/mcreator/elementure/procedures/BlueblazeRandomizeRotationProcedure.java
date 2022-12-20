package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class BlueblazeRandomizeRotationProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("animRot", Math.random());
	}
}

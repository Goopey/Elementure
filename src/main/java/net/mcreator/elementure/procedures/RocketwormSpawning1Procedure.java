package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class RocketwormSpawning1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
	}
}

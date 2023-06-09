package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.ElementureMod;

public class StructureitemtesterItemInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double pitch = 0;
		double yaw = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		ElementureMod.LOGGER.info(entity.getDeltaMovement().y());
	}
}

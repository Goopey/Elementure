package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class SmallobleckTimerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("smallobleckdeathtimer", (entity.getPersistentData().getDouble("smallobleckdeathtimer") + 1));
		if (entity.getPersistentData().getDouble("smallobleckdeathtimer") > 300) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}

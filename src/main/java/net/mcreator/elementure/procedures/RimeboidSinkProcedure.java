package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class RimeboidSinkProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.isInWater()) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}

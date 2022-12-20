package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class BubbleCrabRestoreBreathProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setAirSupply((int) entity.getMaxAirSupply());
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class TwistedknightDenyAttackProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("orientBlast")) {
			entity.getPersistentData().putDouble("stagger", (entity.getPersistentData().getDouble("stagger") + 1));
		} else {
			entity.getPersistentData().putDouble("stagger", 0);
		}
	}
}

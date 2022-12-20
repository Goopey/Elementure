package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class KingsknightDenyAttackProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("orientBlast")) {
			entity.getPersistentData().putDouble("stagger", (entity.getPersistentData().getDouble("stagger") + 1));
		} else {
			entity.getPersistentData().putDouble("stagger", 0);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
	}
}

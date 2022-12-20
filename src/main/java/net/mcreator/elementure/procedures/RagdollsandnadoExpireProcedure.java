package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class RagdollsandnadoExpireProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.000081) {
			entity.hurt(DamageSource.GENERIC, 1);
		}
	}
}

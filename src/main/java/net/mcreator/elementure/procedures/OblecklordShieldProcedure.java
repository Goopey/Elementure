package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageSource;

public class OblecklordShieldProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("shields") >= 1) {
			if (Math.random() < 0.5) {
				entity.hurt(DamageSource.GENERIC, 1);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 100) {
				if (Math.random() < 0.5) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.DAMAGE_RESISTANCE);
					entity.getPersistentData().putDouble("shields", 0);
				}
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.DAMAGE_RESISTANCE);
				entity.getPersistentData().putDouble("shields", 0);
			}
		}
	}
}

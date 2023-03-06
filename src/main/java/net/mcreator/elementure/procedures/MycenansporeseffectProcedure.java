package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.elementure.init.ElementureModMobEffects;

public class MycenansporeseffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("mycenansporetimer") > 5) {
			if (Math.random() < 0.5 && !((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.MYCENANSPORES.get()) ? _livEnt.getEffect(ElementureModMobEffects.MYCENANSPORES.get()).getDuration() : 0) == 0)) {
				entity.hurt(DamageSource.ON_FIRE,
						(float) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.MYCENANSPORES.get()) ? _livEnt.getEffect(ElementureModMobEffects.MYCENANSPORES.get()).getAmplifier() : 0) + 1));
			}
			entity.getPersistentData().putDouble("mycenansporetimer", 0);
		} else {
			entity.getPersistentData().putDouble("mycenansporetimer", (entity.getPersistentData().getDouble("mycenansporetimer") + 1));
		}
		if (entity.isOnFire()) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
		}
	}
}

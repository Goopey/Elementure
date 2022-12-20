package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.init.ElementureModMobEffects;

public class PrismitebladeEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.2) {
			if (Math.random() < 0.25) {
				entity.setSecondsOnFire(10);
			} else if (Math.random() < 0.33) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 0));
			} else if (Math.random() < 0.5) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 0));
			} else {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.MYCENANSPORES.get(), 200, 0));
			}
		}
	}
}

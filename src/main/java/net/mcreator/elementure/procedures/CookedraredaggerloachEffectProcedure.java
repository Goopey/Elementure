package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.init.ElementureModMobEffects;

public class CookedraredaggerloachEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double potionLevel = 0;
		potionLevel = 1;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.SWINGSPEED.get()) ? _livEnt.getEffect(ElementureModMobEffects.SWINGSPEED.get()).getAmplifier() : 0) > potionLevel) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(ElementureModMobEffects.SWINGSPEED.get());
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.SWINGSPEED.get(), 1200, (int) potionLevel));
	}
}

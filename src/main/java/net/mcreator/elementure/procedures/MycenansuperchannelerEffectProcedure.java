package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.init.ElementureModMobEffects;

public class MycenansuperchannelerEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.MYCENANSPORES.get(), 80, 0));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.MYCENANSPOREGROWTHS.get(), 180, 0));
	}
}

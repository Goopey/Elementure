package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModMobEffects;

public class MycenanfungalsporesImmunityEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(ElementureModMobEffects.MYCENANSPORES.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(ElementureModMobEffects.MYCENANSPOREGROWTHS.get());
	}
}

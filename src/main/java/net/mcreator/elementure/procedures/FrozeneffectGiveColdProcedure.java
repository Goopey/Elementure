package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.init.ElementureModMobEffects;

public class FrozeneffectGiveColdProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.COLDEFFECT_POTION_ITEM.get(), 300, 0));
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.elementure.init.ElementureModMobEffects;

public class StarburnsEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(ElementureModMobEffects.HEATRESISTANCE.get()) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(ElementureModMobEffects.STARBURNS.get());
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.STARBURNS.get())
				? _livEnt.getEffect(ElementureModMobEffects.STARBURNS.get()).getDuration()
				: 0)
				% Math.max(10,
						60 - (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.STARBURNS.get())
								? _livEnt.getEffect(ElementureModMobEffects.STARBURNS.get()).getAmplifier()
								: 0) * 3) == 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("starburn").bypassArmor(), 1);
		}
	}
}

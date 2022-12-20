package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class QuickeneffectSlowProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, (int) entity.getPersistentData().getDouble("quickeneffecttimer"), 0,
					(false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, (int) entity.getPersistentData().getDouble("quickeneffecttimer"), 0,
					(false), (false)));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(
					new MobEffectInstance(MobEffects.GLOWING, (int) entity.getPersistentData().getDouble("quickeneffecttimer"), 0, (false), (false)));
	}
}

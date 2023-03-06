package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class SkyjadepickaxeMiningProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getY() > 128) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DIG_SPEED) : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 240, 0));
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.WORTASHMOSS.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 3, 0.2, 0.2, 0.2, 0.01);
		}
	}
}

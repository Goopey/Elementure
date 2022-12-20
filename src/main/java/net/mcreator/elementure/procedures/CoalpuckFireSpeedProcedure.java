package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class CoalpuckFireSpeedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnFire()) {
			if (Math.random() < 0.00213) {
				entity.hurt(DamageSource.ON_FIRE, 1);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1, (false), (false)));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), 4, 0.1, 0.1, 0.1, 0.05);
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SMOKE, (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.1, 0.1, 0.1, 0.01);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class CruelknightAttackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double attackChoice = 0;
		double playX = 0;
		double playZ = 0;
		double playY = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)
				&& (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
			if (entity.getPersistentData().getDouble("attackCooldown") == 88) {
				attackChoice = Math.random();
				if (attackChoice >= 0.5) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 380, 0, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 0, (false), (false)));
				}
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			} else if (entity.getPersistentData().getDouble("attackCooldown") > 88) {
				if (attackChoice < 0.5) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, (entity.getX()), (entity.getY()), (entity.getZ()), 5, 1.2, 1.2, 1.2, 0.22);
					if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.REGENERATION) : false)) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 2, (false), (false)));
					}
					if (entity.getPersistentData().getDouble("attackCooldown") > 128) {
						entity.getPersistentData().putDouble("attackCooldown", 0);
					}
				} else if (attackChoice >= 0.5 && entity.getPersistentData().getDouble("attackCooldown") > 108) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 360, 0, (false), (false)));
					entity.getPersistentData().putDouble("attackCooldown", 0);
				}
			} else {
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			}
		}
	}
}

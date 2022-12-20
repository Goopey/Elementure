package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.TwistedBladeEntity;

public class SpectreknightAttackProcedure {
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
						_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 160, 0, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 160, 0, (false), (false)));
					entity.getPersistentData().putDouble("attackCooldown", 0);
				}
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			} else if (entity.getPersistentData().getDouble("attackCooldown") > 88) {
				if (attackChoice < 0.5) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SMOKE, (entity.getX()), (entity.getY()), (entity.getZ()), 5, 1.2, 1.2, 1.2, 0.22);
					if (entity.getPersistentData().getDouble("attackCooldown") > 103) {
						entity.getPersistentData().putDouble("attackCooldown", 0);
					} else if (entity.getPersistentData().getDouble("attackCooldown") > 120) {
						{
							Entity _shootFrom = entity;
							Level projectileLevel = _shootFrom.level;
							if (!projectileLevel.isClientSide()) {
								Projectile _entityToSpawn = new Object() {
									public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
										AbstractArrow entityToSpawn = new TwistedBladeEntity(ElementureModEntities.TWISTED_BLADE.get(), level);
										entityToSpawn.setOwner(shooter);
										entityToSpawn.setBaseDamage(damage);
										entityToSpawn.setKnockback(knockback);
										entityToSpawn.setSilent(true);
										return entityToSpawn;
									}
								}.getArrow(projectileLevel, entity, 3, 0);
								_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
								_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z,
										(float) 0.5, 0);
								projectileLevel.addFreshEntity(_entityToSpawn);
							}
						}
					}
				}
			} else {
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			}
		}
	}
}

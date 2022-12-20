package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.CausticbladeEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class CausticknightAttackMasterProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double attackChoice = 0;
		double playX = 0;
		double playZ = 0;
		double playY = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)
				&& (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.MOVEMENT_SPEED) : false) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FALLING_HONEY, (entity.getX()), (entity.getY()), (entity.getZ()), 6, 1.2, 1.2, 1.2, 0.22);
			}
			if (entity.getPersistentData().getDouble("attackCooldown") == 80) {
				attackChoice = Math.random();
				if (attackChoice >= 0.5) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 100, 0, (false), (false)));
					entity.getPersistentData().putDouble("attackCooldown", 0);
				}
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			} else if (entity.getPersistentData().getDouble("attackCooldown") > 80) {
				if (attackChoice < 0.5) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, (entity.getX()), (entity.getY()), (entity.getZ()), 5, 1.2, 1.2, 1.2, 0.22);
					if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.REGENERATION) : false)) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0, (false), (false)));
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 0, (false), (false)));
					}
					entity.getPersistentData().putDouble("attackCooldown", 0);
				} else if (entity.getPersistentData().getDouble("attackCooldown") > 110) {
					{
						Entity _shootFrom = entity;
						Level projectileLevel = _shootFrom.level;
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new CausticbladeEntity(ElementureModEntities.CAUSTICBLADE.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, (float) 0.5, 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 0.33,
									0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
				}
			} else {
				entity.getPersistentData().putDouble("stagger", 0);
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player) {
					if ((entityiterator.getDisplayName().getString()).equals("Lebigmaigre")) {
						if (entityiterator instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1));
					}
				}
			}
		}
	}
}

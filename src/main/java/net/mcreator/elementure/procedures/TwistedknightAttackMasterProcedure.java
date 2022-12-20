package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
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

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class TwistedknightAttackMasterProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double attackChoice = 0;
		double playX = 0;
		double playZ = 0;
		double playY = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)
				&& (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
			if (entity.getPersistentData().getDouble("attackCooldown") == 80) {
				attackChoice = Math.random();
				if (attackChoice < 0.33) {
					entity.getPersistentData().putBoolean("orientBlast", (true));
				} else if (attackChoice < 0.66) {
					entity.getPersistentData().putBoolean("orientBlast", (true));
				} else {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 360, 0, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 360, 0, (false), (false)));
					entity.getPersistentData().putDouble("attackCooldown", 0);
				}
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			} else if (entity.getPersistentData().getDouble("attackCooldown") > 80) {
				if (attackChoice < 0.33) {
					if (entity.getPersistentData().getDouble("stagger") > 4) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CRIT, (entity.getX()), (entity.getY()), (entity.getZ()), 45, 1.2, 1.2, 1.2, 0.22);
						entity.getPersistentData().putDouble("attackCooldown", 0);
						entity.getPersistentData().putDouble("stagger", 0);
						entity.getPersistentData().putBoolean("orientBlast", (false));
					} else {
						if (entity.getPersistentData().getDouble("attackCooldown") < 120) {
							if (entity.getPersistentData().getDouble("attackCooldown") > 116) {
								if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false) {
									{
										Entity _shootFrom = entity;
										Level projectileLevel = _shootFrom.level;
										if (!projectileLevel.isClientSide()) {
											Projectile _entityToSpawn = new Object() {
												public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
													AbstractArrow entityToSpawn = new TwistedBladeEntity(ElementureModEntities.TWISTED_BLADE.get(),
															level);
													entityToSpawn.setOwner(shooter);
													entityToSpawn.setBaseDamage(damage);
													entityToSpawn.setKnockback(knockback);
													entityToSpawn.setSilent(true);
													return entityToSpawn;
												}
											}.getArrow(projectileLevel, entity,
													(float) (3 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST)
															? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier()
															: 0)),
													0);
											_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
											_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y,
													_shootFrom.getLookAngle().z, 1, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
									}
								} else {
									{
										Entity _shootFrom = entity;
										Level projectileLevel = _shootFrom.level;
										if (!projectileLevel.isClientSide()) {
											Projectile _entityToSpawn = new Object() {
												public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
													AbstractArrow entityToSpawn = new TwistedBladeEntity(ElementureModEntities.TWISTED_BLADE.get(),
															level);
													entityToSpawn.setOwner(shooter);
													entityToSpawn.setBaseDamage(damage);
													entityToSpawn.setKnockback(knockback);
													entityToSpawn.setSilent(true);
													return entityToSpawn;
												}
											}.getArrow(projectileLevel, entity, 2, 0);
											_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
											_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y,
													_shootFrom.getLookAngle().z, 1, 0);
											projectileLevel.addFreshEntity(_entityToSpawn);
										}
									}
								}
							}
							entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
						} else {
							entity.getPersistentData().putDouble("attackCooldown", 0);
							entity.getPersistentData().putDouble("stagger", 0);
							entity.getPersistentData().putBoolean("orientBlast", (false));
						}
					}
				} else if (attackChoice < 0.66) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SQUID_INK, (entity.getX()), (entity.getY()), (entity.getZ()), 3, 1.2, 1.2, 1.2, 0.22);
					if (entity.getPersistentData().getDouble("stagger") > 8) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CRIT, (entity.getX()), (entity.getY()), (entity.getZ()), 45, 1.2, 1.2, 1.2, 0.22);
						entity.getPersistentData().putDouble("attackCooldown", 0);
						entity.getPersistentData().putDouble("stagger", 0);
						entity.getPersistentData().putBoolean("orientBlast", (false));
					} else {
						if (entity.getPersistentData().getDouble("attackCooldown") < 172) {
							{
								final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
								List<Entity> _entfound = world
										.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream()
										.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entity.getY() < entityiterator.getY() + 0.33 || entity.getY() > entityiterator.getY() - 0.33) {
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.SQUID_INK, (entityiterator.getX()), (entityiterator.getY()),
													(entityiterator.getZ()), 3, 1.2, 1.2, 1.2, 0.22);
									}
								}
							}
							entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
						} else {
							{
								final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
								List<Entity> _entfound = world
										.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream()
										.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entity.getY() < entityiterator.getY() + 0.33 || entity.getY() > entityiterator.getY() - 0.33) {
										if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false) {
											if (world instanceof Level _level && !_level.isClientSide())
												_level.explode(null, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
														(float) (1.5 + (entity instanceof LivingEntity _livEnt
																&& _livEnt.hasEffect(MobEffects.DAMAGE_BOOST)
																		? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier()
																		: 0)),
														Explosion.BlockInteraction.NONE);
										} else {
											if (world instanceof Level _level && !_level.isClientSide())
												_level.explode(null, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1,
														Explosion.BlockInteraction.NONE);
										}
									}
								}
							}
							entity.getPersistentData().putDouble("attackCooldown", 0);
							entity.getPersistentData().putDouble("stagger", 0);
							entity.getPersistentData().putBoolean("orientBlast", (false));
						}
					}
				}
			} else {
				entity.getPersistentData().putDouble("stagger", 0);
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			}
		}
	}
}

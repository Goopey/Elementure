package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class CandleknightAttackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double attackChoice = 0;
		double playX = 0;
		double playZ = 0;
		double playY = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)
				&& (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
			if (entity.getPersistentData().getDouble("attackCooldown") == 100) {
				attackChoice = Math.random();
				if (attackChoice >= 0.5) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 380, 0, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 0, (false), (false)));
				}
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			} else if (entity.getPersistentData().getDouble("attackCooldown") > 100) {
				if (attackChoice < 0.5) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, (entity.getX()), (entity.getY()), (entity.getZ()), 5, 1.2, 1.2, 1.2, 0.22);
					if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.REGENERATION) : false)) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0, (false), (false)));
					}
					entity.getPersistentData().putDouble("attackCooldown", 0);
				} else if (entity.getPersistentData().getDouble("attackCooldown") > 120) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400, 0, (false), (false)));
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), 75, 1.5, 0.02, 1.5, 0.02);
					{
						final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true)
								.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							entityiterator.setSecondsOnFire(10);
						}
					}
					entity.getPersistentData().putDouble("attackCooldown", 0);
				}
			} else {
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.init.ElementureModParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class KingsknightAttackMasterProcedure {
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
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SOULFLAME.get()), (entity.getX()), (entity.getY()),
							(entity.getZ()), 6, 1.2, 1.2, 1.2, 0.22);
			}
			if (entity.getPersistentData().getDouble("attackCooldown") == 66) {
				attackChoice = Math.random();
				if (attackChoice >= 0.5) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 120, 0, (false), (false)));
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 1, (false), (false)));
					entity.getPersistentData().putDouble("attackCooldown", 0);
				}
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			} else if (entity.getPersistentData().getDouble("attackCooldown") > 66) {
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
				if (attackChoice < 0.5) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, (entity.getX()), (entity.getY()), (entity.getZ()), 5, 1.2, 1.2, 1.2, 0.22);
					entity.setDeltaMovement(new Vec3(0, 0, 0));
					if (entity.getPersistentData().getDouble("attackCooldown") <= 76) {
						{
							final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true)
									.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof Player || entityiterator instanceof ServerPlayer) {
									if (entity.getPersistentData().getDouble("attackCooldown") == 76) {
										entity.getPersistentData().putDouble("kingsKnightAttackTeleportX", (entityiterator.getX()));
										entity.getPersistentData().putDouble("kingsKnightAttackTeleportY", (entityiterator.getY()));
										entity.getPersistentData().putDouble("kingsKnightAttackTeleportZ", (entityiterator.getZ()));
									} else {
										playX = entityiterator.getX();
										playY = entityiterator.getY();
										playZ = entityiterator.getZ();
									}
									break;
								}
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.ENCHANT, playX, playY, playZ, 12, 1, 1, 1, 0.05);
					}
					if (entity.getPersistentData().getDouble("attackCooldown") > 80) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.SMOKE, (entity.getX()), (entity.getY()), (entity.getZ()), 50, 1, 1, 1, 0.05);
						{
							Entity _ent = entity;
							_ent.teleportTo((entity.getPersistentData().getDouble("kingsKnightAttackTeleportX")),
									(entity.getPersistentData().getDouble("kingsKnightAttackTeleportY")),
									(entity.getPersistentData().getDouble("kingsKnightAttackTeleportZ")));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("kingsKnightAttackTeleportX")),
										(entity.getPersistentData().getDouble("kingsKnightAttackTeleportY")),
										(entity.getPersistentData().getDouble("kingsKnightAttackTeleportZ")), _ent.getYRot(), _ent.getXRot());
						}
						entity.getPersistentData().putDouble("attackCooldown", 0);
						entity.getPersistentData().putDouble("stagger", 0);
						entity.getPersistentData().putBoolean("orientBlast", (false));
					}
				}
			} else {
				entity.getPersistentData().putDouble("stagger", 0);
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			}
		}
		LebigmaigreLightningStrikeProcedure.execute(world, entity);
	}
}

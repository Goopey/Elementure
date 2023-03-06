package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.entity.MycenashroomlingEntity;
import net.mcreator.elementure.entity.MycenashroomalEntity;

public class MycenashroomlordAttackMasterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof ServerPlayer) {
			if (!entity.getPersistentData().getBoolean("attackongoing")) {
				if (Math.random() < 0.43 && Math.floor(entity.getPersistentData().getDouble("attackCooldown")) == 90) {
					if (Math.random() < 0.2) {
						entity.getPersistentData().putBoolean("superattack", (true));
					} else if (Math.random() > 0.67 && !(!world.getEntitiesOfClass(MycenashroomlingEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 64, 64, 64), e -> true).isEmpty())) {
						MycenashroomlordAttackBehavior1Procedure.execute(world, x, y, z, entity);
					} else {
						MycenashroomlordAttackBehavior2Procedure.execute(world, x, y, z, entity);
					}
					entity.getPersistentData().putDouble("attackCooldown", 0);
				} else if (entity.getPersistentData().getDouble("attackCooldown") >= 170) {
					if (Math.random() < 0.075) {
						entity.getPersistentData().putBoolean("superattack", (true));
					} else if (Math.random() > 0.7 && !(!world.getEntitiesOfClass(MycenashroomalEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 64, 64, 64), e -> true).isEmpty())) {
						MycenashroomlordLongAttackBehavior1Procedure.execute(world, x, y, z, entity);
						entity.getPersistentData().putBoolean("attackongoing", (true));
						entity.getPersistentData().putDouble("attacktype", 3);
					} else {
						MycenashroomlordLongAttackBehavior2Procedure.execute(world, x, y, z, entity);
					}
					entity.getPersistentData().putDouble("attackCooldown", 0);
				} else if (entity.getPersistentData().getDouble("superattackCooldown") >= 260) {
					entity.getPersistentData().putBoolean("superattack", (false));
					entity.getPersistentData().putDouble("superattackCooldown", 0);
					if (Math.random() < 0.5) {
						MycenashroomlordSuperAttackBehavior1Procedure.execute(world, entity);
						entity.getPersistentData().putBoolean("attackongoing", (true));
						entity.getPersistentData().putDouble("attacktype", 1);
					} else {
						MycenashroomlordSuperAttackBehavior2Procedure.execute(world, entity);
						entity.getPersistentData().putBoolean("attackongoing", (true));
						entity.getPersistentData().putDouble("attacktype", 2);
					}
				} else {
					if (!entity.getPersistentData().getBoolean("superattack")) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.MOVEMENT_SLOWDOWN) : false) || (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DIG_SLOWDOWN) : false)) {
							entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 0.75));
						} else {
							entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
						}
					} else {
						entity.getPersistentData().putDouble("superattackCooldown", (entity.getPersistentData().getDouble("superattackCooldown") + 1));
					}
				}
				if (entity.getPersistentData().getBoolean("superattack") == true) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CLOUD, (entity.getX()), (entity.getY() + 4), (entity.getZ()), 25, 3, 0.25, 3, 0.01);
				}
			} else {
				if (entity.getPersistentData().getDouble("attacktype") == 1) {
					entity.getPersistentData().putDouble("attackongoingtime", (entity.getPersistentData().getDouble("attackongoingtime") + 1));
					MycenashroomlordSuperAttackBehavior1Procedure.execute(world, entity);
				} else if (entity.getPersistentData().getDouble("attacktype") == 2) {
					entity.getPersistentData().putDouble("attackongoingtime", (entity.getPersistentData().getDouble("attackongoingtime") + 1));
					MycenashroomlordSuperAttackBehavior2Procedure.execute(world, entity);
				} else if (entity.getPersistentData().getDouble("attacktype") == 3) {
					entity.getPersistentData().putDouble("attackongoingtime", (entity.getPersistentData().getDouble("attackongoingtime") + 1));
					MycenashroomlordLongAttackBehavior1Procedure.execute(world, x, y, z, entity);
				}
			}
		}
	}
}

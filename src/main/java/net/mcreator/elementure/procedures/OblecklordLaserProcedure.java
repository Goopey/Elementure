package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class OblecklordLaserProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double yaw = 0;
		double laser_length = 0;
		laser_length = 1.2;
		pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
		pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
		yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
		yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
		if (entity.getPersistentData().getDouble("laserWait") > 29 && entity.getPersistentData().getDouble("laserWait") < 61) {
			for (int index0 = 0; index0 < (int) (16); index0++) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.CRIT, (entity.getX() + laser_length * yaw * pitch), (entity.getY() + 1.5 + pitch2),
							(entity.getZ() + laser_length * yaw2 * pitch), 24, 0.15, 0.15, 0.15, 0.05);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.ENCHANTED_HIT, (entity.getX() + laser_length * yaw * pitch), (entity.getY() + 1.5 + pitch2),
							(entity.getZ() + laser_length * yaw2 * pitch), 24, 0.15, 0.15, 0.15, 0.05);
				{
					final Vec3 _center = new Vec3((entity.getX() + laser_length * yaw * pitch), (entity.getY() + 1.5 + pitch2),
							(entity.getZ() + laser_length * yaw2 * pitch));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.15 / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						entityiterator.hurt(DamageSource.WITHER, 3);
					}
				}
				laser_length = laser_length + 1;
			}
			for (int index1 = 0; index1 < (int) (80); index1++) {
				world.addParticle(ParticleTypes.ELECTRIC_SPARK, (entity.getX() + yaw * pitch), (entity.getY() + 1.5 + pitch2),
						(entity.getZ() + yaw2 * pitch), (16 * yaw * pitch), pitch2, (16 * yaw2 * pitch));
			}
			entity.getPersistentData().putDouble("laserWait", (entity.getPersistentData().getDouble("laserWait") + 1));
		} else if (entity.getPersistentData().getDouble("laserWait") >= 61) {
			entity.getPersistentData().putDouble("attackType", 0);
			entity.getPersistentData().putDouble("laserWait", 0);
			entity.getPersistentData().putBoolean("attackongoing", (false));
		} else {
			entity.getPersistentData().putDouble("laserWait", (entity.getPersistentData().getDouble("laserWait") + 1));
		}
	}
}

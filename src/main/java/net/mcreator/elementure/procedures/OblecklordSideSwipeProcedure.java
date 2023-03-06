package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.particles.ParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class OblecklordSideSwipeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double yaw = 0;
		double yaw3 = 0;
		double yaw4 = 0;
		double yaw5 = 0;
		double yaw6 = 0;
		pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
		pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
		yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
		yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
		yaw3 = Math.sin(0.33 * Math.PI + entity.getYRot() / ((-180) / Math.PI));
		yaw4 = Math.cos(0.33 * Math.PI + entity.getYRot() / ((-180) / Math.PI));
		yaw5 = Math.sin(entity.getYRot() / ((-180) / Math.PI) - 0.33 * Math.PI);
		yaw6 = Math.cos(entity.getYRot() / ((-180) / Math.PI) - 0.33 * Math.PI);
		for (int index0 = 0; index0 < (int) (50); index0++) {
			world.addParticle(ParticleTypes.ITEM_SLIME, (entity.getX() + 1.3 * yaw * pitch), (entity.getY() + 1 + 1.3 * pitch2), (entity.getZ() + 1.3 * yaw2 * pitch), 0, 0.001, 0);
			world.addParticle(ParticleTypes.ITEM_SLIME, (entity.getX() + 1.3 * yaw3 * pitch), (entity.getY() + 1 + 1.3 * pitch2), (entity.getZ() + 1.3 * yaw4 * pitch), 0, 0.001, 0);
			world.addParticle(ParticleTypes.ITEM_SLIME, (entity.getX() + 1.3 * yaw5 * pitch), (entity.getY() + 1 + 1.3 * pitch2), (entity.getZ() + 1.3 * yaw6 * pitch), 0, 0.001, 0);
		}
		{
			final Vec3 _center = new Vec3((entity.getX() + 1.3 * yaw * pitch), (entity.getY() + 1 + 1.3 * pitch2), (entity.getZ() + 1.3 * yaw2 * pitch));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ServerPlayer || entityiterator instanceof Player) {
					entityiterator.hurt(DamageSource.GENERIC, 8);
				}
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX() + 1.3 * yaw3 * pitch), (entity.getY() + 1 + 1.3 * pitch2), (entity.getZ() + 1.3 * yaw4 * pitch));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ServerPlayer || entityiterator instanceof Player) {
					entityiterator.hurt(DamageSource.GENERIC, 8);
				}
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX() + 1.3 * yaw5 * pitch), (entity.getY() + 1 + 1.3 * pitch2), (entity.getZ() + 1.3 * yaw6 * pitch));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ServerPlayer || entityiterator instanceof Player) {
					entityiterator.hurt(DamageSource.GENERIC, 8);
				}
			}
		}
	}
}

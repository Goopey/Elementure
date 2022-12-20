package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.init.ElementureModParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class RedsunpillarAbilityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), 15, 0.8, 0.2, 0.8, 0.02);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.REDSUN_FLAME.get()), (entity.getX()), (entity.getY()),
					(entity.getZ()), 60, 0.6, 0.2, 0.6, 0.02);
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				entityiterator.hurt(DamageSource.IN_FIRE, 3);
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 2), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				entityiterator.hurt(DamageSource.IN_FIRE, 3);
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 4), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				entityiterator.hurt(DamageSource.IN_FIRE, 3);
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 6), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				entityiterator.hurt(DamageSource.IN_FIRE, 3);
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 8), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				entityiterator.hurt(DamageSource.IN_FIRE, 3);
			}
		}
		entity.getPersistentData().putDouble("redSunPillarExpiryTime", (entity.getPersistentData().getDouble("redSunPillarExpiryTime") + 1));
		if (entity.getPersistentData().getDouble("redSunPillarExpiryTime") > 240
				&& Math.random() + entity.getPersistentData().getDouble("redSunPillarExpiryTime") / 550 > 0.9) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}

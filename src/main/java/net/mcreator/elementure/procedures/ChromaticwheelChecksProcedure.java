package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.entity.ChromaticwheelBulletEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class ChromaticwheelChecksProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof ChromaticwheelBulletEntity) && !(entityiterator.getDisplayName().getString()).equals(entity.getPersistentData().getString("playerName")) && !(entityiterator instanceof ItemEntity)
						&& !(entityiterator instanceof ItemFrame)) {
					entityiterator.hurt(DamageSource.GENERIC, (float) (8 / (Math.floor((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) / 3) + 1)));
				}
			}
		}
		if (entity.getPersistentData().getDouble("despawn") <= 80) {
			entity.getPersistentData().putDouble("despawn", (entity.getPersistentData().getDouble("despawn") + 1));
		} else {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SOULFLAME.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 4, 0.1, 0.1, 0.1, 0.01);
		}
	}
}

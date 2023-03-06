package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class ArchkassemstaffSprayFireProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double yaw = 0;
		pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
		pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
		yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
		yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SMALL_FLAME, (entity.getX() + 2 * yaw * pitch), (entity.getY() + 1.633 + 2 * pitch2), (entity.getZ() + 2 * yaw2 * pitch), 10, 0.075, 0.075, 0.075, 0);
		{
			final Vec3 _center = new Vec3((entity.getX() + 2 * yaw * pitch), (entity.getY() + 1.633 + 2 * pitch2), (entity.getZ() + 2 * yaw2 * pitch));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity) && !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
						&& !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
					entityiterator.hurt(DamageSource.IN_FIRE, 1);
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class JellybladeSwingProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double yaw = 0;
		pitch = Math.cos(sourceentity.getXRot() / ((-180) / Math.PI));
		pitch2 = Math.sin(sourceentity.getXRot() / ((-180) / Math.PI));
		yaw = Math.sin(sourceentity.getYRot() / ((-180) / Math.PI));
		yaw2 = Math.cos(sourceentity.getYRot() / ((-180) / Math.PI));
		for (int index0 = 0; index0 < (int) (16); index0++) {
			world.addParticle(ParticleTypes.ELECTRIC_SPARK, (sourceentity.getX() + 3.25 * yaw * pitch), (sourceentity.getY() + 1.633 + 3.25 * pitch2),
					(sourceentity.getZ() + 3.25 * yaw2 * pitch), ((Math.random() - 0.5) / 4), ((Math.random() - 0.5) / 4),
					((Math.random() - 0.5) / 4));
		}
		{
			final Vec3 _center = new Vec3((sourceentity.getX() + 4.5 * yaw * pitch), (sourceentity.getY() + 1.633 + 4.5 * pitch2),
					(sourceentity.getZ() + 4.5 * yaw2 * pitch));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity) && !(entityiterator == sourceentity)
						&& !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
						&& !entityiterator.getType()
								.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
					entity.hurt(DamageSource.GENERIC, 2);
				}
			}
		}
	}
}

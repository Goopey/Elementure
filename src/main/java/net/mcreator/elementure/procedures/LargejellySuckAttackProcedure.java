package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.entity.LargejellyEntity;
import net.mcreator.elementure.entity.JellyEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class LargejellySuckAttackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof JellyEntity) && !(entityiterator instanceof LargejellyEntity) && !entityiterator.getType()
						.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
					entityiterator.setDeltaMovement(
							new Vec3(((entity.getX() - entityiterator.getX()) / 9), 0.1, ((entity.getZ() - entityiterator.getZ()) / 9)));
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.JELLYBUBBLE.get()), (entity.getX()), (entity.getY()),
					(entity.getZ()), 40, 0.5, 0.5, 0.5, 0.03);
	}
}

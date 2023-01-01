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

public class MagtunaBusterFirestormBallAOEProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double repeatTimes = 0;
		double locZ = 0;
		double rad2 = 0;
		double locX = 0;
		if (world.dayTime() % 15 <= 0) {
			locX = -5;
			locZ = -5;
			repeatTimes = (locX * locX + 1) * (locZ * locZ + 1);
			rad2 = locX * locX;
			for (int index0 = 0; index0 < (int) (repeatTimes); index0++) {
				if (locX * locX + locZ * locZ < rad2) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, (entity.getX() + locX), (entity.getY()), (entity.getZ() + locZ), 4, 0.2, 0.2, 0.2,
								0.01);
					if (Math.random() < 0.3) {
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX() + locX), (entity.getY()), (entity.getZ() + locZ),
									1, 0.15, 0.15, 0.15, 0.01);
					}
					{
						final Vec3 _center = new Vec3((entity.getX() + locX), (entity.getY()), (entity.getZ() + locZ));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2 / 2d), e -> true)
								.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity)
									&& !entityiterator.getType()
											.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
									&& !entityiterator.getType()
											.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
								if (Math.random() < 0.7) {
									entityiterator.hurt(DamageSource.IN_FIRE, 3);
								} else {
									entityiterator.hurt(DamageSource.IN_FIRE, 2);
								}
							}
						}
					}
				}
				locX = locX + 1;
				if (locX > 5) {
					locX = -5;
					locZ = locZ + 1;
					if (locZ > 5) {
						locX = -5;
						locZ = -5;
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("wait") >= 140) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else {
			entity.getPersistentData().putDouble("wait", (entity.getPersistentData().getDouble("wait") + 1));
		}
	}
}

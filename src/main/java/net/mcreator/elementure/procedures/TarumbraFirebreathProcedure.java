package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;

import net.mcreator.elementure.ElementureMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class TarumbraFirebreathProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double yaw = 0;
		double num = 0;
		if (entity.getPersistentData().getDouble("fireBreathCooldown") <= 0) {
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && entity.getPersistentData().getBoolean("tarumbraIsVisible")) {
				pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
				pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
				yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
				yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, (entity.getX() + 0.5 * yaw * pitch), (entity.getY() + 0.2 + 0.5 * pitch2), (entity.getZ() + 0.5 * yaw2 * pitch), 8, 0.25, 0.25, 0.25, 0.01);
				{
					final Vec3 _center = new Vec3((entity.getX() + 0.5 * yaw * pitch), (entity.getY() + 0.2 + 0.5 * pitch2), (entity.getZ() + 0.5 * yaw2 * pitch));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.35 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity) && !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
								&& !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
							entityiterator.hurt(DamageSource.LAVA, 1);
						}
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FLAME, (entity.getX() + 0.9 * yaw * pitch), (entity.getY() + 0.2 + 0.9 * pitch2), (entity.getZ() + 0.9 * yaw2 * pitch), 16, 0.45, 0.45, 0.45, 0.01);
				{
					final Vec3 _center = new Vec3((entity.getX() + 0.9 * yaw * pitch), (entity.getY() + 0.2 + 0.9 * pitch2), (entity.getZ() + 0.9 * yaw2 * pitch));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity) && !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
								&& !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
							entityiterator.hurt(DamageSource.LAVA, 1);
						}
					}
				}
				for (int index0 = 0; index0 < (int) (12); index0++) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, (entity.getX() + (1.3 + num * 0.4) * yaw * pitch), (entity.getY() + 0.2 + (1.3 + num * 0.4) * pitch2), (entity.getZ() + (1.3 + num * 0.4) * yaw2 * pitch), 35, 0.65, 0.65, 0.65, 0.01);
					{
						final Vec3 _center = new Vec3((entity.getX() + (1.3 + num * 0.4) * yaw * pitch), (entity.getY() + 0.2 + (1.3 + num * 0.4) * pitch2), (entity.getZ() + (1.3 + num * 0.4) * yaw2 * pitch));
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entityiterator == entity) && !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
									&& !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
								entityiterator.hurt(DamageSource.LAVA, 1);
							}
						}
					}
					num = num + 1;
				}
				ElementureMod.queueServerWork(80, () -> {
					entity.getPersistentData().putDouble("fireBreathCooldown", 220);
				});
			}
		} else {
			entity.getPersistentData().putDouble("fireBreathCooldown", (entity.getPersistentData().getDouble("fireBreathCooldown") - 1));
		}
	}
}

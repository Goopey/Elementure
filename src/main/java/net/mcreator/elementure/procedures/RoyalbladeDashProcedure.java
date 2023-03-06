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

import net.mcreator.elementure.network.ElementureModVariables;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class RoyalbladeDashProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double yaw = 0;
		double yaw2 = 0;
		double pitch = 0;
		double pitch2 = 0;
		if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).light_essence >= 22) {
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).light_essence - 22;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.light_essence = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
			yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
			yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
			for (int index0 = 0; index0 < (int) (32); index0++) {
				world.addParticle(ParticleTypes.SWEEP_ATTACK, (entity.getX() + 0.85 * yaw * pitch + (Math.random() - 0.5) * 3), (entity.getY() + 1.633 + (Math.random() - 0.5) / 2), ((Math.random() - 0.5) * 3 + entity.getZ() + 0.85 * yaw2 * pitch), 0,
						0, 0);
			}
			{
				final Vec3 _center = new Vec3((entity.getX() + 4.2 * yaw * pitch), (entity.getY() + 1.633), (entity.getZ() + 4.2 * yaw2 * pitch));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))) {
						entityiterator.hurt(DamageSource.GENERIC, 6);
					}
				}
			}
			for (int index1 = 0; index1 < (int) (16); index1++) {
				world.addParticle(ParticleTypes.SWEEP_ATTACK, (entity.getX() + 4.2 * yaw * pitch + (Math.random() - 0.5) * 3), (entity.getY() + 1.633 + (Math.random() - 0.5) / 2), ((Math.random() - 0.5) * 3 + entity.getZ() + 4.2 * yaw2 * pitch), 0,
						0, 0);
			}
			{
				final Vec3 _center = new Vec3((entity.getX() + 10.2 * yaw * pitch), (entity.getY() + 1.633), (entity.getZ() + 10.2 * yaw2 * pitch));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))) {
						entityiterator.hurt(DamageSource.GENERIC, 6);
					}
				}
			}
			for (int index2 = 0; index2 < (int) (16); index2++) {
				world.addParticle(ParticleTypes.SWEEP_ATTACK, (entity.getX() + 10.2 * yaw * pitch + (Math.random() - 0.5) * 3), (entity.getY() + 1.633 + (Math.random() - 0.5) / 2), ((Math.random() - 0.5) * 3 + entity.getZ() + 10.2 * yaw2 * pitch), 0,
						0, 0);
			}
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + 5 * yaw * pitch), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + 5 * yaw2 * pitch)));
		}
	}
}

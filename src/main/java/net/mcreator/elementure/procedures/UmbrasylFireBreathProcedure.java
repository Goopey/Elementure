package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.entity.UmbrasylSegmentEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class UmbrasylFireBreathProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double num = 0;
		double pitch = 0;
		double yaw2 = 0;
		double yaw = 0;
		double pitch2 = 0;
		if (entity.getPersistentData().getDouble("attackCooldown") > 600) {
			pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
			pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
			yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
			yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
			for (int index0 = 0; index0 < (int) (30); index0++) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.TARFLAME_PARTICLE.get()), (entity.getX() + (1.5 + num * 0.65) * yaw * pitch), (entity.getY() + 0.2 + (1.5 + num * 0.65) * pitch2),
							(entity.getZ() + (1.5 + num * 0.65) * yaw2 * pitch), 35, 0.9, 0.9, 0.9, 0.01);
				{
					final Vec3 _center = new Vec3((entity.getX() + (1.5 + num * 0.65) * yaw * pitch), (entity.getY() + 2 + (1.5 + num * 0.65) * pitch2), (entity.getZ() + (1.5 + num * 0.65) * yaw2 * pitch));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1.8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity) && !(entityiterator instanceof UmbrasylSegmentEntity) && !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
								&& !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
							if (entity.getPersistentData().getBoolean("umbrasylPhase2")) {
								entityiterator.hurt(DamageSource.LAVA, 1);
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 1));
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 20, 0));
							} else {
								entityiterator.hurt(DamageSource.LAVA, 1);
								if (entityiterator instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 1));
							}
						}
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(entity.getX() + (1.5 + num * 0.65) * yaw * pitch, entity.getY() + 2 + (1.5 + num * 0.65) * pitch2, entity.getZ() + (1.5 + num * 0.65) * yaw2 * pitch),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.burn")), SoundSource.HOSTILE, (float) 0.67, (float) 0.8);
					} else {
						_level.playLocalSound((entity.getX() + (1.5 + num * 0.65) * yaw * pitch), (entity.getY() + 2 + (1.5 + num * 0.65) * pitch2), (entity.getZ() + (1.5 + num * 0.65) * yaw2 * pitch),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.blaze.burn")), SoundSource.HOSTILE, (float) 0.67, (float) 0.8, false);
					}
				}
				num = num + 1.5;
			}
		} else {
			entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 2));
		}
	}
}

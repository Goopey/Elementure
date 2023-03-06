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

public class UmbrasylFireAOEProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double num = 0;
		double pitch = 0;
		double yaw2 = 0;
		double yaw = 0;
		double pitch2 = 0;
		if (entity.getPersistentData().getDouble("attackCooldown") > 500) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.TARFLAME_PARTICLE.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 300, 4, 4, 4, 0.01);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SHADOWPARTICLE_2.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 100, 2.5, 2.5, 2.5, 0.01);
		} else if (entity.getPersistentData().getDouble("attackCooldown") == 500) {
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && !(entityiterator instanceof UmbrasylSegmentEntity) && !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
							&& !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
						entityiterator.hurt(DamageSource.LAVA, 15);
						if (entityiterator instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 1));
						if (entity.getPersistentData().getBoolean("umbrasylPhase2")) {
							if (entityiterator instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 60, 1));
						}
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, (float) 1.2, (float) 0.5);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.HOSTILE, (float) 1.2, (float) 0.5, false);
				}
			}
		} else {
			entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 3));
		}
	}
}

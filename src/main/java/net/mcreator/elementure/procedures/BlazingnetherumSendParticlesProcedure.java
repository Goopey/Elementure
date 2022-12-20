package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.decoration.ItemFrame;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;

import net.mcreator.elementure.init.ElementureModMobEffects;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class BlazingnetherumSendParticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x, y, z, 2, 1.1, 1.1, 1.1, 0.017);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.FIRE_RESISTANCE) : false)
						&& !(entityiterator instanceof LivingEntity _livEnt
								? _livEnt.hasEffect(ElementureModMobEffects.HEATRESISTANCE.get())
								: false)) {
					if (!entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:netherstarfireimmune")))
							&& !entityiterator.getType()
									.is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))
							&& !(entityiterator instanceof ItemEntity) && !(entityiterator instanceof ItemFrame)) {
						if (Math.random() < 0.7) {
							entityiterator.hurt(DamageSource.IN_FIRE, 1);
						}
						entityiterator.hurt(DamageSource.IN_FIRE, 1);
						entityiterator.setSecondsOnFire(15);
					}
				}
			}
		}
	}
}

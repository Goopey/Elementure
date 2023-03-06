package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;

import net.mcreator.elementure.init.ElementureModParticleTypes;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class AngelfishchannelerExplosionProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double nPoints = 0;
		double a = 0;
		double d = 0;
		double mTeta = 0;
		double mPhi = 0;
		double dTeta = 0;
		double dPhi = 0;
		double teta = 0;
		double phi = 0;
		double radius = 0;
		double n = 0;
		double ind1 = 0;
		double ind2 = 0;
		//Parameters for points
		n = 1250;
		radius = 2;
		nPoints = 0;//Setup for generation
		a = (4 * Math.PI * radius * radius) / n;
		d = Math.sqrt(a);
		mTeta = Math.round(Math.PI / d);
		dTeta = Math.PI / mTeta;
		dPhi = a / dTeta;//Loop 1
		for (int index0 = 0; index0 < (int) (mTeta - 1); index0++) {
			teta = (Math.PI * (ind1 + 0.5)) / mTeta;
			mPhi = Math.round(2 * Math.PI * (Math.sin(teta) / dPhi));
			ind1 = ind1 + 1;//Loop 2
			for (int index1 = 0; index1 < (int) (mPhi - 1); index1++) {
				phi = (2 * Math.PI * ind2) / mPhi;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.ANGELSTARPARTICLE.get()), (immediatesourceentity.getX() + radius * Math.sin(teta) * Math.cos(phi)),
							(immediatesourceentity.getY() + radius * Math.sin(teta) * Math.sin(phi)), (immediatesourceentity.getZ() + radius * Math.cos(teta)), 1, 0, 0, 0, 0);
				ind2 = ind2 + 1;
				nPoints = nPoints + 1;
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.ANGELSTARPARTICLE.get()), (immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), 20, 0.8, 0.8, 0.8, 0);
		{
			final Vec3 _center = new Vec3((immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity) && !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
						&& !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
					entityiterator.hurt(DamageSource.MAGIC, 3);
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class BrightCandleParticlesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.BRIGHTPARTICLE_1.get()), (entity.getX()), (entity.getY()),
					(entity.getZ()), 1, 0.25, 0.25, 0.25, 0.01);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.BRIGHTPARTICLE_2.get()), (entity.getX()), (entity.getY()),
					(entity.getZ()), 2, 0.25, 0.25, 0.25, 0.01);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class DarkspiritParticlesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double height = 0;
		for (int index0 = 0; index0 < (int) (9); index0++) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SHADOWPARTICLE_1.get()), (entity.getX()),
						(entity.getY() + height), (entity.getZ()), 1, 0.25, 0.25, 0.25, 0.01);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SHADOWPARTICLE_2.get()), (entity.getX()),
						(entity.getY() + height), (entity.getZ()), 2, 0.25, 0.25, 0.25, 0.01);
			height = height + 0.2;
		}
	}
}

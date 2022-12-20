package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class StarflowerParticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.STARFLOWERPARTICLE.get()), (x + 0.5), (y + 1), (z + 0.5), 8, 0.11,
					0.11, 0.11, 0.02);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.STARFLOWERPARTICLE.get()), (x + 0.5), (y + 1), (z + 0.5), 8, 0.07,
					0.07, 0.07, 0);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class BigglowingmushroomRainEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.15) {
			if (world.getLevelData().isRaining() || world.getLevelData().isThundering()) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SPOREPARTICLE.get()), x, y, z, 12, 1, 1, 1, 0.35);
			}
		}
	}
}

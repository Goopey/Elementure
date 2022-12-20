package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class ChargedchannelerElectricParticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SOULFLAME.get()), x, y, z, 2, 0.05, 0.05, 0.05, 0.2);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EFFECT, x, y, z, 2, 0.05, 0.05, 0.05, 0.2);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 2, 0.05, 0.05, 0.05, 0.2);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class JellyblockBubblesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.4) {
			if (Math.random() < 0.33) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.JELLYBUBBLE.get()), (x + 0.5), (y + 1.1), (z + 0.5), 1, 0.2, 0.2, 0.2, 0.0025);
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.JELLYBUBBLE.get()), (x + 0.5), (y + 1.1), (z + 0.5), 3, 0.2, 0.2, 0.2, 0.0025);
			}
		}
	}
}

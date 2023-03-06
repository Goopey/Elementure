package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class JellyfloattendrilBubblesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.2) {
			if (Math.random() < 0.5) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.JELLYBUBBLE.get()), (x + 0.5), (y + 0.25), (z + 0.5), 1, 0.12, 0.12, 0.12, 0.002);
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.JELLYBUBBLE.get()), (x + 0.5), (y + 0.25), (z + 0.5), 2, 0.12, 0.12, 0.12, 0.002);
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class AngelfishChannelerTrailProcedure {
	public static void execute(LevelAccessor world, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.ANGELSTARPARTICLE.get()), (immediatesourceentity.getX()),
					(immediatesourceentity.getY()), (immediatesourceentity.getZ()), 1, 0, 0, 0, 0);
		immediatesourceentity.setNoGravity((true));
	}
}

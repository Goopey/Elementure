package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class DarkcormunculusChannelerParticlesProcedure {
	public static void execute(LevelAccessor world, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		world.addParticle((SimpleParticleType) (ElementureModParticleTypes.SHADOWPARTICLE_1.get()), (immediatesourceentity.getX()),
				(immediatesourceentity.getY()), (immediatesourceentity.getZ()), 0, 0, 0);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class ArchkassemstaffParticlesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), 40, 0.125, 0.125, 0.125, 0.001);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FALLING_LAVA, (entity.getX()), (entity.getY()), (entity.getZ()), 4, 0.005, 0.005, 0.005, 0);
	}
}

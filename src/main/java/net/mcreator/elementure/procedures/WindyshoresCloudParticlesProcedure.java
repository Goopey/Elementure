package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class WindyshoresCloudParticlesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, (entity.getX()), (entity.getY()), (entity.getZ()), 10, 0.48, 0.16, 0.48, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.END_ROD, (entity.getX()), (entity.getY()), (entity.getZ()), 4, 0.48, 0.16, 0.48, 0);
	}
}

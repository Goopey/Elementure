package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class NetherstarflareFlareProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, (entity.getX()), (entity.getY()), (entity.getZ()), 50, 0.5, 1.5, 0.5, 0.0175);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SOULFLAME.get()), (entity.getX()), (entity.getY()), (entity.getZ()),
					25, 0.3, 0.8, 0.3, 0.0175);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.NETHERSTARDUST_3.get()), (entity.getX()), (entity.getY()),
					(entity.getZ()), 12, 0.1, 0.4, 0.1, 0.0175);
		if (Math.random() < 0.004) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}

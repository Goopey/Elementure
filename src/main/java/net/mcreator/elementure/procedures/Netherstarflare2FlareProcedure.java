package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class Netherstarflare2FlareProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.008) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.END_ROD, (entity.getX() + Math.random() * 10 - 5), (entity.getY() + Math.random() * 10 - 5), (entity.getZ() + Math.random() * 10 - 5), 10, 0.1, 0.1, 0.1, 0.05);
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.NETHERSTARDUST_1.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 10, 0.2, 0.2, 0.2, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.NETHERSTARDUST_1.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 10, 0.2, 0.2, 0.2, 0.01);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.END_ROD, (entity.getX()), (entity.getY()), (entity.getZ()), 6, 0.1, 0.1, 0.1, 0);
		if (Math.random() < 0.004) {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}

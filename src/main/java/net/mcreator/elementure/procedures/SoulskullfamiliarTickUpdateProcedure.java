package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class SoulskullfamiliarTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		world.addParticle((SimpleParticleType) (ElementureModParticleTypes.SOULFLAME.get()), (entity.getX()), (entity.getY() + 0.2), (entity.getZ()),
				((-0.5 + Math.random()) / 10 - entity.getDeltaMovement().x() / 10),
				(((-1) * Math.random()) / 10 - entity.getDeltaMovement().y() / 15),
				((-0.5 + Math.random()) / 10 - entity.getDeltaMovement().z() / 10));
		FamiliarCheckPlayerProcedure.execute(world, entity);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class ChopSpecialProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CRIT, (entity.getX()), (entity.getY()), (entity.getZ()), 2, 0.5, 0.5, 0.5, 0);
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() / 2), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() / 2)));
	}
}

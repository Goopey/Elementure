package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class StarryvillagergathererParticlesProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double pitch = 0;
		double yaw = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
		pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
		yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
		yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
		for (int index0 = 0; index0 < (int) (16); index0++) {
			world.addParticle(ParticleTypes.FLAME, (entity.getX() + 0.2 * yaw * pitch), (entity.getY() + 1.633 + 0.2 * pitch2), (entity.getZ() + 0.2 * yaw2 * pitch), (((yaw * pitch) / (-4) + (Math.random() - 0.5) / 2) / 16),
					((pitch2 / (-4) + (Math.random() - 0.5) / 2) / 16), (((yaw2 * pitch) / (-4) + (Math.random() - 0.5) / 2) / 16));
		}
	}
}

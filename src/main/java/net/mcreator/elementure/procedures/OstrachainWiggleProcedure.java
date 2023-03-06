package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class OstrachainWiggleProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWater()) {
			if (entity.getDeltaMovement().y() > 0) {
				if (entity.getDeltaMovement().y() > 0.03) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (-0.005), (entity.getDeltaMovement().z())));
				} else {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() * 1.1 + 0.002), (entity.getDeltaMovement().z())));
				}
			} else {
				if (entity.getDeltaMovement().y() < -0.03) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.005, (entity.getDeltaMovement().z())));
				} else {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() * 1.1 - 0.002), (entity.getDeltaMovement().z())));
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class TarEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.setDeltaMovement(
				new Vec3((entity.getDeltaMovement().x() / 8), (entity.getDeltaMovement().y() / 8), (entity.getDeltaMovement().z() / 8)));
		if (TarOverlayIsInTarProcedure.execute(world, entity)) {
			entity.setAirSupply(0);
			entity.hurt(DamageSource.DROWN, 1);
		}
	}
}

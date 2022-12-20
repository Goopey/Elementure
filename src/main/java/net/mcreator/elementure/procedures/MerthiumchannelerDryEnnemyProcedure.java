package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class MerthiumchannelerDryEnnemyProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FALLING_WATER, (entity.getX()), (entity.getY()), (entity.getZ()), 20, 1, 1, 1, 0.1);
		if (entity instanceof Drowned) {
			entity.hurt(DamageSource.GENERIC, 8);
		} else {
			entity.hurt(DamageSource.GENERIC, 4);
		}
	}
}

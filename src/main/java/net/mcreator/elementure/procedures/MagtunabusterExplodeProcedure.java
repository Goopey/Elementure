package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.MagtunaBusterFirestormBallEntity;

public class MagtunabusterExplodeProcedure {
	public static void execute(LevelAccessor world, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new MagtunaBusterFirestormBallEntity(ElementureModEntities.MAGTUNA_BUSTER_FIRESTORM_BALL.get(), _level);
			entityToSpawn.moveTo((immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, (immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), 70, 0.6, 0.6, 0.6, 0.01);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), 8, 0.6, 0.6, 0.6, 0.01);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), 2, Explosion.BlockInteraction.NONE);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.ObleckturretEntity;
import net.mcreator.elementure.entity.ObleckEntity;
import net.mcreator.elementure.entity.MindobleckEntity;

public class ObleckclericSpawnOblecksProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double locX = 0;
		double locZ = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if (Math.random() < 0.005) {
				locX = Math.random() * 8 - 4;
				locZ = Math.random() * 8 - 4;
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.MEMORYPARTICLE.get()), (entity.getX()), (entity.getY() + 1),
							(entity.getZ()), 50, 0.33, 0.33, 0.33, 0.033);
				if ((world.getBlockState(new BlockPos(entity.getX() + locX, entity.getY(), entity.getZ() + locZ))).getBlock() == Blocks.AIR) {
					if (Math.random() < 0.6) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new ObleckEntity(ElementureModEntities.OBLECK.get(), _level);
							entityToSpawn.moveTo((entity.getX() + locX), (entity.getY()), (entity.getZ() + locZ),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.33) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MindobleckEntity(ElementureModEntities.MINDOBLECK.get(), _level);
							entityToSpawn.moveTo((entity.getX() + locX), (entity.getY()), (entity.getZ() + locZ),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new ObleckEntity(ElementureModEntities.OBLECK.get(), _level);
							entityToSpawn.moveTo((entity.getX() + locX), (entity.getY()), (entity.getZ() + locZ),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new ObleckEntity(ElementureModEntities.OBLECK.get(), _level);
							entityToSpawn.moveTo((entity.getX() + locX), (entity.getY()), (entity.getZ() + locZ),
									world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new ObleckturretEntity(ElementureModEntities.OBLECKTURRET.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY() + 1), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.SpiderQueenEntity;
import net.mcreator.elementure.entity.HeadHostEntity;
import net.mcreator.elementure.entity.ArachneelEntity;

public class SpiderqueenAttackMasterProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("balling")) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, (entity.getX()), (entity.getY()), (entity.getZ()), 1, 0.8, 0.2, 0.8, 0);
		}
		if (world.dayTime() % 15 == 0) {
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
				if (entity.getPersistentData().getDouble("attackCooldown") == 0) {
					((SpiderQueenEntity) entity).setRolling(false);
					entity.getPersistentData().putBoolean("balling", (false));
				}
				if (entity.getPersistentData().getDouble("attackCooldown") <= -5) {
					if (Math.random() < 0.35) {
						if (Math.random() < 0.3) {
							for (int index0 = 0; index0 < (int) (1 + Math.round(Math.random())); index0++) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new ArachneelEntity(ElementureModEntities.ARACHNEEL.get(), _level);
									entityToSpawn.moveTo((entity.getX() + Math.random() * 6 - 3), (entity.getY() + 0.2), (entity.getZ() + Math.random() * 6 - 3), world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									world.addFreshEntity(entityToSpawn);
								}
							}
						} else {
							for (int index1 = 0; index1 < (int) (1 + Math.round(Math.random() * 2)); index1++) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new HeadHostEntity(ElementureModEntities.HEAD_HOST.get(), _level);
									entityToSpawn.moveTo((entity.getX() + Math.random() * 6 - 3), (entity.getY() + 0.2), (entity.getZ() + Math.random() * 6 - 3), world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									world.addFreshEntity(entityToSpawn);
								}
							}
						}
						entity.getPersistentData().putDouble("attackCooldown", 0);
					} else {
						entity.getPersistentData().putDouble("attackCooldown", 5);
						((SpiderQueenEntity) entity).setRolling(true);
						entity.getPersistentData().putBoolean("balling", (true));
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 2, (false), (false)));
					}
				}
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 1));
			} else if (entity.getPersistentData().getDouble("attackCooldown") < 0) {
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			}
		}
	}
}

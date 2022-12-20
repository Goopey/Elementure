package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.ScrapguardianEntity;

public class ScrapguardianRegenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("scrapGuardianComeBackTime") >= 600) {
			if (!entity.level.isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ScrapguardianEntity(ElementureModEntities.SCRAPGUARDIAN.get(), _level);
				entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else {
			entity.getPersistentData().putDouble("scrapGuardianComeBackTime",
					(entity.getPersistentData().getDouble("scrapGuardianComeBackTime") + 1));
			if (Math.random() < 0.22) {
				if (Math.random() < 0.35) {
					entity.getPersistentData().putDouble("scrapGuardianComeBackTime",
							(entity.getPersistentData().getDouble("scrapGuardianComeBackTime") - 0.33));
				} else {
					entity.getPersistentData().putDouble("scrapGuardianComeBackTime",
							(entity.getPersistentData().getDouble("scrapGuardianComeBackTime") + 0.24));
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.MycenashroomlordEntity;
import net.mcreator.elementure.entity.MycenafumoonshroomlordEntity;

public class MycenadepthsspecialroomgenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MycenadepthsRegularRoomGenProcedure.execute(world, x, y, z);
		if (y < 32) {
			if (Math.random() < 0.95) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MycenashroomlordEntity(ElementureModEntities.MYCENASHROOMLORD.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MycenafumoonshroomlordEntity(ElementureModEntities.MYCENAFUMOONSHROOMLORD.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}

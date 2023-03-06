package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.MycenatrufflingEntity;

public class MycenatruffloonTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("wait") > 60) {
			MycenashroomcloudProcedure.execute(world, (entity.getX()), (entity.getY() - 0.25), (entity.getZ()));
			entity.getPersistentData().putDouble("wait", 0);
		} else {
			entity.getPersistentData().putDouble("wait", (entity.getPersistentData().getDouble("wait") + 1));
		}
		if (entity.getPersistentData().getDouble("time") > 900) {
			if (Math.random() < 0.1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MycenatrufflingEntity(ElementureModEntities.MYCENATRUFFLING.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MycenatrufflingEntity(ElementureModEntities.MYCENATRUFFLING.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MycenatrufflingEntity(ElementureModEntities.MYCENATRUFFLING.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			entity.getPersistentData().putDouble("time", 0);
		} else {
			entity.getPersistentData().putDouble("time", (entity.getPersistentData().getDouble("time") + 1));
		}
		MycenaadultmobsquickDespawnProcedure.execute(world, entity);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.MycenashroomalEntity;

public class MycenashroomlordLongAttackBehavior1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double locZ = 0;
		double locX = 0;
		if (entity.getPersistentData().getDouble("attackongoingtime") == 80 || entity.getPersistentData().getDouble("attackongoingtime") == 160
				|| entity.getPersistentData().getDouble("attackongoingtime") == 240) {
			for (int index0 = 0; index0 < (int) (2); index0++) {
				locX = Math.random() * 16 - 8;
				locZ = Math.random() * 16 - 8;
				while (locX * locX + locZ * locZ > 64) {
					locX = Math.random() * 16 - 8;
					locZ = Math.random() * 16 - 8;
					if (locX * locX + locZ * locZ <= 64) {
						break;
					}
				}
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MycenashroomalEntity(ElementureModEntities.MYCENASHROOMAL.get(), _level);
					entityToSpawn.moveTo((entity.getX() + locX), (entity.getY() + 2), (entity.getZ() + locZ), world.getRandom().nextFloat() * 360F,
							0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
				MycenashroomcloudProcedure.execute(world, (entity.getX() + locX), (entity.getY() + 2), (entity.getZ() + locZ));
				MycenashroomcloudProcedure.execute(world, (entity.getX() + locX), (entity.getY() + 2), (entity.getZ() + locZ));
			}
		} else if (entity.getPersistentData().getDouble("attackongoingtime") >= 241) {
			entity.getPersistentData().putDouble("attackongoingtime", 0);
			entity.getPersistentData().putDouble("attacktype", 0);
			entity.getPersistentData().putBoolean("attackongoing", (false));
		}
	}
}

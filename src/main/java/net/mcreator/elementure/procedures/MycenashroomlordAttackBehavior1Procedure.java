package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.MycenashroomlingEntity;

public class MycenashroomlordAttackBehavior1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double locX = 0;
		double locZ = 0;
		locX = -5;
		locZ = -5;
		for (int index0 = 0; index0 < (int) (100); index0++) {
			if (locX * locX + locZ * locZ <= 25 && Math.random() < 0.04) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MycenashroomlingEntity(ElementureModEntities.MYCENASHROOMLING.get(), _level);
					entityToSpawn.moveTo((entity.getX() + locX), (entity.getY() + 2), (entity.getZ() + locZ), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				MycenashroomcloudProcedure.execute(world, (entity.getX() + locX), (entity.getY() + 2), (entity.getZ() + locZ));
			}
			locX = locX + 1;
			if (locX == 5) {
				locX = -5;
				locZ = locZ + 1;
				if (locZ == 5) {
					locX = -5;
					locZ = -5;
				}
			}
		}
	}
}

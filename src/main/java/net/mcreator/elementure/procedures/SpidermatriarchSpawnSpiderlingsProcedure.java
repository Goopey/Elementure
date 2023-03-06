package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.SpiderlingEntity;

public class SpidermatriarchSpawnSpiderlingsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.dayTime() % 20 <= 0) {
			entity.getPersistentData().putDouble("lifeSpan", (entity.getPersistentData().getDouble("lifeSpan") + 1));
			if (entity.getPersistentData().getDouble("lifeSpan") > 3) {
				entity.getPersistentData().putDouble("lifeSpan", 0);
				if (!(!world.getEntitiesOfClass(SpiderlingEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 20, 20, 20), e -> true).isEmpty())) {
					for (int index0 = 0; index0 < (int) (3); index0++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new SpiderlingEntity(ElementureModEntities.SPIDERLING.get(), _level);
							entityToSpawn.moveTo((entity.getX() + Math.random() * 2 - 1), (entity.getY()), (entity.getZ() + Math.random() * 2 - 1), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}

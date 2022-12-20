package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.JellyEntity;

public class JellySummonProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(JellyEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 12, 12, 12),
				e -> true).isEmpty()) {
			if (Math.random() < 0.5) {
				LargejellySuckAttackProcedure.execute(world, entity);
			} else {
				LargejellyAOEAttackProcedure.execute(world, entity);
			}
		} else {
			for (int index0 = 0; index0 < (int) (3); index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new JellyEntity(ElementureModEntities.JELLY.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}

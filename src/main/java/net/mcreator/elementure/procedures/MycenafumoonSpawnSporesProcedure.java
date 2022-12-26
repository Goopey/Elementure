package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.MycenafumoonsporeEntity;

public class MycenafumoonSpawnSporesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double LocX = 0;
		double LocY = 0;
		double LocZ = 0;
		LocX = Math.random() * 5 - 2;
		LocZ = Math.random() * 5 - 2;
		LocY = Math.random() * 3 + 1;
		if (entity.getPersistentData().getDouble("wait") > 600
				&& !(!world.getEntitiesOfClass(MycenafumoonsporeEntity.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MycenafumoonsporeEntity(ElementureModEntities.MYCENAFUMOONSPORE.get(), _level);
				entityToSpawn.moveTo((x + LocX), (y + LocY), (z + LocZ), 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			entity.getPersistentData().putDouble("wait", Math.round(Math.random() * 100));
		} else {
			entity.getPersistentData().putDouble("wait", (entity.getPersistentData().getDouble("wait") + 1));
		}
	}
}

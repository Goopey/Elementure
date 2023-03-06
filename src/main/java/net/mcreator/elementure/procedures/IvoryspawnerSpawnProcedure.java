package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.IvoryshadeEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class IvoryspawnerSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double numMobs = 0;
		if (Math.random() < 0.5) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					numMobs = numMobs + 1;
				}
			}
			if (numMobs < 4) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new IvoryshadeEntity(ElementureModEntities.IVORYSHADE.get(), _level);
					entityToSpawn.moveTo((x + (Math.random() < 0.5 ? 1 : -1)), y, (z + (Math.random() < 0.5 ? 1 : -1)), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.RimeboidEntity;
import net.mcreator.elementure.ElementureMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class RimeboidSchoolSpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("isMax")) {
			ElementureMod.queueServerWork(1, () -> {
				if (Math.random() < 0.02 || !entity.getPersistentData().getBoolean("isBonus")) {
					for (int index0 = 0; index0 < (int) (5); index0++) {
						if (Math.random() < 0.85) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new RimeboidEntity(ElementureModEntities.RIMEBOID.get(), _level);
								entityToSpawn.moveTo((entity.getX() + Math.random() * 6 - 3), (entity.getY() + Math.random() * 6 - 3), (entity.getZ() + Math.random() * 6 - 3), 0, 0);
								entityToSpawn.setYBodyRot(0);
								entityToSpawn.setYHeadRot(0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
					if (entity.getPersistentData().getBoolean("isBonus")) {
						{
							final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof RimeboidEntity) {
									entityiterator.getPersistentData().putBoolean("isMax", (true));
								}
							}
						}
					} else {
						{
							final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof RimeboidEntity) {
									entityiterator.getPersistentData().putBoolean("isBonus", (true));
								}
							}
						}
					}
				}
			});
		}
	}
}

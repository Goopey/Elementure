package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.ObleckturretEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class OblecklordAdaptOvercomeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double numberEntities = 0;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ObleckturretEntity) {
					numberEntities = numberEntities + 1;
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
				/ (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) >= 0.25) {
			for (int index0 = 0; index0 < (int) (2 - numberEntities); index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ObleckturretEntity(ElementureModEntities.OBLECKTURRET.get(), _level);
					entityToSpawn.moveTo((entity.getX() + Math.random() * 24 - 12), (entity.getY() + Math.random() * 24 - 12),
							(entity.getZ() + Math.random() * 24 - 12), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		} else {
			for (int index1 = 0; index1 < (int) (3 - numberEntities); index1++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ObleckturretEntity(ElementureModEntities.OBLECKTURRET.get(), _level);
					entityToSpawn.moveTo((entity.getX() + Math.random() * 24 - 12), (entity.getY() + Math.random() * 24 - 12),
							(entity.getZ() + Math.random() * 24 - 12), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}

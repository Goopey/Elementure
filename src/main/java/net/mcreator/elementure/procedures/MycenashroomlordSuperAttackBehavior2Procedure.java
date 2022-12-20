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

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class MycenashroomlordSuperAttackBehavior2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double locZ = 0;
		double locX = 0;
		if (entity.getPersistentData().getDouble("attackongoingtime") == 50 || entity.getPersistentData().getDouble("attackongoingtime") == 100
				|| entity.getPersistentData().getDouble("attackongoingtime") == 150) {
			locX = Math.random() * 10 - 5;
			locZ = Math.random() * 10 - 5;
			while (locX * locX + locZ * locZ > 25) {
				locX = Math.random() * 10 - 5;
				locZ = Math.random() * 10 - 5;
				if (locX * locX + locZ * locZ <= 25) {
					break;
				}
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MycenafumoonsporeEntity(ElementureModEntities.MYCENAFUMOONSPORE.get(), _level);
				entityToSpawn.moveTo((entity.getX() + locX), (entity.getY() + 5), (entity.getZ() + locZ), world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
			{
				final Vec3 _center = new Vec3((entity.getX() + locX), (entity.getY() + 5), (entity.getZ() + locZ));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof MycenafumoonsporeEntity) {
						entityiterator.getPersistentData().putBoolean("isHealer", (true));
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("attackongoingtime") >= 151) {
			entity.getPersistentData().putDouble("attackongoingtime", 0);
			entity.getPersistentData().putDouble("attacktype", 0);
			entity.getPersistentData().putBoolean("attackongoing", (false));
		}
	}
}

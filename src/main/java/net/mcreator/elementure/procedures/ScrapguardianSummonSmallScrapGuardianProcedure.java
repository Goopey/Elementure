package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.ScrapguardiansmallEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class ScrapguardianSummonSmallScrapGuardianProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double numScrapGuardian = 0;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(24 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ScrapguardiansmallEntity) {
					numScrapGuardian = numScrapGuardian + 1;
				}
			}
		}
		if (numScrapGuardian <= 3) {
			if (entity.getPersistentData().getDouble("scrapGuardianSummonTime") >= 240) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ScrapguardiansmallEntity(ElementureModEntities.SCRAPGUARDIANSMALL.get(), _level);
					entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				entity.getPersistentData().putDouble("scrapGuardianSummonTime", 0);
			} else {
				entity.getPersistentData().putDouble("scrapGuardianSummonTime", (entity.getPersistentData().getDouble("scrapGuardianSummonTime") + 1));
				if (Math.random() < 0.22) {
					if (Math.random() < 0.35) {
						entity.getPersistentData().putDouble("scrapGuardianSummonTime", (entity.getPersistentData().getDouble("scrapGuardianSummonTime") - 0.33));
					} else {
						entity.getPersistentData().putDouble("scrapGuardianSummonTime", (entity.getPersistentData().getDouble("scrapGuardianSummonTime") + 0.24));
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("scrapGuardianSummonTime", 0);
		}
	}
}

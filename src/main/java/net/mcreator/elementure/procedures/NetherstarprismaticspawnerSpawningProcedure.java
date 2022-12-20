package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.AscendedaspidEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class NetherstarprismaticspawnerSpawningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double entnum = 0;
		locX = -3;
		locZ = -3;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				entnum = entnum + 1;
			}
		}
		if (entnum < 12) {
			for (int index0 = 0; index0 < (int) (343); index0++) {
				if (world.isEmptyBlock(new BlockPos(x + locX, y, z + locZ)) && Math.random() < 0.0032) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new AscendedaspidEntity(ElementureModEntities.ASCENDEDASPID.get(), _level);
						entityToSpawn.moveTo((x + locX), y, (z + locZ), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
				locX = locX + 1;
				if (locX >= 3) {
					locX = -3;
					locZ = locZ + 1;
					if (locZ >= 3) {
						locX = -3;
						locZ = -3;
					}
				}
			}
		}
	}
}

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
import net.mcreator.elementure.entity.MycenatruffloonEntity;
import net.mcreator.elementure.entity.MycenatrufflingEntity;

public class MycenasporecloudspawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		double CoordsX = 0;
		double CoordsZ = 0;
		double maxChecks = 0;
		if (Math.random() < 0.016666666
				&& !(!world.getEntitiesOfClass(MycenatrufflingEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty())
				&& !(!world.getEntitiesOfClass(MycenatruffloonEntity.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty())) {
			CoordsX = Math.random() * 6 - 3;
			CoordsY = Math.random() * 6 - 3;
			CoordsZ = Math.random() * 6 - 3;
			maxChecks = 0;
			while (!world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)).canOcclude() && y + CoordsY >= -64 && maxChecks <= 4) {
				if (!world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)).canOcclude()) {
					if (Math.random() < 0.88) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MycenatrufflingEntity(ElementureModEntities.MYCENATRUFFLING.get(), _level);
							entityToSpawn.moveTo((x + CoordsX), (y + CoordsY), (z + CoordsZ), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = new MycenatruffloonEntity(ElementureModEntities.MYCENATRUFFLOON.get(), _level);
							entityToSpawn.moveTo((x + CoordsX), (y + CoordsY), (z + CoordsZ), world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof Mob _mobToSpawn)
								_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()),
										MobSpawnType.MOB_SUMMONED, null, null);
							world.addFreshEntity(entityToSpawn);
						}
					}
					break;
				}
				CoordsX = Math.random() * 6 - 3;
				CoordsY = Math.random() * 6 - 3;
				CoordsZ = Math.random() * 6 - 3;
				maxChecks = maxChecks + 1;
			}
		}
	}
}

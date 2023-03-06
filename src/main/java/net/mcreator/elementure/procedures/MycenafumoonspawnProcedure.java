package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.MycenafumoonEntity;

public class MycenafumoonspawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		while (!world.getBlockState(new BlockPos(x, (y + CoordsY) - 1, z)).canOcclude() && y + CoordsY >= 0) {
			if (!world.getBlockState(new BlockPos(x, y + CoordsY, z)).canOcclude() && world.getBlockState(new BlockPos(x, (y + CoordsY) - 1, z)).canOcclude()) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MycenafumoonEntity(ElementureModEntities.MYCENAFUMOON.get(), _level);
					entityToSpawn.moveTo(x, (y + CoordsY), z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				break;
			}
			CoordsY = CoordsY - 1;
		}
	}
}

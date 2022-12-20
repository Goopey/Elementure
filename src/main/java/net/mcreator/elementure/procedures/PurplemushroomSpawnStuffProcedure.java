package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.entity.PerinealbotflyEntity;

public class PurplemushroomSpawnStuffProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.1) {
			if (Math.random() < 0.5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new PerinealbotflyEntity(ElementureModEntities.PERINEALBOTFLY.get(), _level);
					entityToSpawn.moveTo(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new PerinealbotflyEntity(ElementureModEntities.PERINEALBOTFLY.get(), _level);
					entityToSpawn.moveTo(x, (y - 1), z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.05) {
			world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.PURPLEMUSHROOMS.get().defaultBlockState(), 3);
		}
	}
}

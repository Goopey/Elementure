package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class AbyssalspawnerSpawnerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double DeciderTYPE = 0;
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		if (Math.random() < 0.05) {
			DeciderTYPE = Math.random() * 250;
			for (int index0 = 0; index0 < (int) (343); index0++) {
				if ((world.getBlockState(new BlockPos((x + CoordsX) - 3, (y + CoordsY) - 3, (z + CoordsZ) - 3))).getBlock() == Blocks.AIR
						&& !((world.getBlockState(new BlockPos((x + CoordsX) - 3, (y + CoordsY) - 4, (z + CoordsZ) - 3))).getBlock() == Blocks.AIR)
						&& (world.getBlockState(new BlockPos((x + CoordsX) - 3, (y + CoordsY) - 2, (z + CoordsZ) - 3))).getBlock() == Blocks.AIR) {
					if (Math.random() < 0.0000165) {
						if (DeciderTYPE < 100) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new Bee(EntityType.BEE, _level);
								entityToSpawn.moveTo(((x + CoordsX) - 3), ((y + CoordsY) - 2), ((z + CoordsZ) - 3), world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						} else if (DeciderTYPE < 200 && DeciderTYPE > 100) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new Bee(EntityType.BEE, _level);
								entityToSpawn.moveTo(((x + CoordsX) - 3), ((y + CoordsY) - 2), ((z + CoordsZ) - 3), world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new Bee(EntityType.BEE, _level);
								entityToSpawn.moveTo(((x + CoordsX) - 3), ((y + CoordsY) - 2), ((z + CoordsZ) - 3), world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
						CoordsX = CoordsX + 1;
					}
				}
				CoordsX = CoordsX + 1;
				if (CoordsX == 7) {
					CoordsX = 0;
					CoordsZ = CoordsZ + 1;
					if (CoordsZ == 7) {
						CoordsX = 0;
						CoordsY = CoordsY + 1;
						CoordsZ = 0;
						if (CoordsY == 0) {
							CoordsX = 0;
							CoordsY = 0;
							CoordsZ = 0;
						}
					}
				}
			}
		}
	}
}

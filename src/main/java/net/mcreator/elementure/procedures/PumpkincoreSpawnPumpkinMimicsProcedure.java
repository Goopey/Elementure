package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.PumpkinmimicEntity;

public class PumpkincoreSpawnPumpkinMimicsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double locY = 0;
		if (Math.random() < 0.1) {
			if (ElementureModVariables.MapVariables.get(world).isHalloween || !(world instanceof Level _lvl && _lvl.isDay()) && Math.random() < 0.25) {
				locX = Math.random() < 0.5 ? 3 : -3;
				locZ = Math.random() < 0.5 ? 3 : -3;
				locY = Math.random() * 3;
				if (world.isEmptyBlock(new BlockPos(x + locX, y + locY, z + locZ))) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PumpkinmimicEntity(ElementureModEntities.PUMPKINMIMIC.get(), _level);
						entityToSpawn.moveTo((x + locX), (y + locY), (z + locZ), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}

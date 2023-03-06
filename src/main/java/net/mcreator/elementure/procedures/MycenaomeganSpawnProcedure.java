package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.MycenatruffloonEntity;
import net.mcreator.elementure.entity.MycenatrufflingEntity;
import net.mcreator.elementure.entity.MycenasporelingEntity;
import net.mcreator.elementure.entity.MycenashroomlingEntity;
import net.mcreator.elementure.entity.MycenashroomalEntity;
import net.mcreator.elementure.entity.MycenaroamerEntity;
import net.mcreator.elementure.entity.MycenainfectedshroomguardEntity;

public class MycenaomeganSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		CoordsX = -14;
		CoordsY = -7;
		CoordsZ = -14;
		for (int index0 = 0; index0 < (int) (12615); index0++) {
			if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.AIR && Math.random() < 0.00000305) {
				if (Math.random() < 0.14) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MycenainfectedshroomguardEntity(ElementureModEntities.MYCENAINFECTEDSHROOMGUARD.get(), _level);
						entityToSpawn.moveTo((x + CoordsX), (y + CoordsY), (z + CoordsZ), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.14 && Math.random() < 0.28) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MycenashroomlingEntity(ElementureModEntities.MYCENASHROOMLING.get(), _level);
						entityToSpawn.moveTo((x + CoordsX), (y + CoordsY), (z + CoordsZ), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.28 && Math.random() < 0.43) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MycenasporelingEntity(ElementureModEntities.MYCENASPORELING.get(), _level);
						entityToSpawn.moveTo((x + CoordsX), (y + CoordsY), (z + CoordsZ), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.43 && Math.random() < 0.57) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MycenashroomalEntity(ElementureModEntities.MYCENASHROOMAL.get(), _level);
						entityToSpawn.moveTo((x + CoordsX), (y + CoordsY), (z + CoordsZ), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.57 && Math.random() < 0.71) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MycenaroamerEntity(ElementureModEntities.MYCENAROAMER.get(), _level);
						entityToSpawn.moveTo((x + CoordsX), (y + CoordsY), (z + CoordsZ), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() > 0.71 && Math.random() < 0.86) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MycenatruffloonEntity(ElementureModEntities.MYCENATRUFFLOON.get(), _level);
						entityToSpawn.moveTo((x + CoordsX), (y + CoordsY), (z + CoordsZ), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new MycenatrufflingEntity(ElementureModEntities.MYCENATRUFFLING.get(), _level);
						entityToSpawn.moveTo((x + CoordsX), (y + CoordsY), (z + CoordsZ), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 14) {
				CoordsX = -14;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 14) {
					CoordsX = -14;
					CoordsY = CoordsY + 1;
					CoordsZ = -14;
					if (CoordsY == 7) {
						CoordsX = -14;
						CoordsY = -7;
						CoordsZ = -14;
					}
				}
			}
		}
	}
}

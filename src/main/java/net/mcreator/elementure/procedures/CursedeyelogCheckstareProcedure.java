package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class CursedeyelogCheckstareProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double cursedeyetimer = 0;
		cursedeyetimer = cursedeyetimer + 1;
		if (cursedeyetimer == 21) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ExperienceOrb(EntityType.EXPERIENCE_ORB, _level);
					entityToSpawn.moveTo((x + 1), y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ExperienceOrb(EntityType.EXPERIENCE_ORB, _level);
					entityToSpawn.moveTo((x - 1), y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ExperienceOrb(EntityType.EXPERIENCE_ORB, _level);
					entityToSpawn.moveTo(x, y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ExperienceOrb(EntityType.EXPERIENCE_ORB, _level);
					entityToSpawn.moveTo(x, y, (z - 1), world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}

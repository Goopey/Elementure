package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.MycenashroomlordEntity;

public class MycenasuperfertilizerSummonMycenaShroomlordProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		if (world.getBlockState(new BlockPos(x, y, z)).canOcclude()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new MycenashroomlordEntity(ElementureModEntities.MYCENASHROOMLORD.get(), _level);
				entityToSpawn.moveTo(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
			(itemstack).shrink(1);
		}
	}
}

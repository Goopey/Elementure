package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class FishingpoolReward3Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		DungeonwaterFishingRewardsProcedure.execute(world, entity);
		DiverscrownpoolrewardProcedure.execute(world, entity);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class DungeonwaterFishingRewardsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		GrayskulllakeRewardProcedure.execute(world, entity);
		WindyshoresFishingRewardProcedure.execute(world, entity);
	}
}

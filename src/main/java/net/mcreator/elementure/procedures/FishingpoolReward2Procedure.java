package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class FishingpoolReward2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		JellypoolsfishingRewardProcedure.execute(world, entity);
		VoidfishingpoolRewardProcedure.execute(world, entity);
		NetherstarpoolRewardProcedure.execute(world, entity);
		CrabfishingpoolRewardProcedure.execute(world, entity);
		FishingpoolReward3Procedure.execute(world, entity);
	}
}

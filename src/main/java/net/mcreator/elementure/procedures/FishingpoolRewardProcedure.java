package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class FishingpoolRewardProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("caughtFishElementure", ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish));
		MycenafishingpoolRewardProcedure.execute(world, entity);
		VanillafishingpoolrewardProcedure.execute(world, entity);
		LavafishingpoolRewardProcedure.execute(world, entity);
		DiseasedfishRewardProcedure.execute(world, entity);
		FishingpoolReward2Procedure.execute(world, entity);
		{
			String _setval = "";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.chosenFish = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fishBiome = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = false;
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.firstfishlaunch = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class IntroPlayProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		MusicStopMusicProcedure.execute(entity);
		{
			double _setval = -8000;
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.musictimer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "intro";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.musicName = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

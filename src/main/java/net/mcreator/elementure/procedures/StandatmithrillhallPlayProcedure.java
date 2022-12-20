package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class StandatmithrillhallPlayProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		MusicStopMusicProcedure.execute(entity);
		{
			double _setval = -1900;
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.musictimer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "sirenqueen";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.musicName = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

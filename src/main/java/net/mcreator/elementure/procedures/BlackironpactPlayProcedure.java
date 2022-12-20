package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class BlackironpactPlayProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		MusicStopMusicProcedure.execute(entity);
		{
			double _setval = -5700;
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.musictimer = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = "umbrasyl";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.musicName = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class HinderedReenableCapabilitiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("wasSurvival")) {
			entity.getPersistentData().putBoolean("wasSurvival", (false));
			if (entity instanceof ServerPlayer _player)
				_player.setGameMode(GameType.SURVIVAL);
			if (entity instanceof Player _player) {
				_player.getAbilities().mayBuild = (true);
				_player.onUpdateAbilities();
			}
		}
	}
}

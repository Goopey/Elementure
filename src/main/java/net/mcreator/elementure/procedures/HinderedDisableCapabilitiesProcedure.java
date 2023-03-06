package net.mcreator.elementure.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

public class HinderedDisableCapabilitiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) == 0) {
			if (entity.getPersistentData().getBoolean("wasSurvival")) {
				entity.getPersistentData().putBoolean("wasSurvival", (false));
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.SURVIVAL);
				if (entity instanceof Player _player) {
					_player.getAbilities().mayBuild = (true);
					_player.onUpdateAbilities();
				}
			}
		} else {
			if (new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
					}
					return false;
				}
			}.checkGamemode(entity) || entity.getPersistentData().getBoolean("wasSurvival")) {
				entity.getPersistentData().putBoolean("wasSurvival", (true));
				if (entity instanceof ServerPlayer _player)
					_player.setGameMode(GameType.ADVENTURE);
				if (entity instanceof Player _player) {
					_player.getAbilities().mayBuild = (false);
					_player.onUpdateAbilities();
				}
			}
		}
	}
}

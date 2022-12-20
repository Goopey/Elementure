package net.mcreator.elementure.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import net.mcreator.elementure.network.ElementureModVariables;

public class AbyssalheartToggleabyssProcedure {
	public static void execute(LevelAccessor world) {
		if (ElementureModVariables.WorldVariables.get(world).isAbyssalSingularityAlive == true) {
			ElementureModVariables.WorldVariables.get(world).isAbyssalSingularityAlive = false;
			ElementureModVariables.WorldVariables.get(world).syncData(world);
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent("The Abyssal Corruption has stopped spreading!"), ChatType.SYSTEM,
							Util.NIL_UUID);
			}
		} else {
			ElementureModVariables.WorldVariables.get(world).isAbyssalSingularityAlive = true;
			ElementureModVariables.WorldVariables.get(world).syncData(world);
			if (!world.isClientSide()) {
				MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
				if (_mcserv != null)
					_mcserv.getPlayerList().broadcastMessage(new TextComponent("The Abyssal Corruption is spreading!"), ChatType.SYSTEM,
							Util.NIL_UUID);
			}
		}
	}
}

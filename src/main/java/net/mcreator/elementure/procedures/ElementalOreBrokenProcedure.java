package net.mcreator.elementure.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.Component;

import net.mcreator.elementure.network.ElementureModVariables;

public class ElementalOreBrokenProcedure {
	public static void execute(LevelAccessor world) {
		if (ElementureModVariables.WorldVariables.get(world).elementalOreObtained == false) {
			ElementureModVariables.WorldVariables.get(world).elementalOreObtained = true;
			ElementureModVariables.WorldVariables.get(world).syncData(world);
			if (!world.isClientSide()) {
				if (!world.isClientSide()) {
					MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
					if (_mcserv != null)
						_mcserv.getPlayerList().broadcastSystemMessage(Component.literal("You feel something rumble."), false);
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class MycenansporessplashSplashesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double LocX = 0;
		double LocZ = 0;
		LocX = -4;
		LocZ = -4;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""),
									_level.getServer(), null).withSuppressedOutput(),
							"effect give @e[distance=0.1..2] minecraft_worlds:mycenanspores 20 0");
		for (int index0 = 0; index0 < (int) (81); index0++) {
			if (LocX * LocX + LocZ * LocZ <= 16 && Math.random() < 0.5) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + LocX / 4), y, (z + LocZ / 4)), Vec2.ZERO, _level, 4, "",
									new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:entity_effect ~ ~ ~ 0 1 0 1 0 normal");
			}
			LocX = LocX + 1;
			if (LocX > 4) {
				LocX = -4;
				LocZ = LocZ + 1;
				if (LocZ > 4) {
					LocX = -4;
					LocZ = -4;
				}
			}
		}
		LocX = -4;
		LocZ = -4;
		for (int index1 = 0; index1 < (int) (81); index1++) {
			if (LocX * LocX + LocZ * LocZ <= 16 && Math.random() < 0.5) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + LocX / 8), y, (z + LocZ / 8)), Vec2.ZERO, _level, 4, "",
									new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:entity_effect ~ ~ ~ 0 1 0 1 0 normal");
			}
			LocX = LocX + 1;
			if (LocX > 4) {
				LocX = -4;
				LocZ = LocZ + 1;
				if (LocZ > 4) {
					LocX = -4;
					LocZ = -4;
				}
			}
		}
	}
}

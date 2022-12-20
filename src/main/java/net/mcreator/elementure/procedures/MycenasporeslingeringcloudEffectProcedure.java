package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class MycenasporeslingeringcloudEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double LocX = 0;
		double LocZ = 0;
		LocX = -3;
		LocZ = -3;
		if (entity.getPersistentData().getDouble("wait") > 40) {
			entity.getPersistentData().putDouble("wait", 0);
		} else {
			entity.getPersistentData().putDouble("wait", (entity.getPersistentData().getDouble("wait") + 1));
		}
		if (entity.getPersistentData().getDouble("wait") == 0 || entity.getPersistentData().getDouble("wait") == 10
				|| entity.getPersistentData().getDouble("wait") == 20 || entity.getPersistentData().getDouble("wait") == 30
				|| entity.getPersistentData().getDouble("wait") == 40) {
			for (int index0 = 0; index0 < (int) (2704); index0++) {
				if (LocX * LocX + LocZ * LocZ < 9) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX() + LocX), (entity.getY()), (entity.getZ() + LocZ)),
										Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:entity_effect ~ ~ ~ 0 1 0 1 0 normal");
				}
				LocX = LocX + 0.25;
				if (LocX > 3) {
					LocX = -3;
					LocZ = LocZ + 0.25;
					if (LocZ > 3) {
						LocX = -3;
						LocZ = -3;
					}
				}
			}
		}
		LocX = -3;
		LocZ = -3;
		if (entity.getPersistentData().getDouble("wait") == 0 || entity.getPersistentData().getDouble("wait") == 20) {
			for (int index1 = 0; index1 < (int) (169); index1++) {
				if (LocX * LocX + LocZ * LocZ < 9) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX() + LocX), (entity.getY()), (entity.getZ() + LocZ)),
										Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
								"effect give @e[distance=0.1..1] minecraft_worlds:mycenanspores 40 0");
				}
				LocX = LocX + 1;
				if (LocX > 3) {
					LocX = -3;
					LocZ = LocZ + 1;
					if (LocZ > 3) {
						LocX = -3;
						LocZ = -3;
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("wait") == 40) {
			entity.getPersistentData().putDouble("life", (entity.getPersistentData().getDouble("life") + 1));
			if (entity.getPersistentData().getDouble("life") > 10) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}

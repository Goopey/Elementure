package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class LousyswordfamiliarStopSoundProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		{
			Entity _ent = sourceentity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"stopsound @s music elementure:cucuiganon");
		}
	}
}

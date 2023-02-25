package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class MycenasporelingGrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("life") >= 6000) {
			for (int index0 = 0; index0 < (int) (2); index0++) {
				MycenashroomcloudProcedure.execute(world, (entity.getX()), (entity.getY()), (entity.getZ()));
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
									_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
									_ent.getDisplayName(), _ent.level.getServer(), _ent),
							(("summon minecraft_worlds:mycenashroomling"
									+ ((" " + entity.getX()) + "" + ((" " + entity.getY()) + "" + (" " + entity.getZ())))) + ""
									+ ((" {" + "CustomName:\"\\\"") + "" + (entity.getDisplayName().getString() + "" + "\\\"\"}"))));
				}
			}
			if (!entity.level.isClientSide())
				entity.discard();
		} else if (!(entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
			entity.getPersistentData().putDouble("life", (entity.getPersistentData().getDouble("life") + 1));
		}
	}
}

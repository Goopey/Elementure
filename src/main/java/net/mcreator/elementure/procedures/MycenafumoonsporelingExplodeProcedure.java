package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class MycenafumoonsporelingExplodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
		for (int index0 = 0; index0 < (int) (3); index0++) {
			MycenashroomcloudProcedure.execute(world, (entity.getX()), (entity.getY()), (entity.getZ()));
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "",
							new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
					"/effect give @e[distance=0.1..4] minecraft_worlds:mycenanspores 4 1");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "",
							new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
					"/effect give @e[distance=0.1..4] minecraft:instant_damage 0 0");
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (entity.getX()), (entity.getY()), (entity.getZ()), (float) 1.5, Explosion.BlockInteraction.NONE);
	}
}

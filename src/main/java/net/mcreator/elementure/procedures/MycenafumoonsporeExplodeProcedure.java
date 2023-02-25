package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class MycenafumoonsporeExplodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
		for (int index0 = 0; index0 < (int) (2); index0++) {
			MycenashroomcloudProcedure.execute(world, (x + 0.5), (y + 0.5), (z + 0.5));
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""),
									_level.getServer(), null).withSuppressedOutput(),
							"/effect give @e[distance=0.1..4] elementure:mycenanspores 6 0");
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x + 0.5), (y + 0.5), (z + 0.5), (float) 0.5, Explosion.BlockInteraction.NONE);
	}
}

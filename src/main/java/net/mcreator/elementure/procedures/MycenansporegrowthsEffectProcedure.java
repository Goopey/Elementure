package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModMobEffects;

public class MycenansporegrowthsEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "",
							Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"effect give @e[distance=0..6] minecraft_worlds:mycenanspores 8 1");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(
					new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "",
							Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"effect give @e[distance=0.1..4] minecraft_worlds:mycenansporegrowths 24 0");
		if (Math.random() < 0.33) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.MYCENANSPOREGROWTHS.get(), 480, 0));
		}
		for (int index0 = 0; index0 < (int) (2); index0++) {
			MycenashroomcloudProcedure.execute(world, (entity.getX()), (entity.getY()), (entity.getZ()));
		}
	}
}

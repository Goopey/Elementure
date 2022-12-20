package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class HomepotionEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()), (world.getLevelData().getZSpawn()));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((world.getLevelData().getXSpawn()), (world.getLevelData().getYSpawn()),
						(world.getLevelData().getZSpawn()), _ent.getYRot(), _ent.getXRot());
		}
	}
}

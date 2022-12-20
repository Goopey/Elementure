package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class RandomteleportBlockEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getX() < x && !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ElementureModBlocks.RANDOMTELEPORT_BLOCK.get())) {
			{
				Entity _ent = entity;
				_ent.teleportTo((x + 50), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 50), (int) z)), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((x + 50), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 50), (int) z)),
							z, _ent.getYRot(), _ent.getXRot());
			}
		} else if (entity.getX() > x
				&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ElementureModBlocks.RANDOMTELEPORT_BLOCK.get())) {
			{
				Entity _ent = entity;
				_ent.teleportTo((x + 50), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 50), (int) z)), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((x + 50), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 50), (int) z)),
							z, _ent.getYRot(), _ent.getXRot());
			}
		} else if (entity.getZ() < z
				&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ElementureModBlocks.RANDOMTELEPORT_BLOCK.get())) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 50))), (z + 50));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 50))),
							(z + 50), _ent.getYRot(), _ent.getXRot());
			}
		} else {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 50))), (z - 50));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 50))),
							(z - 50), _ent.getYRot(), _ent.getXRot());
			}
		}
	}
}

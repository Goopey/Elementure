package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DelaconcordedimensionSetSpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double locX = 0;
		double locZ = 0;
		if (Math.random() < 0.5) {
			locX = Math.random() * (-3) - 4;
		} else {
			locX = Math.random() * 3 + 4;
		}
		if (Math.random() < 0.5) {
			locZ = Math.random() * (-3) - 4;
		} else {
			locZ = Math.random() * 3 + 4;
		}
		{
			Entity _ent = entity;
			_ent.teleportTo(locX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) locX, (int) locZ)), locZ);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(locX, (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) locX, (int) locZ)), locZ, _ent.getYRot(), _ent.getXRot());
		}
		if (!((world.getBlockState(new BlockPos(0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) - 1, 0))).getBlock() == ElementureModBlocks.FISHALTAR.get())) {
			if (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) > 10) {
				world.setBlock(new BlockPos(0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0), 0), ElementureModBlocks.FISHALTAR.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0), 0), Blocks.SMOOTH_QUARTZ.defaultBlockState(), 3);
				if (!((world.getBlockState(new BlockPos(0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0) - 1, 0))).getBlock() == ElementureModBlocks.FISHALTAR.get())) {
					world.setBlock(new BlockPos(0, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 0, 0), 0), ElementureModBlocks.FISHALTAR.get().defaultBlockState(), 3);
				}
			}
		}
	}
}

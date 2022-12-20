package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class CryocarpetProcedureCarpetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(0);
		world.setBlock(new BlockPos(x, y, z), Blocks.PACKED_ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z), Blocks.PACKED_ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y, z), Blocks.PACKED_ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y, z), Blocks.PACKED_ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 1, z), Blocks.PACKED_ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y - 1, z), Blocks.PACKED_ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z + 1), Blocks.PACKED_ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z - 1), Blocks.PACKED_ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z + 1), Blocks.PACKED_ICE.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 1, z - 1), Blocks.PACKED_ICE.defaultBlockState(), 3);
	}
}

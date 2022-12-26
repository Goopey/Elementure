package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PumpkinobleckSpawnerFixProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.scheduleTick(new BlockPos(x - 1, y + 1, z + 1), world.getBlockState(new BlockPos(x - 1, y + 1, z + 1)).getBlock(), 60);
		world.scheduleTick(new BlockPos(x - 1, y - 1, z + 1), world.getBlockState(new BlockPos(x - 1, y - 1, z + 1)).getBlock(), 60);
		world.scheduleTick(new BlockPos(x - 3, y + 1, z + 1), world.getBlockState(new BlockPos(x - 3, y + 1, z + 1)).getBlock(), 60);
		world.scheduleTick(new BlockPos(x - 3, y - 1, z + 1), world.getBlockState(new BlockPos(x - 3, y - 1, z + 1)).getBlock(), 60);
		world.scheduleTick(new BlockPos(x - 3, y + 1, z + 3), world.getBlockState(new BlockPos(x - 3, y + 1, z + 3)).getBlock(), 60);
		world.scheduleTick(new BlockPos(x - 3, y - 1, z + 3), world.getBlockState(new BlockPos(x - 3, y - 1, z + 3)).getBlock(), 60);
		world.scheduleTick(new BlockPos(x - 1, y + 1, z + 3), world.getBlockState(new BlockPos(x - 1, y + 1, z + 3)).getBlock(), 60);
		world.scheduleTick(new BlockPos(x - 1, y - 1, z + 3), world.getBlockState(new BlockPos(x - 1, y - 1, z + 3)).getBlock(), 60);
		world.scheduleTick(new BlockPos(x - 2, y, z + 2), world.getBlockState(new BlockPos(x - 2, y, z + 2)).getBlock(), 60);
	}
}

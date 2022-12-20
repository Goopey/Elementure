package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class BigSkyBeamBurnGroundProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x - 0.5, y, z - 0.5))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x - 0.5, y, z - 0.5), Blocks.FIRE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x + 0.5, y, z - 0.5))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x + 0.5, y, z - 0.5), Blocks.FIRE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1.5, y, z - 0.5))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x - 1.5, y, z - 0.5), Blocks.FIRE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 0.5, y, z + 0.5))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x - 0.5, y, z + 0.5), Blocks.FIRE.defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 0.5, y, z - 1.5))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x - 0.5, y, z - 1.5), Blocks.FIRE.defaultBlockState(), 3);
		}
		if (entity.getPersistentData().getDouble("deathTimer") == -400) {
			if (!entity.level.isClientSide())
				entity.discard();
		} else {
			entity.getPersistentData().putDouble("DeathTimer", (entity.getPersistentData().getDouble("deathTimer") - 1));
		}
	}
}

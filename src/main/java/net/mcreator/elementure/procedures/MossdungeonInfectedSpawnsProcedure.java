package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MossdungeonInfectedSpawnsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		locX = -4;
		locZ = -4;
		for (int index0 = 0; index0 < (int) (81); index0++) {
			world.setBlock(new BlockPos(x + locX, -64, z + locZ), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x + locX, -64, z + locZ);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("mycenaUsed", (true));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			locX = locX + 1;
			if (locX == 4) {
				locX = -4;
				locZ = locZ + 1;
				if (locZ == 4) {
					locX = -4;
					locZ = -4;
				}
			}
		}
		locX = y;
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class JellyfloatbiomePinkPatchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double locY = 0;
		locX = -8;
		locY = -8;
		locZ = -8;
		for (int index0 = 0; index0 < (int) (4913); index0++) {
			if (locX * locX + locZ * locZ < 64) {
				if ((world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == Blocks.GRAVEL
						&& !world.getBlockState(new BlockPos(x + locX, y + locY + 1, z + locZ)).canOcclude()
						&& !((world.getBlockState(new BlockPos(x + locX, -64, z + locZ))).getBlock() == ElementureModBlocks.PERVADEDBEDROCK.get())) {
					world.setBlock(new BlockPos(x + locX, -64, z + locZ), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + locX, -64, z + locZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putBoolean("jellyfloatUsed", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.PINKSLIMETURF.get().defaultBlockState(), 3);
					if (Math.random() < 0.75) {
						PinkslimeturfSpreadDecoProcedure.execute(world, (x + locX), (y + locY), (z + locZ));
					} else {
						JellyfloatbiomeDecoProcedure.execute(world, (x + locX), (y + locY), (z + locZ));
					}
				}
			}
			locX = locX + 1;
			if (locX >= 8) {
				locX = -8;
				locZ = locZ + 1;
				if (locZ >= 8) {
					locX = -8;
					locY = locY + 1;
					locZ = -8;
					if (locY >= 8) {
						locX = -8;
						locY = -8;
						locZ = -8;
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.PINKSLIMETURF.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, -64, z), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, -64, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putBoolean("jellyfloatUsed", (true));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}

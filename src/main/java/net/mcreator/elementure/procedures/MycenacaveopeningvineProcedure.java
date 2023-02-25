package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenacaveopeningvineProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double LocY = 0;
		boolean IsFloor = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "wait") > 3) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
			for (int index0 = 0; index0 < (int) (29); index0++) {
				if (y - LocY > 0 && IsFloor == false) {
					world.setBlock(new BlockPos(x, y - LocY, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
					if (!((world.getBlockState(new BlockPos(x, (y - LocY) - 1, z))).getBlock() == Blocks.AIR) && LocY > 15) {
						IsFloor = true;
					}
					LocY = LocY + 1;
				}
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("wait", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "wait") + 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}

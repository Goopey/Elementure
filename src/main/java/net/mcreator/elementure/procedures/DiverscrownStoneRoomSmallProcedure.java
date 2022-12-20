package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DiverscrownStoneRoomSmallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double xOff = 0;
		double zOff = 0;
		double yOff = 0;
		double rndSize = 0;
		locX = -15;
		locY = -15;
		locZ = -15;
		xOff = Math.random() * 3 + 1;
		yOff = Math.random() * 3 + 1;
		zOff = Math.random() * 3 + 1;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "diverscrownRoomSize") > 0) {
			rndSize = new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "diverscrownRoomSize");
		} else {
			rndSize = 12;
			rndSize = rndSize * rndSize;
		}
		for (int index0 = 0; index0 < (int) (29791); index0++) {
			if (locX * locX * xOff + locY * locY * yOff + locZ * locZ * zOff <= rndSize) {
				if (Math.random() < 0.014 && y < 18) {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.DIVERSCROWN_OMEGAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + locX, y + locY, z + locZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("diverscrownOmeganRole", 8);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.DIVERSSTONE.get().defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 15) {
				locX = -15;
				locZ = locZ + 1;
				if (locZ > 15) {
					locX = -15;
					locY = locY + 1;
					locZ = -15;
					if (locY > 15) {
						locX = -15;
						locY = -15;
						locZ = -15;
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.DIVERSCROWN_OMEGAN.get().defaultBlockState(), 3);
		world.scheduleTick(new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)).getBlock(), 40);
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putDouble("diverscrownOmeganRole", 3);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putDouble("diverscrownRoomSize", ((Math.sqrt(rndSize) - 3) * (Math.sqrt(rndSize) - 3)));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}

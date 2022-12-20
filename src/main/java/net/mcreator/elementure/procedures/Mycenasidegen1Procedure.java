package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class Mycenasidegen1Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double heightOff = 0;
		world.setBlock(new BlockPos(x, -64, z), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, -64, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getTileData().putBoolean("mycenaUsed", (true));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		world.setBlock(new BlockPos(x, y - 3, z), Blocks.DIRT.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 2, z), Blocks.DIRT.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 1, z), Blocks.DIRT.defaultBlockState(), 3);
		if (Math.random() < 0.65) {
			world.setBlock(new BlockPos(x, y, z), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
		}
		if (Math.random() < 0.003) {
			world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y + 1, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("omeganGenRole", 8);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		while (heightOff <= 14) {
			if (heightOff > 0 && heightOff < 6) {
				if (!((world.getBlockState(new BlockPos(x, (y + heightOff) - 1, z))).getBlock() == ElementureModBlocks.BIGGLOWINGMUSHROOM.get())
						|| !((world.getBlockState(new BlockPos(x, (y + heightOff) - 1, z))).getBlock() == Blocks.MUSHROOM_STEM)
						|| !((world.getBlockState(new BlockPos(x, (y + heightOff) - 1, z))).getBlock() == ElementureModBlocks.MYCENA_BIOME_ALPHAN
								.get())
						|| !((world.getBlockState(new BlockPos(x, (y + heightOff) - 1, z))).getBlock() == ElementureModBlocks.MYCENA_BIOME_OMEGAN
								.get())) {
					if ((world.getBlockState(new BlockPos(x, (y + heightOff) - 1, z))).getBlock() == ElementureModBlocks.MYCENAVINE.get()) {
						world.setBlock(new BlockPos(x, y + heightOff, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
					} else if (Math.random() < 0.17) {
						world.setBlock(new BlockPos(x, y + heightOff, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x, y + heightOff, z), Blocks.AIR.defaultBlockState(), 3);
					}
				}
			} else if (heightOff == 6) {
				if (Math.random() < 0.003) {
					world.setBlock(new BlockPos(x, y + heightOff, z), ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y + heightOff, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putDouble("omeganGenRole", 9);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else if (!((world.getBlockState(new BlockPos(x, (y + heightOff) - 1, z))).getBlock() == ElementureModBlocks.BIGGLOWINGMUSHROOM
						.get())
						|| !((world.getBlockState(new BlockPos(x, (y + heightOff) - 1, z))).getBlock() == Blocks.MUSHROOM_STEM)
						|| !((world.getBlockState(new BlockPos(x, (y + heightOff) - 1, z))).getBlock() == ElementureModBlocks.MYCENA_BIOME_ALPHAN
								.get())
						|| !((world.getBlockState(new BlockPos(x, (y + heightOff) - 1, z))).getBlock() == ElementureModBlocks.MYCENA_BIOME_OMEGAN
								.get())) {
					if ((world.getBlockState(new BlockPos(x, (y + heightOff) - 1, z))).getBlock() == ElementureModBlocks.MYCENAVINE.get()) {
						world.setBlock(new BlockPos(x, y + heightOff, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
					} else if (Math.random() < 0.17) {
						world.setBlock(new BlockPos(x, y + heightOff, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x, y + heightOff, z), Blocks.AIR.defaultBlockState(), 3);
					}
				}
			} else if (heightOff == 7) {
				world.setBlock(new BlockPos(x, y + heightOff, z), Blocks.DIRT.defaultBlockState(), 3);
			} else if (heightOff == 8) {
				world.setBlock(new BlockPos(x, y + heightOff, z), Blocks.DIRT.defaultBlockState(), 3);
			} else if (heightOff == 9) {
				world.setBlock(new BlockPos(x, y + heightOff, z), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
			} else if (heightOff == 10) {
				if (Math.random() < 0.87) {
					world.setBlock(new BlockPos(x, y + heightOff, z), Blocks.GRASS.defaultBlockState(), 3);
				} else if (Math.random() > 0.87 && Math.random() < 0.94) {
					VanillaoaktreegenProcedure.execute(world, x, (y + heightOff), z);
				}
			}
			heightOff = heightOff + 1;
		}
	}
}

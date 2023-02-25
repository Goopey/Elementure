package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class Mycenasidegen4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double heightoff = 0;
		world.setBlock(new BlockPos(x, -64, z), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, -64, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putBoolean("mycenaUsed", (true));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		world.setBlock(new BlockPos(x, y - 3, z), Blocks.DIRT.defaultBlockState(), 3);
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x, y - 2, z), ElementureModBlocks.MYCENAMOSSYGRASS.get().defaultBlockState(), 3);
		} else {
			world.setBlock(new BlockPos(x, y - 2, z), Blocks.DIRT.defaultBlockState(), 3);
		}
		world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		for (int index0 = 0; index0 < (int) (15); index0++) {
			if (heightoff > 0 && heightoff < 8) {
				if (!((world.getBlockState(new BlockPos(x, (y + heightoff) - 1, z))).getBlock() == Blocks.MUSHROOM_STEM)
						|| !((world.getBlockState(new BlockPos(x, (y + heightoff) - 1, z))).getBlock() == ElementureModBlocks.BIGGLOWINGMUSHROOM
								.get())
						|| !((world.getBlockState(new BlockPos(x, (y + heightoff) - 1, z))).getBlock() == ElementureModBlocks.MYCENA_BIOME_ALPHAN
								.get())
						|| !((world.getBlockState(new BlockPos(x, (y + heightoff) - 1, z))).getBlock() == ElementureModBlocks.MYCENA_BIOME_OMEGAN
								.get())) {
					if ((world.getBlockState(new BlockPos(x, (y + heightoff) - 1, z))).getBlock() == ElementureModBlocks.MYCENAVINE.get()) {
						world.setBlock(new BlockPos(x, y + heightoff, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
					} else if (Math.random() < 0.043) {
						world.setBlock(new BlockPos(x, y + heightoff, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x, y + heightoff, z), Blocks.AIR.defaultBlockState(), 3);
					}
				}
			} else if (heightoff > 7 && heightoff < 9) {
				world.setBlock(new BlockPos(x, y + heightoff, z), Blocks.DIRT.defaultBlockState(), 3);
			} else if (heightoff > 8 && heightoff < 12) {
				world.setBlock(new BlockPos(x, y + heightoff, z), Blocks.DIRT.defaultBlockState(), 3);
			} else if (heightoff == 12) {
				world.setBlock(new BlockPos(x, y + heightoff, z), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
			} else if (heightoff == 13) {
				if (Math.random() < 0.84) {
					world.setBlock(new BlockPos(x, y + heightoff, z), Blocks.GRASS.defaultBlockState(), 3);
				} else if (Math.random() > 0.84 && Math.random() < 0.892) {
					VanillaoaktreegenProcedure.execute(world, x, (y + heightoff), z);
				} else if (Math.random() > 0.892 && Math.random() < 0.91) {
					VanillaoaktreegenProcedure.execute(world, x, (y + heightoff), z);
				}
			}
			heightoff = heightoff + 1;
		}
	}
}

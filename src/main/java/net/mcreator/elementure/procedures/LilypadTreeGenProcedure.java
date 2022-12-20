package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class LilypadTreeGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locY = 0;
		double CoordsY = 0;
		BlockState log = Blocks.AIR.defaultBlockState();
		CoordsY = 7 + 3 * Math.random();
		log = ElementureModBlocks.LILYPADLOG.get().defaultBlockState();
		world.setBlock(new BlockPos(x, y, z), log, 3);
		world.setBlock(new BlockPos(x, y + 1, z), log, 3);
		world.setBlock(new BlockPos(x, y + 2, z), log, 3);
		world.setBlock(new BlockPos(x, y + 3, z), log, 3);
		world.setBlock(new BlockPos(x, y + 4, z), log, 3);
		world.setBlock(new BlockPos(x, y + 5, z), log, 3);
		world.setBlock(new BlockPos(x, y + 6, z), log, 3);
		locY = 7;
		while (locY < CoordsY) {
			world.setBlock(new BlockPos(x, y + locY, z), log, 3);
			locY = locY + 1;
		}
		world.setBlock(new BlockPos(x - 2, y + locY, z - 1), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 2, y + locY, z), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 2, y + locY, z + 1), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + locY, z - 1), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + locY, z - 2), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + locY, z), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + locY, z + 1), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + locY, z + 2), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + locY, z - 1), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + locY, z - 2), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + locY, z), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + locY, z + 1), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + locY, z + 2), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + locY, z - 1), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + locY, z - 2), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + locY, z), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + locY, z + 1), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + locY, z + 2), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 2, y + locY, z - 1), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 2, y + locY, z), ElementureModBlocks.LILYPADBLOCK.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 2, y + locY, z + 1), ElementureModBlocks.LILYPADRIMBLOCK.get().defaultBlockState(), 3);
	}
}

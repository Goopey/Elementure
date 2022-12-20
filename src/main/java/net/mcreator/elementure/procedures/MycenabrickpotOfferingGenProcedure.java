package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenabrickpotOfferingGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CHEST)
				&& !((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.MYCENABRICK_POT.get())) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.MYCENAMOSSBRICKWALL.get().defaultBlockState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.CHEST)
				&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.MYCENABRICK_POT.get())) {
			world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.MYCENAMOSSBRICKWALL.get().defaultBlockState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == Blocks.CHEST)
				&& !((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == ElementureModBlocks.MYCENABRICK_POT.get())) {
			world.setBlock(new BlockPos(x, y + 2, z), ElementureModBlocks.MYCENAMOSSBRICKS.get().defaultBlockState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x, y + 3, z))).getBlock() == Blocks.CHEST)
				&& !((world.getBlockState(new BlockPos(x, y + 3, z))).getBlock() == ElementureModBlocks.MYCENABRICK_POT.get())) {
			world.setBlock(new BlockPos(x, y + 3, z), ElementureModBlocks.MYCENABRICK_POT.get().defaultBlockState(), 3);
		}
	}
}

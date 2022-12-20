package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class NetherleavesExtraGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x - 2, y + 3, z - 1), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 2, y + 2, z - 1), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			}
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x - 2, y + 3, z + 1), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 2, y + 2, z + 1), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			}
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x + 2, y + 3, z - 1), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 2, y + 2, z - 1), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			}
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x + 2, y + 3, z + 1), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 2, y + 2, z + 1), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			}
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x + 1, y + 3, z + 2), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 1, y + 2, z + 2), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			}
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x + 1, y + 3, z - 2), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x + 1, y + 2, z - 2), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			}
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x - 1, y + 3, z + 2), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 1, y + 2, z + 2), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			}
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x - 1, y + 3, z - 2), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			if (Math.random() < 0.5) {
				world.setBlock(new BlockPos(x - 1, y + 2, z - 2), ElementureModBlocks.NETHERLEAVES.get().defaultBlockState(), 3);
			}
		}
	}
}

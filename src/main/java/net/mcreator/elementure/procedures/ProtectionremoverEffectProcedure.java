package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class ProtectionremoverEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ElementureModBlocks.PROTECTIONRUNE.get()
				|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ElementureModBlocks.RECEIVINGPROTECTIONRUNE.get()) {
			world.setBlock(new BlockPos(x + 1, y, z), ElementureModBlocks.PROTECTIONREMOVER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ElementureModBlocks.PROTECTIONRUNE.get()
				|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ElementureModBlocks.RECEIVINGPROTECTIONRUNE.get()) {
			world.setBlock(new BlockPos(x - 1, y, z), ElementureModBlocks.PROTECTIONREMOVER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.PROTECTIONRUNE.get()
				|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.RECEIVINGPROTECTIONRUNE.get()) {
			world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.PROTECTIONREMOVER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.PROTECTIONRUNE.get()
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.RECEIVINGPROTECTIONRUNE.get()) {
			world.setBlock(new BlockPos(x, y - 1, z), ElementureModBlocks.PROTECTIONREMOVER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ElementureModBlocks.PROTECTIONRUNE.get()
				|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ElementureModBlocks.RECEIVINGPROTECTIONRUNE.get()) {
			world.setBlock(new BlockPos(x, y, z + 1), ElementureModBlocks.PROTECTIONREMOVER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ElementureModBlocks.PROTECTIONRUNE.get()
				|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ElementureModBlocks.RECEIVINGPROTECTIONRUNE.get()) {
			world.setBlock(new BlockPos(x, y, z - 1), ElementureModBlocks.PROTECTIONREMOVER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ElementureModBlocks.SHIELDINGPROTECTIONRUNE.get()) {
			world.setBlock(new BlockPos(x + 1, y, z), ElementureModBlocks.PROTECTIONZONEREMOVER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ElementureModBlocks.SHIELDINGPROTECTIONRUNE.get()) {
			world.setBlock(new BlockPos(x - 1, y, z), ElementureModBlocks.PROTECTIONZONEREMOVER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.SHIELDINGPROTECTIONRUNE.get()) {
			world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.PROTECTIONZONEREMOVER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.SHIELDINGPROTECTIONRUNE.get()) {
			world.setBlock(new BlockPos(x, y - 1, z), ElementureModBlocks.PROTECTIONZONEREMOVER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ElementureModBlocks.SHIELDINGPROTECTIONRUNE.get()) {
			world.setBlock(new BlockPos(x, y, z + 1), ElementureModBlocks.PROTECTIONZONEREMOVER.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ElementureModBlocks.SHIELDINGPROTECTIONRUNE.get()) {
			world.setBlock(new BlockPos(x, y, z - 1), ElementureModBlocks.PROTECTIONZONEREMOVER.get().defaultBlockState(), 3);
		}
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}

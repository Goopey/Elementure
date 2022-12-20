package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class ProtectionzoneremoverEffectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		locX = -18;
		locY = -18;
		locZ = -18;
		for (int index0 = 0; index0 < (int) (50653); index0++) {
			if ((world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == ElementureModBlocks.PROTECTIONRUNE.get()
					|| (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == ElementureModBlocks.RECEIVINGPROTECTIONRUNE
							.get()) {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.PROTECTIONREMOVER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ))).getBlock() == ElementureModBlocks.SHIELDINGPROTECTIONRUNE
					.get()
					|| (world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ)))
							.getBlock() == ElementureModBlocks.SHIELDINGPROTECTIONRUNE_SMALL.get()) {
				world.setBlock(new BlockPos(x + locX, y + locY, z + locZ), ElementureModBlocks.PROTECTIONZONEREMOVER.get().defaultBlockState(), 3);
			}
			locX = locX + 1;
			if (locX >= 18) {
				locX = -18;
				locZ = locZ + 1;
				if (locZ >= 18) {
					locX = -18;
					locY = locY + 1;
					locZ = -18;
					if (locY >= 18) {
						locX = -18;
						locY = -18;
						locZ = -18;
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}

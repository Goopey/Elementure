package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class GrounddecorationCaveMycenaGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.85) {
			if (Math.random() < 0.7) {
				world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.MYCENASHROOMBLOCK.get().defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.MYCENASPROUTS.get().defaultBlockState(), 3);
			}
		} else if (Math.random() > 0.85 && Math.random() < 0.9) {
			MycenadepthstalagmiteProcedure.execute(world, x, y, z);
		} else if (Math.random() > 0.9 && Math.random() < 0.95) {
			MycenamushroomBigProcedure.execute(world, x, y, z);
		} else {
			GroundReliefMycenaDepthsDecorationProcedure.execute(world, x, y, z);
		}
	}
}

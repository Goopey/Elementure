package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class JellyfloatbiomeDecoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.1) {
			if (Math.random() < 0.7) {
				world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.JELLYFLOATLIMB.get().defaultBlockState(), 3);
			} else if (Math.random() < 0.33) {
				world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.SEAFOAMBUBBLE.get().defaultBlockState(), 3);
			} else if (Math.random() < 0.33) {
				DryseafoamGenProcedure.execute(world, x, y, z);
			} else {
				JellyfloattreePlaceProcedure.execute(world, x, y, z);
			}
		}
	}
}

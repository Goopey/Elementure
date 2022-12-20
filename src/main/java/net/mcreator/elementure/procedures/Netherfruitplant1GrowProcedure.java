package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class Netherfruitplant1GrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.25) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.NETHERFRUITPLANT_2.get().defaultBlockState(), 3);
		}
	}
}

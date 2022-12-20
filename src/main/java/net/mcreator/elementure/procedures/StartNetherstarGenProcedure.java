package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class StartNetherstarGenProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		world.setBlock(new BlockPos(x, 94, z), ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get().defaultBlockState(), 3);
		world.scheduleTick(new BlockPos(x, 94, z), world.getBlockState(new BlockPos(x, 94, z)).getBlock(), 10);
	}
}

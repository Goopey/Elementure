package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SlimesproutValidPlacementProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRAVEL || (world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("elementure:jellybiome_slimeturfs")));
	}
}

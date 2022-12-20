package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class JellyfloatGreenPatchSmallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double locY = 0;
		locX = -3;
		locZ = -3;
		for (int index0 = 0; index0 < (int) (49); index0++) {
			locY = y;
			if (locX * locX + locZ * locZ < 9) {
				if (world.getBlockState(new BlockPos(x + locX, locY, z + locX)).canOcclude()) {
					while (world.getBlockState(new BlockPos(x + locX, locY, z + locX)).canOcclude() && locY <= 60) {
						locY = locY + 1;
					}
					if (locY <= 60 && (world.getBlockState(new BlockPos(x + locX, locY - 1, z + locX)))
							.is(BlockTags.create(new ResourceLocation("elementure:jellybiome_slimeturfs")))) {
						world.setBlock(new BlockPos(x + locX, locY - 1, z + locX), ElementureModBlocks.GREENSLIMETURF.get().defaultBlockState(), 3);
					}
				} else {
					while (!world.getBlockState(new BlockPos(x + locX, locY, z + locX)).canOcclude() && locY >= 31) {
						locY = locY - 1;
					}
					if (locY >= 31 && (world.getBlockState(new BlockPos(x + locX, locY, z + locX)))
							.is(BlockTags.create(new ResourceLocation("elementure:jellybiome_slimeturfs")))) {
						world.setBlock(new BlockPos(x + locX, locY, z + locX), ElementureModBlocks.GREENSLIMETURF.get().defaultBlockState(), 3);
					}
				}
			}
			locX = locX + 1;
			if (locX >= 3) {
				locX = -3;
				locZ = locZ + 1;
				if (locX >= 3) {
					locX = -3;
					locZ = -3;
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.GREENSLIMETURF.get().defaultBlockState(), 3);
	}
}

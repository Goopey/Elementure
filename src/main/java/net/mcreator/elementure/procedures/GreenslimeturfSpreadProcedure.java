package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class GreenslimeturfSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		if (world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude() && Math.random() < 0.2) {
			world.setBlock(new BlockPos(x, y, z), Blocks.GRAVEL.defaultBlockState(), 3);
		}
		if (Math.random() < 0.00164) {
			CoordsX = -2;
			CoordsY = -2;
			CoordsZ = -2;
			for (int index0 = 0; index0 < (int) (125); index0++) {
				if (1.21 * CoordsY * CoordsY + CoordsX * CoordsX + CoordsZ * CoordsZ < 4 && (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).is(BlockTags.create(new ResourceLocation("forge:jellypool_spreadable_blocks")))
						&& !world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ)).canOcclude() && Math.random() < 0.012) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.GREENSLIMETURF.get().defaultBlockState(), 3);
					GreenslimeturfSpreadDecoProcedure.execute(world, (x + CoordsX), (y + CoordsY), (z + CoordsZ));
				}
				CoordsX = CoordsX + 1;
				if (CoordsX == 2) {
					CoordsX = -2;
					CoordsZ = CoordsZ + 1;
					if (CoordsZ == 2) {
						CoordsX = -2;
						CoordsZ = -2;
						CoordsY = CoordsY + 1;
						if (CoordsY == 2) {
							CoordsX = -2;
							CoordsZ = -2;
							CoordsY = -2;
						}
					}
				}
			}
		}
	}
}

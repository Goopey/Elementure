package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DiverscrownPlantMossGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locY2 = 0;
		double locZ2 = 0;
		double locX2 = 0;
		double rndPlant = 0;
		BlockState plant4 = Blocks.AIR.defaultBlockState();
		rndPlant = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "plantType");
		if (rndPlant == 0) {
			plant4 = ElementureModBlocks.GREENRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 1) {
			plant4 = ElementureModBlocks.CYANRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 2) {
			plant4 = ElementureModBlocks.LIGHTBLUERIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 3) {
			plant4 = ElementureModBlocks.BLUERIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 4) {
			plant4 = ElementureModBlocks.PURPLERIMEMOSS.get().defaultBlockState();
		}
		if (rndPlant == 5) {
			plant4 = ElementureModBlocks.MAGENTARIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 6) {
			plant4 = ElementureModBlocks.PINKRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 7) {
			plant4 = ElementureModBlocks.BROWNRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 8) {
			plant4 = ElementureModBlocks.LIGHTGRAYRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 9) {
			plant4 = ElementureModBlocks.ORANGERIMEMOSS.get().defaultBlockState();
		}
		if (rndPlant == 10) {
			plant4 = ElementureModBlocks.BLACKRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 11) {
			plant4 = ElementureModBlocks.GRAYRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 12) {
			plant4 = ElementureModBlocks.LIMERIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 13) {
			plant4 = ElementureModBlocks.YELLOWRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 14) {
			plant4 = ElementureModBlocks.REDRIMEMOSS.get().defaultBlockState();
		} else if (rndPlant == 15) {
			plant4 = ElementureModBlocks.WHITERIMEMOSS.get().defaultBlockState();
		}
		locX2 = -4;
		locY2 = -4;
		locZ2 = -4;
		for (int index0 = 0; index0 < (int) (729); index0++) {
			if (locX2 * locX2 + locY2 * locY2 + locZ2 * locZ2 < 16
					&& (world.getBlockState(new BlockPos(x + locX2, y + locY2, z + locZ2))).getBlock() == ElementureModBlocks.DIVERSSTONE.get()) {
				world.setBlock(new BlockPos(x + locX2, y + locY2, z + locZ2), plant4, 3);
			}
			locX2 = locX2 + 1;
			if (locX2 > 4) {
				locX2 = -4;
				locZ2 = locZ2 + 1;
				if (locZ2 > 4) {
					locX2 = -4;
					locY2 = locY2 + 1;
					locZ2 = -4;
					if (locY2 > 4) {
						locX2 = -4;
						locY2 = -4;
						locZ2 = -4;
					}
				}
			}
		}
	}
}

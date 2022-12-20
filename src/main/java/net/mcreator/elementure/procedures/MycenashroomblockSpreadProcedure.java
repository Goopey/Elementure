package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenashroomblockSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		if (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) && Math.random() < 0.018) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, (y + 0.5), z, new ItemStack(ElementureModBlocks.MYCENASHROOMBLOCK.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
		CoordsX = -4;
		CoordsY = -4;
		CoordsZ = -4;
		for (int index0 = 0; index0 < (int) (729); index0++) {
			if (16 * CoordsY * CoordsY + CoordsX * CoordsX + CoordsZ * CoordsZ < 16
					&& (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.AIR
					&& Math.random() < 0.0000012
					&& ((world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ))).getBlock() == ElementureModBlocks.MYCENIUM
							.get()
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ)))
									.getBlock() == ElementureModBlocks.MYCENAMOSSYGRASS.get()
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ)))
									.getBlock() == ElementureModBlocks.BIGGLOWINGMUSHROOM.get()
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ)))
									.getBlock() == ElementureModBlocks.ENERGYDIORITE.get()
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ)))
									.getBlock() == ElementureModBlocks.LIGHTNINGANDESITE.get()
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ)))
									.getBlock() == ElementureModBlocks.RUINGRANITE.get()
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ))).getBlock() == Blocks.COARSE_DIRT
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ))).getBlock() == Blocks.PODZOL
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ))).getBlock() == Blocks.MYCELIUM
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ))).getBlock() == Blocks.DIRT
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ)))
									.getBlock() == Blocks.BROWN_MUSHROOM_BLOCK
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ)))
									.getBlock() == Blocks.RED_MUSHROOM_BLOCK
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ))).getBlock() == Blocks.STONE
							|| (world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ))).getBlock() == Blocks.GRASS_BLOCK)) {
				if (Math.random() < 0.94) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
							ElementureModBlocks.MYCENASHROOMBLOCK.get().defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.MYCENASPROUTS.get().defaultBlockState(),
							3);
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 4) {
				CoordsX = -4;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 4) {
					CoordsX = -4;
					CoordsZ = -4;
					CoordsY = CoordsY + 1;
					if (CoordsY == 4) {
						CoordsX = -4;
						CoordsZ = -4;
						CoordsY = -4;
					}
				}
			}
		}
		BigglowingmushroomRainEventProcedure.execute(world, x, y, z);
	}
}

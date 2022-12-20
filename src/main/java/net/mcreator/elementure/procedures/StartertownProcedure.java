package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class StartertownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		locX = -100;
		locZ = -100;
		for (int index0 = 0; index0 < (int) (40401); index0++) {
			if (Math.abs(locX) >= 100 || Math.abs(locZ) >= 100) {
				if (true) {
					StartertownPlaceAirProcedure.execute(world, (x + locX), (y + 2), (z + locZ));
					world.setBlock(new BlockPos(x + locX, y, z + locZ), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 1, z + locZ), Blocks.DIRT.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 2, z + locZ), Blocks.DIRT.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 3, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 4, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 5, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 6, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 7, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 8, z + locZ), Blocks.STONE.defaultBlockState(), 3);
				}
			} else if (Math.abs(locX) <= 1 && Math.abs(locZ) <= 1) {
				StartertownPlaceAirProcedure.execute(world, (x + locX), (y + 5), (z + locZ));
			} else if (Math.abs(locX) == 99 || Math.abs(locZ) == 99 || Math.abs(locX) == 98 || Math.abs(locZ) == 98 || Math.abs(locX) == 97
					|| Math.abs(locZ) == 97) {
				if (!(Math.abs(locX) <= 1 || Math.abs(locZ) <= 1)) {
					StartertownPlaceAirProcedure.execute(world, (x + locX), (y + 7), (z + locZ));
					world.setBlock(new BlockPos(x + locX, y + 6, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 5, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 4, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 3, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 2, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y + 1, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 1, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 2, z + locZ), Blocks.DIRT.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 3, z + locZ), Blocks.DIRT.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 4, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 5, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 6, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 7, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 8, z + locZ), Blocks.STONE.defaultBlockState(), 3);
				} else {
					world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					StartertownPlaceAirProcedure.execute(world, (x + locX), (y + 1), (z + locZ));
				}
			} else if (locX * locX + locZ * locZ < 169 && locX * locX + locZ * locZ > 36) {
				if (Math.abs(locX) <= 1 || Math.abs(locZ) <= 1) {
					StartertownPlaceAirProcedure.execute(world, (x + locX), (y + 1), (z + locZ));
					world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 1, z + locZ), ElementureModBlocks.DARKWATER.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 2, z + locZ), ElementureModBlocks.DARKWATER.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 3, z + locZ), ElementureModBlocks.DARKWATER.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 4, z + locZ), ElementureModBlocks.DARKWATER.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 5, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 6, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 7, z + locZ), Blocks.STONE.defaultBlockState(), 3);
				} else {
					StartertownPlaceAirProcedure.execute(world, (x + locX), (y + 1), (z + locZ));
					world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.DARKWATER.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 1, z + locZ), ElementureModBlocks.DARKWATER.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 2, z + locZ), ElementureModBlocks.DARKWATER.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 3, z + locZ), ElementureModBlocks.DARKWATER.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 4, z + locZ), ElementureModBlocks.DARKWATER.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 5, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 6, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 7, z + locZ), Blocks.STONE.defaultBlockState(), 3);
				}
			} else if (locX * locX + locZ * locZ < 256) {
				if ((Math.abs(locX) == 2 || Math.abs(locZ) == 2) && locX * locX + locZ * locZ <= 4) {
					StartertownPlaceAirProcedure.execute(world, (x + locX), (y + 2), (z + locZ));
					world.setBlock(new BlockPos(x + locX, y + 1, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 1, z + locZ), Blocks.DIRT.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 2, z + locZ), Blocks.DIRT.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 3, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 4, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 5, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 6, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 7, z + locZ), Blocks.STONE.defaultBlockState(), 3);
				} else {
					StartertownPlaceAirProcedure.execute(world, (x + locX), (y + 1), (z + locZ));
					world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 1, z + locZ), Blocks.DIRT.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 2, z + locZ), Blocks.DIRT.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 3, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 4, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 5, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 6, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 7, z + locZ), Blocks.STONE.defaultBlockState(), 3);
				}
			} else {
				if (Math.abs(locX) <= 1 || Math.abs(locZ) <= 1) {
					StartertownPlaceAirProcedure.execute(world, (x + locX), (y + 1), (z + locZ));
					world.setBlock(new BlockPos(x + locX, y, z + locZ), ElementureModBlocks.OLDBRICKS.get().defaultBlockState(), 3);
				} else {
					StartertownPlaceAirProcedure.execute(world, (x + locX), (y + 1), (z + locZ));
					world.setBlock(new BlockPos(x + locX, y, z + locZ), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 1, z + locZ), Blocks.DIRT.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 2, z + locZ), Blocks.DIRT.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 3, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 4, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 5, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 6, z + locZ), Blocks.STONE.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + locX, y - 7, z + locZ), Blocks.STONE.defaultBlockState(), 3);
				}
			}
			locX = locX + 1;
			if (locX > 100) {
				locX = -100;
				locZ = locZ + 1;
				if (locZ > 100) {
					locX = -100;
					locZ = -100;
				}
			}
		}
	}
}

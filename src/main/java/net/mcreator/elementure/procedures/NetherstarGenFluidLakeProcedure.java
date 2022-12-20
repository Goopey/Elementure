package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class NetherstarGenFluidLakeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		double MaxSize = 0;
		CoordsX = (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "lakeSize")) * (-1) - 2;
		CoordsY = (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "lakeSize")) * (-1) - 2;
		CoordsZ = (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "lakeSize")) * (-1) - 2;
		MaxSize = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "lakeSize");
		for (int index0 = 0; index0 < (int) (((new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "lakeSize")) * 4 + 1) * ((new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "lakeSize")) * 4 + 1) * ((new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "lakeSize")) * 4 + 1)); index0++) {
			if (CoordsX * CoordsX + 1.75 * CoordsY * CoordsY + CoordsZ * CoordsZ <= (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "lakeSize")) * (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "lakeSize"))) {
				if (CoordsY < -1) {
					if (!((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.OBSIDIAN)
							&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.NETHER_PORTAL)) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
								ElementureModBlocks.NETHERUMFLUID.get().defaultBlockState(), 3);
					}
				} else {
					if (!((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.OBSIDIAN)
							&& !((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.NETHER_PORTAL)) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == MaxSize + 2) {
				CoordsX = MaxSize * (-1) - 2;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == MaxSize + 2) {
					CoordsX = MaxSize * (-1) - 2;
					CoordsY = CoordsY + 1;
					CoordsZ = MaxSize * (-1) - 2;
					if (CoordsY == MaxSize + 2) {
						CoordsX = MaxSize * (-1) - 2;
						CoordsY = MaxSize * (-1) - 2;
						CoordsZ = MaxSize * (-1) - 2;
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class OstreeGenTrunkBottomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double repeatTimes = 0;
		double locZ = 0;
		double rad2 = 0;
		double locX = 0;
		double locYMax = 0;
		double distance = 0;
		double rad = 0;
		locX = -56;
		locZ = -56;
		repeatTimes = (locX * (-2) + 1) * (locZ * (-2) + 1);
		rad = locX * locX;
		rad2 = (locX + 14) * (locX + 14);
		for (int index0 = 0; index0 < (int) (repeatTimes); index0++) {
			distance = (locX * locX) / 1.175 + (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "ostreeLocY")) * (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "ostreeLocY")) * 4 + (locZ * locZ) / 1.175;
			if (distance < rad) {
				if (locX != 0 || locZ != 0 || 61 - (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "ostreeLocY")) != y) {
					if (distance >= rad2) {
						OstreeFullLogRandomizerProcedure.execute(world, (x + locX), (61 - (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "ostreeLocY"))), (z + locZ));
					} else {
						OstreeLogRandomizerProcedure.execute(world, (x + locX), (61 - (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "ostreeLocY"))), (z + locZ));
					}
				}
			}
			locX = locX + 1;
			if (locX > 56) {
				locX = -56;
				locZ = locZ + 1;
				if (locZ > 56) {
					locX = -56;
					locZ = -56;
				}
			}
		}
	}
}

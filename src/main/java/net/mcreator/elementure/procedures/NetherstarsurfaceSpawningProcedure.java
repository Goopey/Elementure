package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class NetherstarsurfaceSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		boolean shouldSpawn = false;
		return ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.NETHERUMCARPET.get()
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == ElementureModBlocks.NETHERUMDUST_NEBULATURFBLOCK.get())
				&& new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getBoolean(tag);
						return false;
					}
				}.getValue(world, new BlockPos(x, 0, z), "netherstarOutsideUsed");
	}
}

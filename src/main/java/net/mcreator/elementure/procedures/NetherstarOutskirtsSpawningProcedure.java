package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class NetherstarOutskirtsSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		boolean shouldSpawn = false;
		locX = -2;
		locY = -2;
		locZ = -2;
		for (int index0 = 0; index0 < (int) (125); index0++) {
			if ((world.getBlockState(new BlockPos(x + locX, y + locY, z + locZ)))
					.is(BlockTags.create(new ResourceLocation("elementure:netherstarblocks")))) {
				if (!(new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getBoolean(tag);
						return false;
					}
				}.getValue(world, new BlockPos(x + locX, 0, z + locZ), "netherstarUsed"))) {
					shouldSpawn = true;
				}
			}
			locX = locX + 1;
			if (locX >= 2) {
				locX = -2;
				locZ = locZ + 1;
				if (locZ >= 2) {
					locX = -2;
					locY = locY + 1;
					locZ = -2;
					if (locY >= 2) {
						locX = -2;
						locY = -2;
						locZ = -2;
					}
				}
			}
		}
		return shouldSpawn;
	}
}

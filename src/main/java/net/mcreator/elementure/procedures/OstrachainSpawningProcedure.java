package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.entity.OstrachainEntity;

public class OstrachainSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean hasBlock = false;
		if (!(!world.getEntitiesOfClass(OstrachainEntity.class, AABB.ofSize(new Vec3(x, y, z), 28, 28, 28), e -> true).isEmpty()) && y > 0
				&& new Object() {
					public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getTileData().getBoolean(tag);
						return false;
					}
				}.getValue(world, new BlockPos(x, -64, z), "diverscrowncenterUsed")) {
			return true;
		}
		return false;
	}
}

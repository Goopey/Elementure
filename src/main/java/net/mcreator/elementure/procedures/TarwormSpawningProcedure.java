package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.Difficulty;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.entity.TarwormEntity;

public class TarwormSpawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!(world.getDifficulty() == Difficulty.PEACEFUL) && y < 0 && new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, -64, z), "diverscrowncenterUsed") && !(!world.getEntitiesOfClass(TarwormEntity.class, AABB.ofSize(new Vec3(x, y, z), 48, 48, 48), e -> true).isEmpty())) {
			return true;
		}
		return false;
	}
}

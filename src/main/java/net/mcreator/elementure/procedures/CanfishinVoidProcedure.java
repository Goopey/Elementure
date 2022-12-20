package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class CanfishinVoidProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		double num = 0;
		boolean ret_val = false;
		ret_val = true;
		if (entity.getY() <= -59) {
			num = Math.round(entity.getY());
			while (num >= -64) {
				if (!world.isEmptyBlock(new BlockPos(entity.getX(), num, entity.getZ()))) {
					ret_val = false;
					break;
				}
				num = num - 1;
			}
		} else {
			ret_val = false;
		}
		return ret_val;
	}
}

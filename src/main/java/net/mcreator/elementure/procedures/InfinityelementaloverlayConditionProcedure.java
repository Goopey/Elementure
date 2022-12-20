package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;

public class InfinityelementaloverlayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean ret_val = false;
		if (entity.getPersistentData().getBoolean("infinityACTIVE")) {
			ret_val = true;
		}
		return ret_val;
	}
}

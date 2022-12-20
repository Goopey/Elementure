package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class OlddowsingstickReduceDurabilityProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (DowsingdetectMobsProcedure.execute(world, entity)) {
			(itemstack).setDamageValue((int) ((itemstack).getDamageValue() + 1));
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class FishingrecordUpdateProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getString("caughtFishElementure")).equals("")) {
			itemstack.getOrCreateTag().putBoolean((entity.getPersistentData().getString("caughtFishElementure")), (true));
			entity.getPersistentData().putString("caughtFishElementure", "");
		}
	}
}

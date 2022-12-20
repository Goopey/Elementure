package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.Minecraft;

public class LegendaryfishShowProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (!itemstack.getOrCreateTag().getBoolean("shown")) {
			itemstack.getOrCreateTag().putBoolean("shown", (true));
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
		}
	}
}

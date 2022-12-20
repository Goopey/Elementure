package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.init.ElementureModItems;

public class PrismaticpipAssignStrengthProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		if (itemstack.getOrCreateTag().getDouble("fishingPower") < 4) {
			itemstack.getOrCreateTag().putDouble("fishingPower", 4);
		}
		if (!itemstack.getOrCreateTag().getBoolean("shown")) {
			itemstack.getOrCreateTag().putBoolean("shown", (true));
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(ElementureModItems.PRISMATICPIP.get()));
		}
	}
}

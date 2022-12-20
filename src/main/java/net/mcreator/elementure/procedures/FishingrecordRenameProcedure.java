package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class FishingrecordRenameProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		(itemstack).setHoverName(new TextComponent(("Fishing Record : " + entity.getDisplayName().getString())));
	}
}

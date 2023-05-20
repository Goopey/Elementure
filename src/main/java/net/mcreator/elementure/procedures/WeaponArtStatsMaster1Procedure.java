package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class WeaponArtStatsMaster1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		String weaponArtAnimation = "";
		weaponArtAnimation = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("weaponArtName");
		if ((weaponArtAnimation).equals("chop")) {
			ChopStatsProcedure.execute(entity);
		}
	}
}

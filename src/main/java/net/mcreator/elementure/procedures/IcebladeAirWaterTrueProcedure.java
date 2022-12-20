package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;

public class IcebladeAirWaterTrueProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ElementureModItems.ICEBLADE.get()) {
			if (entity.getPersistentData().getBoolean("icebladevar") == true) {
				entity.getPersistentData().putBoolean("waterACTIVE", (true));
				entity.getPersistentData().putBoolean("airACTIVE", (false));
				entity.getPersistentData().putDouble("icebladetimer", (entity.getPersistentData().getDouble("icebladetimer") + 1));
				if (entity.getPersistentData().getDouble("icebladetimer") > 119) {
					entity.getPersistentData().putBoolean("icebladevar", (false));
					entity.getPersistentData().putDouble("icebladetimer", 0);
					entity.getPersistentData().putBoolean("waterACTIVE", (false));
				}
			} else {
				entity.getPersistentData().putBoolean("waterACTIVE", (false));
				entity.getPersistentData().putBoolean("airACTIVE", (true));
				entity.getPersistentData().putDouble("icebladetimer", (entity.getPersistentData().getDouble("icebladetimer") + 1));
				if (entity.getPersistentData().getDouble("icebladetimer") > 119) {
					entity.getPersistentData().putBoolean("icebladevar", (true));
					entity.getPersistentData().putDouble("icebladetimer", 0);
					entity.getPersistentData().putBoolean("airACTIVE", (false));
				}
			}
		}
	}
}

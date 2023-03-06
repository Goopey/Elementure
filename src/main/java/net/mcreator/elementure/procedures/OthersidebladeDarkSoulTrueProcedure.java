package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;

public class OthersidebladeDarkSoulTrueProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ElementureModItems.OTHERSIDEBLADE.get()) {
			if (itemstack.getOrCreateTag().getBoolean("othersidebladeVar")) {
				entity.getPersistentData().putBoolean("darkACTIVE", (true));
				entity.getPersistentData().putBoolean("soulACTIVE", (false));
				itemstack.getOrCreateTag().putDouble("othersidebladeTimer", (itemstack.getOrCreateTag().getDouble("othersidebladeTimer") + 1));
				if (itemstack.getOrCreateTag().getDouble("othersidebladeTimer") > 119) {
					itemstack.getOrCreateTag().putBoolean("othersidebladeVar", (false));
					itemstack.getOrCreateTag().putDouble("othersidebladeTimer", 0);
					entity.getPersistentData().putBoolean("darkACTIVE", (false));
				}
			} else {
				entity.getPersistentData().putBoolean("darkACTIVE", (false));
				entity.getPersistentData().putBoolean("soulACTIVE", (true));
				itemstack.getOrCreateTag().putDouble("othersidebladeTimer", (itemstack.getOrCreateTag().getDouble("othersidebladeTimer") + 1));
				if (itemstack.getOrCreateTag().getDouble("othersidebladeTimer") > 119) {
					itemstack.getOrCreateTag().putBoolean("othersidebladeVar", (true));
					itemstack.getOrCreateTag().putDouble("othersidebladeTimer", 0);
					entity.getPersistentData().putBoolean("soulACTIVE", (false));
				}
			}
		}
	}
}

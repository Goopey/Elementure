package net.mcreator.elementure.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import java.util.Random;

public class CoalpuckSetOnFireProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == Items.FLINT_AND_STEEL) {
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			entity.setSecondsOnFire(15);
		}
	}
}

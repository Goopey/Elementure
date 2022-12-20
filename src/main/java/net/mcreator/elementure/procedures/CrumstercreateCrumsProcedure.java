package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;

public class CrumstercreateCrumsProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("crum") >= 300) {
			itemstack.getOrCreateTag().putDouble("crum", 0);
			if (Math.random() < 0.05) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(ElementureModItems.CRUM.get()));
					entityToSpawn.setPickUpDelay(2);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else {
			itemstack.getOrCreateTag().putDouble("crum", (itemstack.getOrCreateTag().getDouble("crum") + 1));
		}
	}
}

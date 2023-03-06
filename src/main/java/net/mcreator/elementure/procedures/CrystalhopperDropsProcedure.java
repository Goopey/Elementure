package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;

public class CrystalhopperDropsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < (int) (2); index0++) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.PRISMATICSALTS.get()));
				entityToSpawn.setPickUpDelay(0);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.PRISMITESHARD.get()));
				entityToSpawn.setPickUpDelay(0);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (Math.random() < 0.2) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.STARRYSOUP.get()));
				entityToSpawn.setPickUpDelay(0);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (Math.random() < 0.05) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.HOPPERCHARM.get()));
				entityToSpawn.setPickUpDelay(0);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}

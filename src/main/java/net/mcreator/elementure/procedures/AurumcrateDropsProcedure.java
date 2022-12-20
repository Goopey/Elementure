package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModBlocks;

public class AurumcrateDropsProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double rd = 0;
		(itemstack).shrink(1);
		rd = Math.random() * 100;
		if (rd < 20) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModItems.CORRUPTEDSMITERING.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rd < 40) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModBlocks.AURUMBLOCK.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rd < 60) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModItems.RUBEDO.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rd < 80) {
			for (int index0 = 0; index0 < (int) (3); index0++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(ElementureModItems.MASTERKEY.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModBlocks.SILVERBLOCK.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}

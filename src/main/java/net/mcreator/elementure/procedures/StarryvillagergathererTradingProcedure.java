package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModBlocks;

public class StarryvillagergathererTradingProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == Items.GOLD_INGOT) {
			entity.getPersistentData().putDouble("goldPayed", (entity.getPersistentData().getDouble("goldPayed") + 1));
			if (entity.getPersistentData().getDouble("goldPayed") >= 3) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.EMERALD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				entity.getPersistentData().putDouble("goldPayed", 0);
			}
			(itemstack).shrink(1);
		} else if (itemstack.getItem() == ElementureModBlocks.STARRYROOTS.get().asItem()) {
			entity.getPersistentData().putDouble("starryvinesTraded", (entity.getPersistentData().getDouble("starryvinesTraded") + 1));
			if (entity.getPersistentData().getDouble("starryvinesTraded") >= 12) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.EMERALD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				entity.getPersistentData().putDouble("starryvinesTraded", 0);
			}
			(itemstack).shrink(1);
		} else if (itemstack.getItem() == ElementureModBlocks.SCRAPLEAVES.get().asItem()) {
			entity.getPersistentData().putDouble("scrapleavesTraded", (entity.getPersistentData().getDouble("scrapleavesTraded") + 1));
			if (entity.getPersistentData().getDouble("scrapleavesTraded") >= 32) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.EMERALD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				entity.getPersistentData().putDouble("scrapleavesTraded", 0);
			}
			(itemstack).shrink(1);
		} else if (itemstack.getItem() == ElementureModItems.NETHERFRUIT.get()) {
			entity.getPersistentData().putDouble("potatoTraded", (entity.getPersistentData().getDouble("potatoTraded") + 1));
			if (entity.getPersistentData().getDouble("potatoTraded") >= 15) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.EMERALD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				entity.getPersistentData().putDouble("potatoTraded", 0);
			}
			(itemstack).shrink(1);
		} else if (itemstack.getItem() == Items.EMERALD) {
			(itemstack).shrink(1);
			entity.getPersistentData().putDouble("emeraldTraded", (entity.getPersistentData().getDouble("emeraldTraded") + 1));
			if ((Math.random() + entity.getPersistentData().getDouble("emeraldTraded") / 3) / 2 - 0.26 > 0.75) {
				entity.getPersistentData().putDouble("emeraldTraded", 0);
				if (Math.random() < 0.2) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), new ItemStack(ElementureModItems.STARRYSOUP.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.2) {
					for (int index0 = 0; index0 < (int) (Math.round(Math.random() * 4) + 8); index0++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), new ItemStack(ElementureModBlocks.STARRYROOTS.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.random() < 0.2) {
					for (int index1 = 0; index1 < (int) (Math.round(Math.random() * 4) + 8); index1++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), new ItemStack(ElementureModBlocks.NETHERLOG.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.random() < 0.2) {
					for (int index2 = 0; index2 < (int) (Math.ceil(Math.random() * 2)); index2++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), new ItemStack(ElementureModBlocks.DEBRISSCRAPS.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.random() < 0.2) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), new ItemStack(ElementureModItems.CHALICEOF_FISHING_POWER.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					for (int index3 = 0; index3 < (int) (Math.ceil(Math.random() * 2)); index3++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), new ItemStack(ElementureModItems.IRONCRATE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}

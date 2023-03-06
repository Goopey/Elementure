package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModBlocks;

public class StarryvillagerblacksmithTradeProcedure {
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
		} else if (itemstack.getItem() == Items.IRON_INGOT) {
			entity.getPersistentData().putDouble("ironTraded", (entity.getPersistentData().getDouble("ironTraded") + 1));
			if (entity.getPersistentData().getDouble("ironTraded") >= 12) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.EMERALD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				entity.getPersistentData().putDouble("ironTraded", 0);
			}
			(itemstack).shrink(1);
		} else if (itemstack.getItem() == ElementureModBlocks.DEBRISSCRAPS.get().asItem()) {
			entity.getPersistentData().putDouble("scrapTraded", (entity.getPersistentData().getDouble("scrapTraded") + 1));
			if (entity.getPersistentData().getDouble("scrapTraded") >= 32) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.EMERALD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				entity.getPersistentData().putDouble("scrapTraded", 0);
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
			if ((Math.random() + entity.getPersistentData().getDouble("emeraldTraded") / 3) / 2 - 0.52 > 0.75) {
				entity.getPersistentData().putDouble("emeraldTraded", 0);
				if (Math.random() < 0.2) {
					for (int index0 = 0; index0 < (int) (Math.round(Math.random() * 4) + 8); index0++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), new ItemStack(ElementureModBlocks.DEBRISSCRAPBRICKS.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.random() < 0.2) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), new ItemStack(Blocks.ANCIENT_DEBRIS));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.2) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), new ItemStack(Items.NETHERITE_INGOT));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.2) {
					for (int index1 = 0; index1 < (int) (Math.ceil(Math.random() * 2)); index1++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), new ItemStack(ElementureModBlocks.DEBRISSCRAPS.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.random() < 0.2) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), new ItemStack(ElementureModItems.OBSIDIANBOBBER.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), new ItemStack(ElementureModItems.NETHERSTARHAMMER.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}

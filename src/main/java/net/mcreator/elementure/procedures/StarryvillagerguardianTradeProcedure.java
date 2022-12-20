package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModBlocks;

public class StarryvillagerguardianTradeProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack netheritesword = ItemStack.EMPTY;
		if (itemstack.getItem() == Items.GOLD_INGOT) {
			entity.getPersistentData().putDouble("goldPayed", (entity.getPersistentData().getDouble("goldPayed") + 1));
			if (entity.getPersistentData().getDouble("goldPayed") >= 3) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(Items.EMERALD));
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
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(Items.EMERALD));
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
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(Items.EMERALD));
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
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(Items.EMERALD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				entity.getPersistentData().putDouble("potatoTraded", 0);
			}
			(itemstack).shrink(1);
		} else if (itemstack.getItem() == Items.EMERALD) {
			(itemstack).shrink(1);
			entity.getPersistentData().putDouble("emeraldTraded", (entity.getPersistentData().getDouble("emeraldTraded") + 1));
			if ((Math.random() + entity.getPersistentData().getDouble("emeraldTraded") / 3) / 2 - 0.41 > 0.75) {
				entity.getPersistentData().putDouble("emeraldTraded", 0);
				if (Math.random() < 0.2) {
					for (int index0 = 0; index0 < (int) (Math.round(Math.random() * 2) + 4); index0++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
									new ItemStack(Items.COOKED_BEEF));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.random() < 0.2) {
					if (Math.random() < 0.5) {
						netheritesword = new ItemStack(Items.NETHERITE_SWORD);
					} else {
						netheritesword = new ItemStack(Items.NETHERITE_AXE);
					}
					if (Math.random() < 0.75) {
						(netheritesword).enchant(Enchantments.SHARPNESS, (int) (Math.round(Math.random() * 3) + 1));
					}
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()), netheritesword);
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.2) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(Items.ENDER_PEARL));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.2) {
					for (int index1 = 0; index1 < (int) (Math.round(Math.random() * 2) + 4); index1++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
									new ItemStack(Items.BLAZE_ROD));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.random() < 0.12) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(ElementureModItems.SILVERNUGGET.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(ElementureModItems.NETHERSTARGUARDIANHAMMER.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}

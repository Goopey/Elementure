package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEnchantments;

public class DiamondcrateDropsProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack droppedweapon = ItemStack.EMPTY;
		(itemstack).shrink(1);
		if (Math.random() < 0.16 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK) ? _livEnt.getEffect(MobEffects.LUCK).getAmplifier() : 0) / 10) {
			if (Math.random() < 0.14) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.OBSIDIANBOBBER.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() < 0.17) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.THEBLUEBOX.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.MOSSCHARM.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() < 0.25) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.ENCASEDWINDS.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() < 0.33) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.CONDUCTIVECHARM.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() < 0.5) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.SMALLBLESSINGOFSPEED.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.BLESSINGOFSPEED.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else {
			if (Math.random() < 0.05) {
				for (int index0 = 0; index0 < (int) (Math.round(Math.random()) + 2); index0++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.EXTRAPOTENTJELLY.get()));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() < 0.1) {
				for (int index1 = 0; index1 < (int) (Math.round(Math.random()) + 1); index1++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.DIAMOND));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() >= 0.1 && Math.random() < 0.2) {
				for (int index2 = 0; index2 < (int) (Math.random() * 24 + 28); index2++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.MAGNETICBAIT.get()));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() >= 0.2 && Math.random() < 0.3) {
				if (Math.random() < 0.25) {
					droppedweapon = new ItemStack(Items.DIAMOND_HELMET);
				} else if (Math.random() < 0.25) {
					droppedweapon = new ItemStack(Items.DIAMOND_CHESTPLATE);
				} else if (Math.random() < 0.25) {
					droppedweapon = new ItemStack(Items.DIAMOND_LEGGINGS);
				} else {
					droppedweapon = new ItemStack(Items.DIAMOND_BOOTS);
				}
				(droppedweapon).enchant(Enchantments.UNBREAKING, 2);
				if (Math.random() < 0.5) {
					(droppedweapon).enchant(Enchantments.ALL_DAMAGE_PROTECTION, (int) (Math.round(Math.random() * 4) + 1));
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), droppedweapon);
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() >= 0.3 && Math.random() < 0.55) {
				for (int index3 = 0; index3 < (int) (Math.random() * 6 + 4); index3++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.GOLDEN_APPLE));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() >= 0.55 && Math.random() < 0.65) {
				droppedweapon = new ItemStack(ElementureModItems.REINFORCEDFISHINGROD.get());
				(droppedweapon).enchant(Enchantments.UNBREAKING, 3);
				(droppedweapon).enchant(Enchantments.FISHING_LUCK, 3);
				(droppedweapon).enchant(Enchantments.FISHING_SPEED, 3);
				(droppedweapon).enchant(ElementureModEnchantments.MAGNETIC_ENCHANTMENT.get(), 1);
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), droppedweapon);
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() >= 0.65 && Math.random() < 0.75) {
				if (Math.random() < 0.5) {
					droppedweapon = new ItemStack(Items.DIAMOND_SWORD);
				} else {
					droppedweapon = new ItemStack(Items.DIAMOND_AXE);
				}
				(droppedweapon).enchant(Enchantments.UNBREAKING, 2);
				if (Math.random() < 0.5) {
					(droppedweapon).enchant(Enchantments.SHARPNESS, (int) (Math.round(Math.random() * 4) + 1));
				} else {
					(droppedweapon).enchant(Enchantments.SMITE, (int) (Math.round(Math.random() * 4) + 1));
				}
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), droppedweapon);
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if (Math.random() >= 0.75 && Math.random() < 0.8) {
				for (int index4 = 0; index4 < (int) (Math.random() * 7 + 2); index4++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.ENDER_PEARL));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.DIAMOND_BLOCK));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}

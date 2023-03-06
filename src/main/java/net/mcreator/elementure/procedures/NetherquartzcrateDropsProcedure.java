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

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

public class NetherquartzcrateDropsProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack sword = ItemStack.EMPTY;
		(itemstack).shrink(1);
		if (Math.random() < 0.1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK) ? _livEnt.getEffect(MobEffects.LUCK).getAmplifier() : 0) / 10) {
			if (Math.random() < 0.7) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.LIQUIDFLAME.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.GREEDSBAG.get()));
					entityToSpawn.setPickUpDelay(4);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else {
			if (Math.random() < 0.1) {
				for (int index0 = 0; index0 < (int) (Math.random() * 12 + 6); index0++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.WARPED_STEM));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() >= 0.1 && Math.random() < 0.2) {
				for (int index1 = 0; index1 < (int) (Math.random() * 6 + 4); index1++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.WARPED_FUNGUS));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.TWISTING_VINES));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() >= 0.2 && Math.random() < 0.35) {
				for (int index2 = 0; index2 < (int) (Math.random() * 6 + 4); index2++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.CRIMSON_FUNGUS));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.WEEPING_VINES));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() >= 0.35 && Math.random() < 0.55) {
				if (ElementureModVariables.MapVariables.get(world).isHalloween) {
					for (int index3 = 0; index3 < (int) (Math.random() * 6 + 2); index3++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.DANIOCARAMEL.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else if (Math.random() < 0.2) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.HONEY_BOTTLE));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					for (int index4 = 0; index4 < (int) (Math.random() * 6 + 4); index4++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.COOKED_PORKCHOP));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			} else if (Math.random() >= 0.55 && Math.random() < 0.65) {
				sword = new ItemStack(ElementureModItems.BROKENSWORD.get());
				(sword).enchant(Enchantments.SHARPNESS, 2);
				for (int index5 = 0; index5 < (int) (Math.random() * 2 + 1); index5++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), sword);
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() >= 0.65 && Math.random() < 0.75) {
				if (Math.random() < 0.7) {
					for (int index6 = 0; index6 < (int) (Math.random() * 2 + 2); index6++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.PIP.get()));
							entityToSpawn.setPickUpDelay(4);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.STRENGTHENEDSTRING.get()));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				for (int index7 = 0; index7 < (int) (Math.random() * 12 + 6); index7++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.CRIMSON_STEM));
						entityToSpawn.setPickUpDelay(4);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;

public class StoneboxDropsProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (Math.random() < 0.5) {
			for (int index0 = 0; index0 < (int) (Math.ceil(Math.random() * 8)); index0++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.STONE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.5) {
			for (int index1 = 0; index1 < (int) (Math.ceil(Math.random() * 8)); index1++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.GRANITE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.5) {
			for (int index2 = 0; index2 < (int) (Math.ceil(Math.random() * 8)); index2++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.ANDESITE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.5) {
			for (int index3 = 0; index3 < (int) (Math.ceil(Math.random() * 8)); index3++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.DIORITE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.5) {
			for (int index4 = 0; index4 < (int) (Math.ceil(Math.random() * 8)); index4++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.GRAVEL));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.5) {
			for (int index5 = 0; index5 < (int) (4); index5++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.MOSSY_COBBLESTONE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.5) {
			for (int index6 = 0; index6 < (int) (4); index6++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.COBBLESTONE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.5) {
			for (int index7 = 0; index7 < (int) (Math.ceil(Math.random() * 4)); index7++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.BROWN_MUSHROOM));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.5) {
			for (int index8 = 0; index8 < (int) (Math.ceil(Math.random() * 4)); index8++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Blocks.RED_MUSHROOM));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.1) {
			for (int index9 = 0; index9 < (int) (Math.ceil(Math.random() * 8)); index9++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.IRON_INGOT));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.1) {
			for (int index10 = 0; index10 < (int) (Math.ceil(Math.random() * 16)); index10++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.IRON_NUGGET));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.1) {
			for (int index11 = 0; index11 < (int) (Math.ceil(Math.random() * 6)); index11++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.GOLD_INGOT));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.1) {
			for (int index12 = 0; index12 < (int) (Math.ceil(Math.random() * 12)); index12++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.GOLD_NUGGET));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.1) {
			for (int index13 = 0; index13 < (int) (Math.ceil(Math.random() * 16)); index13++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.REDSTONE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.1) {
			for (int index14 = 0; index14 < (int) (Math.ceil(Math.random() * 12)); index14++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.LAPIS_LAZULI));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.1) {
			for (int index15 = 0; index15 < (int) (Math.ceil(Math.random() * 8)); index15++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.COAL));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.1) {
			for (int index16 = 0; index16 < (int) (Math.ceil(Math.random() * 4)); index16++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.BILBORRY.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		(itemstack).shrink(1);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;

public class ForestboxDropsProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (Math.random() < 0.5) {
			for (int index0 = 0; index0 < (int) (Math.ceil(Math.random() * 4)); index0++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(Blocks.OAK_SAPLING));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.5) {
			for (int index1 = 0; index1 < (int) (Math.ceil(Math.random() * 4)); index1++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(Blocks.BIRCH_SAPLING));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.5) {
			for (int index2 = 0; index2 < (int) (Math.ceil(Math.random() * 8)); index2++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(Blocks.OAK_LOG));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.5) {
			for (int index3 = 0; index3 < (int) (Math.ceil(Math.random() * 8)); index3++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(Blocks.BIRCH_LOG));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.2) {
			if (Math.random() < 0.5) {
				for (int index4 = 0; index4 < (int) (Math.ceil(Math.random() * 4)); index4++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Items.HONEYCOMB));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				for (int index5 = 0; index5 < (int) (Math.ceil(Math.random() * 2)); index5++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Items.HONEY_BOTTLE));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
		if (Math.random() < 0.5) {
			if (Math.random() < 0.09) {
				for (int index6 = 0; index6 < (int) (Math.ceil(Math.random() * 4)); index6++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.RED_TULIP));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() < 0.09) {
				for (int index7 = 0; index7 < (int) (Math.ceil(Math.random() * 4)); index7++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.ORANGE_TULIP));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() < 0.09) {
				for (int index8 = 0; index8 < (int) (Math.ceil(Math.random() * 4)); index8++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.WHITE_TULIP));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() < 0.09) {
				for (int index9 = 0; index9 < (int) (Math.ceil(Math.random() * 4)); index9++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.PINK_TULIP));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() < 0.09) {
				for (int index10 = 0; index10 < (int) (Math.ceil(Math.random() * 4)); index10++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.DANDELION));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() < 0.09) {
				for (int index11 = 0; index11 < (int) (Math.ceil(Math.random() * 4)); index11++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.POPPY));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() < 0.09) {
				for (int index12 = 0; index12 < (int) (Math.ceil(Math.random() * 4)); index12++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.ALLIUM));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() < 0.09) {
				for (int index13 = 0; index13 < (int) (Math.ceil(Math.random() * 4)); index13++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.OXEYE_DAISY));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() < 0.09) {
				for (int index14 = 0; index14 < (int) (Math.ceil(Math.random() * 4)); index14++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.LILAC));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if (Math.random() < 0.09) {
				for (int index15 = 0; index15 < (int) (Math.ceil(Math.random() * 4)); index15++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.ROSE_BUSH));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				for (int index16 = 0; index16 < (int) (Math.ceil(Math.random() * 4)); index16++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
								new ItemStack(Blocks.LILY_OF_THE_VALLEY));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
		if (Math.random() < 0.5) {
			for (int index17 = 0; index17 < (int) (Math.ceil(Math.random() * 4)); index17++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(ElementureModItems.STRAWBERRY.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.1) {
			for (int index18 = 0; index18 < (int) (Math.ceil(Math.random() * 4)); index18++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
							new ItemStack(ElementureModItems.BILBORRY.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		(itemstack).shrink(1);
	}
}

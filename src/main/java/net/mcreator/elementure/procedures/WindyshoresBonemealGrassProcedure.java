package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.core.BlockPos;

public class WindyshoresBonemealGrassProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		if (world instanceof Level _level) {
			BlockPos _bp = new BlockPos(x, y, z);
			if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
					|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
				if (!_level.isClientSide())
					_level.levelEvent(2005, _bp, 0);
			}
		}
		if (world instanceof Level _level) {
			BlockPos _bp = new BlockPos(x, y + 1, z);
			if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
					|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
				if (!_level.isClientSide())
					_level.levelEvent(2005, _bp, 0);
			}
		}
		if (world instanceof Level _level) {
			BlockPos _bp = new BlockPos(x, y + 2, z);
			if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
					|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
				if (!_level.isClientSide())
					_level.levelEvent(2005, _bp, 0);
			}
		}
		if (world instanceof Level _level) {
			BlockPos _bp = new BlockPos(x, y - 1, z);
			if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
					|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
				if (!_level.isClientSide())
					_level.levelEvent(2005, _bp, 0);
			}
		}
		if (world instanceof Level _level) {
			BlockPos _bp = new BlockPos(x, y - 2, z);
			if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
					|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
				if (!_level.isClientSide())
					_level.levelEvent(2005, _bp, 0);
			}
		}
		for (int index0 = 0; index0 < (int) (11); index0++) {
			if (Math.random() < 0.8) {
				locX = x + Math.random() * 16 - 8;
				locZ = z + Math.random() * 16 - 8;
				if (world instanceof Level _level) {
					BlockPos _bp = new BlockPos(x, y, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
							|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
				if (world instanceof Level _level) {
					BlockPos _bp = new BlockPos(x, y + 1, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
							|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
				if (world instanceof Level _level) {
					BlockPos _bp = new BlockPos(x, y + 2, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
							|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
				if (world instanceof Level _level) {
					BlockPos _bp = new BlockPos(x, y - 1, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
							|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
				if (world instanceof Level _level) {
					BlockPos _bp = new BlockPos(x, y - 2, z);
					if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp)
							|| BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
						if (!_level.isClientSide())
							_level.levelEvent(2005, _bp, 0);
					}
				}
			}
		}
	}
}

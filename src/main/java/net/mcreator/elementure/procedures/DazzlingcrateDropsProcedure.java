package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModBlocks;

public class DazzlingcrateDropsProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double rd = 0;
		(itemstack).shrink(1);
		rd = Math.random() * 100;
		if (rd < 20) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.AGEDROSARY.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.IMMACULATEPEARL.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.MOLTENPEARL.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.PEARLEDSLIME.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.SHIMMERINGPEARL.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.SHINYPEARL.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.TAINTEDPEARL.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.SHARPCOIN.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rd < 40) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.MASKSHARD.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.MASKSHARD.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.HOLLOWKNIGHTPALEORE.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rd < 60) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.ICEBLADE.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
		} else if (rd < 80) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.MAJORBLESSINGOFSPEED.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModBlocks.SILVERBLOCK.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}

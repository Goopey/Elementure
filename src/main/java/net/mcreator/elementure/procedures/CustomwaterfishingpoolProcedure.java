package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

public class CustomwaterfishingpoolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.5) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 4));
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.TROPICAL_FISH));
				entityToSpawn.setPickUpDelay(0);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(Items.TROPICAL_FISH));
		} else {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 4));
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(Items.COD));
				entityToSpawn.setPickUpDelay(0);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(Items.COD));
		}
	}
}

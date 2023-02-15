package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

public class DiverscrownpoolrewardProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("rimeBoid")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModItems.RIMEBOID_FOOD.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 2));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("purpleTrouish")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModItems.PURPLETROUISH.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 5));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("daggerLoach")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModItems.DAGGERLOACH.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 3));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("rareDaggerLoach")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModItems.RAREDAGGERLOACH.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 8));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("mountainBrum")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModItems.MOUNTAINBRUM.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 6));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("redSnapper")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModItems.REDSNAPPER.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 9));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("tarWormling")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModItems.TARWORMLING.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 12));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("cormunculusJelly")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()),
						new ItemStack(ElementureModItems.CORMUNCULUS_JELLY.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 12));
		}
	}
}

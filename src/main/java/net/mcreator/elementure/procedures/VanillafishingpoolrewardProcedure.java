package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

public class VanillafishingpoolrewardProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("chub")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.CHUB.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 4));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("smallBrum")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.SMALLBRUM.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 4));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("greatBrum")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.GREATBRUM.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 5));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("halibut")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.HALIBUT.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 5));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("trouish")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.TROUISH.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 8));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("blabberMouth")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.BLABBERMOUTH.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 15));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("cthulhu")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.CTHULHUFISH.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 15));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("trahira")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.TRAHIRA.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 4));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("maxTrahira")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.MAXTRAHIRA.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 130));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("melsh")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.MELSH.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 7));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("pip")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.PIP.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 5));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("eel")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.EEL.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 6));
		} else if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).chosenFish).equals("pacu")) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), new ItemStack(ElementureModItems.PACU.get()));
				entityToSpawn.setPickUpDelay(4);
				_level.addFreshEntity(entityToSpawn);
			}
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 4));
		} else {
			Vanillafishingpoolreward2Procedure.execute(world, entity);
		}
	}
}

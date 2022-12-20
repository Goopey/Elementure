package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class HastestardemonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.HASTESTAR.get().defaultBlockState(), 3);
		entity.getPersistentData().putBoolean("absorptionstaractivation", (false));
		entity.getPersistentData().putBoolean("firestaractivation", (false));
		entity.getPersistentData().putBoolean("hastestaractivation", (true));
		entity.getPersistentData().putBoolean("healthstaractivation", (false));
		entity.getPersistentData().putBoolean("jumpstaractivation", (false));
		entity.getPersistentData().putBoolean("luckystaractivation", (false));
		entity.getPersistentData().putBoolean("resistancestaractivation", (false));
		entity.getPersistentData().putBoolean("speedstaractivation", (false));
		entity.getPersistentData().putBoolean("strengthstaractivation", (false));
		entity.getPersistentData().putBoolean("saturationstaractivation", (false));
		entity.getPersistentData().putBoolean("visionstaractivation", (false));
		entity.getPersistentData().putBoolean("waterstaractivation", (false));
	}
}

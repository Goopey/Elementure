package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class WildcoldberrybushMountainHeightProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !(new ResourceLocation("windswept_hills").equals(world.getBiome(new BlockPos(x, y, z)).value().getRegistryName()) && y < 97);
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

public class InsanityIsInDimensionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean retValue = false;
		if ((entity.level.dimension()) == (ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("elementure:forgotten_1")))) {
			retValue = true;
		}
		return retValue;
	}
}

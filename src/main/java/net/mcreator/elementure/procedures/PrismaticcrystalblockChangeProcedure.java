package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class PrismaticcrystalblockChangeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.ANIMOCHROMATICPRISMATICCRYSTALBLOCK.get().defaultBlockState(), 3);
		NetherstarCrustSetFireProcedure.execute(entity);
	}
}

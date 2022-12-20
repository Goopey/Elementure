package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;
import net.mcreator.elementure.entity.SirenqueenEntity;

public class TriggeredsirenheartDeactivateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(!world.getEntitiesOfClass(SirenqueenEntity.class, AABB.ofSize(new Vec3(x, y, z), 256, 256, 256), e -> true).isEmpty())) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.SIRENHEART.get().defaultBlockState(), 3);
		}
	}
}

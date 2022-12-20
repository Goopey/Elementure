package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.entity.ScrapguardianEntity;
import net.mcreator.elementure.entity.DeadscrapguardianEntity;

public class ScrapguardianDespawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.00025) {
			if (!(!world.getEntitiesOfClass(ScrapguardianEntity.class,
					AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 24, 24, 24), e -> true).isEmpty())
					&& !(!world.getEntitiesOfClass(DeadscrapguardianEntity.class,
							AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 24, 24, 24), e -> true).isEmpty())) {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}

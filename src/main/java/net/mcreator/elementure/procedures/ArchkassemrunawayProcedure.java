package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.entity.TallkassemEntity;
import net.mcreator.elementure.entity.KassemEntity;
import net.mcreator.elementure.entity.BigkassemEntity;

public class ArchkassemrunawayProcedure {
	public static boolean execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return false;
		return !(!world.getEntitiesOfClass(KassemEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 20, 20, 20),
				e -> true).isEmpty()
				|| !world.getEntitiesOfClass(BigkassemEntity.class,
						AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 20, 20, 20), e -> true).isEmpty()
				|| !world.getEntitiesOfClass(TallkassemEntity.class,
						AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 20, 20, 20), e -> true).isEmpty());
	}
}

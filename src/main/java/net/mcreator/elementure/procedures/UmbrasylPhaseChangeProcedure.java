package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.entity.UmbrasylSegmentEntity;
import net.mcreator.elementure.entity.UmbrasylEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class UmbrasylPhaseChangeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(512 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof UmbrasylEntity) {
					((UmbrasylEntity) entityiterator).setLayer();
				} else if (entityiterator instanceof UmbrasylSegmentEntity) {
					((UmbrasylSegmentEntity) entityiterator).setLayer();
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.entity.RocketwormEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class RocketwormSetNewHeadTailProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean isChained = false;
		double alpha = 0;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double yaw = 0;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entity.getPersistentData().getDouble("chainId") == entityiterator.getPersistentData().getDouble("chainId") && entityiterator instanceof RocketwormEntity) {
					if (entity.getPersistentData().getDouble("chainPos") + 1 == entityiterator.getPersistentData().getDouble("chainPos")) {
						entity.getPersistentData().putDouble("bodyType", 2);
					} else if (entity.getPersistentData().getDouble("chainPos") - 1 == entityiterator.getPersistentData().getDouble("chainPos")) {
						entity.getPersistentData().putDouble("bodyType", 1);
					}
				}
			}
		}
	}
}

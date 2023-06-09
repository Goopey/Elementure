package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.entity.BlueAmberElevatorEntityEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class BlueAmberElevatorElevateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double TELEPORT_OFFSET_MULTIPLIER = 0;
		double TELEPORT_DISTANCE = 0;
		TELEPORT_OFFSET_MULTIPLIER = 0.0784000015258789;
		TELEPORT_DISTANCE = 0.15;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), TELEPORT_DISTANCE, (entity.getDeltaMovement().z())));
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof BlueAmberElevatorEntityEntity)) {
					entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x()), TELEPORT_DISTANCE, (entityiterator.getDeltaMovement().z())));
				}
			}
		}
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY() + 1), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof BlueAmberElevatorEntityEntity)) {
					entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x()), TELEPORT_DISTANCE, (entityiterator.getDeltaMovement().z())));
				}
			}
		}
	}
}

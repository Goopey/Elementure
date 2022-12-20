package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class StaticspriteDrainProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.0025) {
			if (!entity.level.isClientSide())
				entity.discard();
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getDeltaMovement().z()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt
							? _tamIsTamedBy.isOwnedBy(_livEnt)
							: false)) {
						entityiterator.hurt(DamageSource.GENERIC, 3);
						entity.hurt(DamageSource.GENERIC, 5);
					}
				}
			}
		}
	}
}

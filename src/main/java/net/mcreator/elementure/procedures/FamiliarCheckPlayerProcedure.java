package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class FamiliarCheckPlayerProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean isThere = false;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if ((entityiterator instanceof Player || entityiterator instanceof ServerPlayer)
						&& (entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt
								? _tamIsTamedBy.isOwnedBy(_livEnt)
								: false)) {
					entity.getPersistentData().putDouble("summontimer", 10);
					isThere = true;
				}
			}
		}
		if (!isThere) {
			if (entity.getPersistentData().getDouble("summontimer") > -3) {
				entity.getPersistentData().putDouble("summontimer", (entity.getPersistentData().getDouble("summontimer") - 1));
			} else {
				if (!entity.level.isClientSide())
					entity.discard();
			}
		}
	}
}

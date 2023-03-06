package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.entity.UmbrasylEntity;

import java.util.Comparator;

public class UmbrasylSegmentDamageBarProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Entity umbrasylHead = null;
		if (!world.getEntitiesOfClass(UmbrasylEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 128, 128, 128), e -> true).isEmpty()) {
			umbrasylHead = (Entity) world.getEntitiesOfClass(UmbrasylEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 128, 128, 128), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf((entity.getX()), (entity.getY()), (entity.getZ()))).findFirst().orElse(null);
			if (umbrasylHead instanceof LivingEntity _entity)
				_entity.setHealth((float) ((umbrasylHead instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
						- ((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) - (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) / 5));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.elementure.entity.UmbrasylEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class UmbrasylsegmentFollowProcedure {
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
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(24 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entity.getPersistentData().getDouble("chainId") == entityiterator.getPersistentData().getDouble("chainId") && entity.getPersistentData().getDouble("chainPos") - 1 == entityiterator.getPersistentData().getDouble("chainPos")) {
					isChained = true;
					pitch = Math.cos(entityiterator.getXRot() / ((-180) / Math.PI));
					pitch2 = Math.sin(entityiterator.getXRot() / ((-180) / Math.PI));
					yaw = Math.sin(entityiterator.getYRot() / ((-180) / Math.PI));
					yaw2 = Math.cos(entityiterator.getYRot() / ((-180) / Math.PI));
					if (entityiterator instanceof UmbrasylEntity) {
						{
							Entity _ent = entity;
							_ent.teleportTo((entityiterator.getX() + (-4.8) * yaw), (entityiterator.getY()), (entityiterator.getZ() + (-4.8) * yaw2));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entityiterator.getX() + (-4.8) * yaw), (entityiterator.getY()), (entityiterator.getZ() + (-4.8) * yaw2), _ent.getYRot(), _ent.getXRot());
						}
					} else {
						{
							Entity _ent = entity;
							_ent.teleportTo((entityiterator.getX() + (-3.6) * yaw), (entityiterator.getY()), (entityiterator.getZ() + (-3.6) * yaw2));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entityiterator.getX() + (-3.6) * yaw), (entityiterator.getY()), (entityiterator.getZ() + (-3.6) * yaw2), _ent.getYRot(), _ent.getXRot());
						}
					}
					alpha = 0.925;
					if (Math.abs(entity.getYRot() - entityiterator.getYRot()) >= 340) {
						if (entity.getYRot() < entityiterator.getYRot()) {
							if (entity.getYRot() - 4 < 0) {
								{
									Entity _ent = entity;
									_ent.setYRot(359);
									_ent.setXRot(0);
									_ent.setYBodyRot(_ent.getYRot());
									_ent.setYHeadRot(_ent.getYRot());
									_ent.yRotO = _ent.getYRot();
									_ent.xRotO = _ent.getXRot();
									if (_ent instanceof LivingEntity _entity) {
										_entity.yBodyRotO = _entity.getYRot();
										_entity.yHeadRotO = _entity.getYRot();
									}
								}
							} else {
								{
									Entity _ent = entity;
									_ent.setYRot((float) (entity.getYRot() - 4));
									_ent.setXRot(0);
									_ent.setYBodyRot(_ent.getYRot());
									_ent.setYHeadRot(_ent.getYRot());
									_ent.yRotO = _ent.getYRot();
									_ent.xRotO = _ent.getXRot();
									if (_ent instanceof LivingEntity _entity) {
										_entity.yBodyRotO = _entity.getYRot();
										_entity.yHeadRotO = _entity.getYRot();
									}
								}
							}
						} else {
							if (entity.getYRot() + 4 >= 359) {
								{
									Entity _ent = entity;
									_ent.setYRot(1);
									_ent.setXRot(0);
									_ent.setYBodyRot(_ent.getYRot());
									_ent.setYHeadRot(_ent.getYRot());
									_ent.yRotO = _ent.getYRot();
									_ent.xRotO = _ent.getXRot();
									if (_ent instanceof LivingEntity _entity) {
										_entity.yBodyRotO = _entity.getYRot();
										_entity.yHeadRotO = _entity.getYRot();
									}
								}
							} else {
								{
									Entity _ent = entity;
									_ent.setYRot((float) (entity.getYRot() + 4));
									_ent.setXRot(0);
									_ent.setYBodyRot(_ent.getYRot());
									_ent.setYHeadRot(_ent.getYRot());
									_ent.yRotO = _ent.getYRot();
									_ent.xRotO = _ent.getXRot();
									if (_ent instanceof LivingEntity _entity) {
										_entity.yBodyRotO = _entity.getYRot();
										_entity.yHeadRotO = _entity.getYRot();
									}
								}
							}
						}
					} else {
						{
							Entity _ent = entity;
							_ent.setYRot((float) (entity.getYRot() * alpha + (1 - alpha) * entityiterator.getYRot()));
							_ent.setXRot(0);
							_ent.setYBodyRot(_ent.getYRot());
							_ent.setYHeadRot(_ent.getYRot());
							_ent.yRotO = _ent.getYRot();
							_ent.xRotO = _ent.getXRot();
							if (_ent instanceof LivingEntity _entity) {
								_entity.yBodyRotO = _entity.getYRot();
								_entity.yHeadRotO = _entity.getYRot();
							}
						}
					}
					break;
				}
			}
		}
		if (!isChained) {
			if (entity.getPersistentData().getDouble("wormAiDespawnWait") > 5) {
				if (!entity.level.isClientSide())
					entity.discard();
			} else {
				entity.getPersistentData().putDouble("wormAiDespawnWait", (entity.getPersistentData().getDouble("wormAiDespawnWait") + 1));
			}
		} else {
			entity.getPersistentData().putDouble("wormAiDespawnWait", 0);
		}
	}
}

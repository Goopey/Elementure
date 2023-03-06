package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.RocketwormEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class RocketwormSpawning2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double num = 0;
		double lengthChain = 0;
		double yaw2 = 0;
		double yaw = 0;
		double bod = 0;
		if (!entity.getPersistentData().getBoolean("cannotSpawn")) {
			lengthChain = 4 + Math.round(Math.random() * 6);
			entity.getPersistentData().putDouble("chainId", (Math.random() * 12500 + entity.getX() * 10000 + entity.getY() * 100 + entity.getZ()));
			entity.getPersistentData().putDouble("chainPos", 1);
			yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
			yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
			while (num < lengthChain) {
				num = num + 1;
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new RocketwormEntity(ElementureModEntities.ROCKETWORM.get(), _level);
					entityToSpawn.moveTo((entity.getX() - num * 0.9 * yaw), (entity.getY()), (entity.getZ() - num * 0.9 * yaw2), 0, 0);
					entityToSpawn.setYBodyRot(0);
					entityToSpawn.setYHeadRot(0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				{
					final Vec3 _center = new Vec3((entity.getX() - num * 0.9 * yaw), (entity.getY()), (entity.getZ() - num * 0.9 * yaw2));
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof RocketwormEntity) {
							entityiterator.getPersistentData().putDouble("chainId", (entity.getPersistentData().getDouble("chainId")));
							entityiterator.getPersistentData().putDouble("chainPos", (1 + num));
							entityiterator.getPersistentData().putDouble("chainDistanceCheck", (4 + Math.ceil(2.2 * num)));
							{
								Entity _ent = entityiterator;
								_ent.setYRot(entity.getYRot());
								_ent.setXRot(entity.getXRot());
								_ent.setYBodyRot(_ent.getYRot());
								_ent.setYHeadRot(_ent.getYRot());
								_ent.yRotO = _ent.getYRot();
								_ent.xRotO = _ent.getXRot();
								if (_ent instanceof LivingEntity _entity) {
									_entity.yBodyRotO = _entity.getYRot();
									_entity.yHeadRotO = _entity.getYRot();
								}
							}
							entityiterator.getPersistentData().putBoolean("cannotSpawn", (true));
							if (num >= lengthChain) {
								entityiterator.getPersistentData().putBoolean("isEnd", (true));
								entityiterator.getPersistentData().putDouble("bodyType", 2);
							} else {
								entityiterator.getPersistentData().putDouble("bodyType", 1);
							}
							break;
						}
					}
				}
			}
		}
	}
}

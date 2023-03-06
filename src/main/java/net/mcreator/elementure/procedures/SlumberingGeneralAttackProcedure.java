package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.SlumberinGeneralOrbEntity;
import net.mcreator.elementure.entity.NightmareSpikeEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class SlumberingGeneralAttackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double locZ = 0;
		double locX = 0;
		double locY = 0;
		if (world.dayTime() % 12 == 0) {
			if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
				if (entity.getPersistentData().getDouble("attackCooldown") <= -5) {
					if (!(!world.getEntitiesOfClass(SlumberinGeneralOrbEntity.class, AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 14, 14, 14), e -> true).isEmpty()) && Math.random() < 0.45) {
						for (int index0 = 0; index0 < (int) (3 + Math.round(Math.random())); index0++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new SlumberinGeneralOrbEntity(ElementureModEntities.SLUMBERIN_GENERAL_ORB.get(), _level);
								entityToSpawn.moveTo((entity.getX() + Math.random() * 6 - 3), (entity.getY() + 0.2), (entity.getZ() + Math.random() * 6 - 3), world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
						entity.getPersistentData().putDouble("attackCooldown", 0);
					} else {
						{
							final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(18 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
									.collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (entityiterator instanceof Player) {
									locX = entityiterator.getX();
									locY = entityiterator.getY();
									locZ = entityiterator.getZ();
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new NightmareSpikeEntity(ElementureModEntities.NIGHTMARE_SPIKE.get(), _level);
										entityToSpawn.moveTo(locX, locY, locZ, world.getRandom().nextFloat() * 360F, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										world.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
						for (int index1 = 0; index1 < (int) (48); index1++) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new NightmareSpikeEntity(ElementureModEntities.NIGHTMARE_SPIKE.get(), _level);
								entityToSpawn.moveTo((entity.getX() + Math.random() * 12 - 6), locY, (entity.getZ() + Math.random() * 12 - 6), world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
						entity.getPersistentData().putDouble("attackCooldown", 5);
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120, 3, (false), (false)));
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 180, 0, (false), (false)));
					}
				}
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 1));
			} else if (entity.getPersistentData().getDouble("attackCooldown") < 0) {
				entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") + 1));
			}
		}
	}
}

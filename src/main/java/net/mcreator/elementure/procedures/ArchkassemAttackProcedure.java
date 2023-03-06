package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.TallkassemEntity;
import net.mcreator.elementure.entity.KassemEntity;
import net.mcreator.elementure.entity.BigkassemEntity;
import net.mcreator.elementure.entity.ArchkassemStaffEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class ArchkassemAttackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double kassemNum = 0;
		double bigkassemNum = 0;
		double tallkassemNum = 0;
		if (world.dayTime() % 1000 <= 0) {
			{
				final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(22 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof KassemEntity) {
						kassemNum = kassemNum + 1;
					} else if (entityiterator instanceof BigkassemEntity) {
						bigkassemNum = bigkassemNum + 1;
					} else if (entityiterator instanceof TallkassemEntity) {
						tallkassemNum = tallkassemNum + 1;
					}
				}
			}
			if (kassemNum < 2 && entity.getPersistentData().getDouble("kassems") < 4) {
				kassemNum = 2 - kassemNum;
				entity.getPersistentData().putDouble("kassems", (entity.getPersistentData().getDouble("kassems") + kassemNum));
				for (int index0 = 0; index0 < (int) (kassemNum); index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new KassemEntity(ElementureModEntities.KASSEM.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
			if (bigkassemNum < 2 && entity.getPersistentData().getDouble("bkassems") < 3) {
				bigkassemNum = 2 - bigkassemNum;
				entity.getPersistentData().putDouble("bkassems", (entity.getPersistentData().getDouble("bkassems") + bigkassemNum));
				for (int index1 = 0; index1 < (int) (bigkassemNum); index1++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BigkassemEntity(ElementureModEntities.BIGKASSEM.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
			if (tallkassemNum < 1 && entity.getPersistentData().getDouble("tkassems") < 2) {
				tallkassemNum = 1 - tallkassemNum;
				entity.getPersistentData().putDouble("tkassems", (entity.getPersistentData().getDouble("tkassems") + tallkassemNum));
				for (int index2 = 0; index2 < (int) (tallkassemNum); index2++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TallkassemEntity(ElementureModEntities.TALLKASSEM.get(), _level);
						entityToSpawn.moveTo((entity.getX()), (entity.getY()), (entity.getZ()), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if (entity.getPersistentData().getDouble("attackTimer") >= 400) {
				entity.getPersistentData().putDouble("attackTimer", 0);
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new ArchkassemStaffEntity(ElementureModEntities.ARCHKASSEM_STAFF.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setSecondsOnFire(100);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 3, 0);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, (float) 0.6, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			} else {
				entity.getPersistentData().putDouble("attackTimer", (entity.getPersistentData().getDouble("attackTimer") + Math.random()));
			}
		}
	}
}

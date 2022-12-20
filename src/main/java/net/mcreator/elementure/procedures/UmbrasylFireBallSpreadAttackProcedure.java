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
import net.mcreator.elementure.entity.TarspiritEntity;
import net.mcreator.elementure.entity.TargodBlasterEntity;

public class UmbrasylFireBallSpreadAttackProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("attackCooldown") >= 500) {
			if (entity.getPersistentData().getDouble("attackCooldown") % 4 == 0) {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
							AbstractArrow entityToSpawn = new TargodBlasterEntity(ElementureModEntities.TARGOD_BLASTER.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setPierceLevel(piercing);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 5, 1, (byte) 5);
					_entityToSpawn.setPos((entity.getX()), (entity.getY() + 2), (entity.getZ()));
					_entityToSpawn.shoot(((Math.random() * 2 - 1) * 4), ((Math.random() * 2 - 1) * 4), ((Math.random() * 2 - 1) * 4), 1, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (Math.random() < 0.1 && entity.getPersistentData().getBoolean("umbrasylPhase2")) {
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new TargodBlasterEntity(ElementureModEntities.TARGOD_BLASTER.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 5, 1, (byte) 5);
						_entityToSpawn.setPos((entity.getX()), (entity.getY() + 2), (entity.getZ()));
						_entityToSpawn.shoot(((Math.random() * 2 - 1) * 4), ((Math.random() * 2 - 1) * 4), ((Math.random() * 2 - 1) * 4), 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			}
			if (entity.getPersistentData().getBoolean("umbrasylPhase2")) {
				if (entity.getPersistentData().getDouble("attackCooldown") % 75 > 0 && !(!world.getEntitiesOfClass(TarspiritEntity.class,
						AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 64, 64, 64), e -> true).isEmpty())) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TarspiritEntity(ElementureModEntities.TARSPIRIT.get(), _level);
						entityToSpawn.moveTo((entity.getX() - 1), (entity.getY() + 10), (entity.getZ()), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TarspiritEntity(ElementureModEntities.TARSPIRIT.get(), _level);
						entityToSpawn.moveTo((entity.getX() + 1), (entity.getY() + 10), (entity.getZ()), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TarspiritEntity(ElementureModEntities.TARSPIRIT.get(), _level);
						entityToSpawn.moveTo((entity.getX() - 1), (entity.getY() - 10), (entity.getZ()), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TarspiritEntity(ElementureModEntities.TARSPIRIT.get(), _level);
						entityToSpawn.moveTo((entity.getX() + 1), (entity.getY() - 10), (entity.getZ()), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		} else {
			entity.getPersistentData().putDouble("attackCooldown", (entity.getPersistentData().getDouble("attackCooldown") - 2));
		}
	}
}

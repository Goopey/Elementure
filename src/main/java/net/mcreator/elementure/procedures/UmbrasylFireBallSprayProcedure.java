package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.TargodBlasterEntity;

public class UmbrasylFireBallSprayProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("attackCooldown") % 12 == 0) {
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
}

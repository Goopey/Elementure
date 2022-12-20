package net.mcreator.elementure.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.KassemstaffEntity;

public class TallkassemAttackProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
			if (entity.getPersistentData().getDouble("attackTimer") >= 400) {
				entity.getPersistentData().putDouble("attackTimer", 0);
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback) {
								AbstractArrow entityToSpawn = new KassemstaffEntity(ElementureModEntities.KASSEMSTAFF.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
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

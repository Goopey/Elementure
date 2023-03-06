package net.mcreator.elementure.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.TidalcometEntity;

public class TidalcometSwingProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("hasCometLight")) {
			itemstack.getOrCreateTag().putBoolean("hasCometLight", (false));
			itemstack.getOrCreateTag().putDouble("cometSwings", 0);
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getItem() == ElementureModItems.COMETCROWN.get()
					|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getItem() == ElementureModItems.COMETCROWN.get()) {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new TidalcometEntity(ElementureModEntities.TIDALCOMET.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, (float) 11.5, 1, (byte) 1);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			} else {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level;
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
								AbstractArrow entityToSpawn = new TidalcometEntity(ElementureModEntities.TIDALCOMET.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, entity, 7, 1);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
			}
		} else {
			itemstack.getOrCreateTag().putDouble("cometSwings", (itemstack.getOrCreateTag().getDouble("cometSwings") + 1));
			if (itemstack.getOrCreateTag().getDouble("cometSwings") >= 3) {
				itemstack.getOrCreateTag().putBoolean("hasCometLight", (true));
			}
		}
	}
}

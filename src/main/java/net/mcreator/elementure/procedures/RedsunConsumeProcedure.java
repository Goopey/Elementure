package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.network.ElementureModVariables;

public class RedsunConsumeProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double pitch = 0;
		double yaw2 = 0;
		double pitch2 = 0;
		double yaw = 0;
		if (itemstack.getOrCreateTag().getBoolean("redSunActive") && (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence > 0 && Math.random() < 0.025) {
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence - 4;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fire_essence = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence <= 0) {
			itemstack.getOrCreateTag().putBoolean("redSunActive", (false));
			itemstack.getOrCreateTag().putDouble("redSunOverload", 0);
		}
		if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence >= 120) {
			itemstack.getOrCreateTag().putBoolean("redSunActive", (false));
		}
		if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence >= 60
				&& (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence < 120) {
			itemstack.getOrCreateTag().putBoolean("redSunActive", (true));
		}
		if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence >= 120) {
			itemstack.getOrCreateTag().putDouble("redSunOverload", 4);
		}
		if (itemstack.getOrCreateTag().getBoolean("redSunActive") || itemstack.getOrCreateTag().getDouble("redSunOverload") > 0) {
			pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
			pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
			yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
			yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
			for (int index0 = 0; index0 < (int) (16); index0++) {
				world.addParticle(ParticleTypes.FLAME, (entity.getX() + (-0.2) * yaw * pitch), (entity.getY() + 1.633 + 0.2 * pitch2), (entity.getZ() + (-0.2) * yaw2 * pitch), (((yaw * pitch) / (-4) + (Math.random() - 0.5) / 2) / 16),
						((pitch2 / (-4) + (Math.random() - 0.5) / 2) / 16), (((yaw2 * pitch) / (-4) + (Math.random() - 0.5) / 2) / 16));
			}
		}
	}
}

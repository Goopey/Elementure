package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.elementure.network.ElementureModVariables;

public class AurumaxeGatherProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.35) {
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).dark_essence + 5;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.dark_essence = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEFINED : false) {
			if (entity.canChangeDimensions()) {
				entity.hurt(DamageSource.GENERIC, 12);
			} else {
				entity.hurt(DamageSource.GENERIC, 8);
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.network.ElementureModVariables;

public class SkyjadedaggerHarvestProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (Math.random() < 0.4) {
			{
				double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).air_essence + 4;
				sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.air_essence = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if (Math.random() < 0.4 && (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.GLOWING) : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 18, 0));
		}
	}
}

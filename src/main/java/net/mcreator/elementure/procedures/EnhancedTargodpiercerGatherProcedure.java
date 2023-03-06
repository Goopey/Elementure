package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModMobEffects;

public class EnhancedTargodpiercerGatherProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		{
			double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).dark_essence + 9;
			sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.dark_essence = _setval;
				capability.syncPlayerVariables(sourceentity);
			});
		}
		if (Math.random() < 0.9) {
			{
				double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).dark_essence + 6;
				sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.dark_essence = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.FRAGILITY.get()) ? _livEnt.getEffect(ElementureModMobEffects.FRAGILITY.get()).getAmplifier() : 0) < 9) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.FRAGILITY.get(), 40,
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.FRAGILITY.get()) ? _livEnt.getEffect(ElementureModMobEffects.FRAGILITY.get()).getAmplifier() : 0) + 1)));
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(ElementureModMobEffects.FRAGILITY.get());
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.FRAGILITY.get(), 40, 1));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.DARKFLAME.get(), 400, 1));
		}
	}
}

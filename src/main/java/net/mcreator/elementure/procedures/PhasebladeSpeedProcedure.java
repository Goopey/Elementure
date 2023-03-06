package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.network.ElementureModVariables;

public class PhasebladeSpeedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("phasing") && (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).dark_essence > 0
				&& !(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.MOVEMENT_SPEED) : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 100, 0));
			{
				double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).dark_essence - 1;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.dark_essence = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

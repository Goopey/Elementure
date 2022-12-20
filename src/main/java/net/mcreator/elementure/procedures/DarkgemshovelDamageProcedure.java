package net.mcreator.elementure.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.elementure.network.ElementureModVariables;

public class DarkgemshovelDamageProcedure {
	public static void execute(Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		double hasStrength = 0;
		double hasSharpness = 0;
		double hasWeakness = 0;
		{
			double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new ElementureModVariables.PlayerVariables())).dark_essence - 7;
			sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.dark_essence = _setval;
				capability.syncPlayerVariables(sourceentity);
			});
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) != 0) {
			hasSharpness = 1;
		} else {
			hasSharpness = 0;
		}
		if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false) {
			hasStrength = 1;
		} else {
			hasStrength = 0;
		}
		if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.WEAKNESS) : false) {
			hasWeakness = 1;
		} else {
			hasWeakness = 0;
		}
		entity.hurt(DamageSource.GENERIC,
				(float) (((6
						+ Math.ceil((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).dark_essence / 3)
						+ 3 * ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST)
								? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier()
								: 0) + hasStrength))
						- 4 * ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WEAKNESS)
								? _livEnt.getEffect(MobEffects.WEAKNESS).getAmplifier()
								: 0) + hasWeakness)
						+ 2 * (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) + hasSharpness))
						/ (0.05 * (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0))));
	}
}

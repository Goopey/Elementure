package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModMobEffects;

public class MycenankatanaAttackProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if (Math.random() < 0.4) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.MYCENANSPORES.get(),
						(int) (80 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK)
								? _livEnt.getEffect(MobEffects.LUCK).getAmplifier()
								: 0) * 20),
						(int) Math.ceil(0.5 + EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) / 2
								+ EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS, itemstack) / 2
								+ EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE, itemstack) / 2
								+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK)
										? _livEnt.getEffect(MobEffects.LUCK).getAmplifier()
										: 0))));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z + 0.5),
						(int) (Math.ceil(0.5 + EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) / 2
								+ EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS, itemstack) / 2
								+ EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE, itemstack) / 2
								+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK)
										? _livEnt.getEffect(MobEffects.LUCK).getAmplifier()
										: 0))
								* 20),
						0.7, 0.7, 0.7, 0);
			for (int index0 = 0; index0 < (int) (Math.ceil(0.5 + EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) / 2
					+ EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS, itemstack) / 2
					+ EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE, itemstack) / 2
					+ (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.LUCK)
							? _livEnt.getEffect(MobEffects.LUCK).getAmplifier()
							: 0))); index0++) {
				MycenashroomcloudProcedure.execute(world, (x + 0.5), (y + 0.5), (z + 0.5));
			}
		}
		if (Math.random() < 0.5) {
			{
				double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).earth_essence + 4;
				sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.earth_essence = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.elementure.network.ElementureModVariables;

public class DiversalloyaxeGatherProcedure {
	public static void execute(Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		BlockState plant3 = Blocks.AIR.defaultBlockState();
		BlockState plant4 = Blocks.AIR.defaultBlockState();
		BlockState plant1 = Blocks.AIR.defaultBlockState();
		BlockState plant2 = Blocks.AIR.defaultBlockState();
		double speedVal = 0;
		double rndPlant = 0;
		double hasStrength = 0;
		double hasSharpness = 0;
		double hasWeakness = 0;
		if (Math.random() < 0.6) {
			{
				double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).air_essence + 4;
				sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.air_essence = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.WATER : false) || entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:water_mobs")))) {
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
					(float) (((11 + 3 * ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) + hasStrength))
							- 4 * ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WEAKNESS) ? _livEnt.getEffect(MobEffects.WEAKNESS).getAmplifier() : 0) + hasWeakness)
							+ 2 * (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) + hasSharpness)) / (0.05 * (entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0))));
		}
	}
}

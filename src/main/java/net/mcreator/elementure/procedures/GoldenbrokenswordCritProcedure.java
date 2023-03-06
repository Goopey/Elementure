package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModMobEffects;

public class GoldenbrokenswordCritProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		double hasLuck = 0;
		double hasStrength = 0;
		double hasSharpness = 0;
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
		if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.LUCK) : false) {
			hasLuck = 1;
		} else {
			hasLuck = 0;
		}
		if (Math.random() < 0.05
				+ ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.CURSEDSIGHT_POTION_ITEM.get()) ? _livEnt.getEffect(ElementureModMobEffects.CURSEDSIGHT_POTION_ITEM.get()).getAmplifier() : 0) + hasLuck)
						* 0.05) {
			entity.hurt(DamageSource.GENERIC, (float) (10 + 3 * ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) ? _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier() : 0) + hasStrength)
					+ 2 * (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) + hasSharpness)));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(sourceentity.getX(), sourceentity.getY(), sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound((sourceentity.getX()), (sourceentity.getY()), (sourceentity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.crit")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CRIT, (entity.getX()), (entity.getY()), (entity.getZ()), 25, 0.5, 0.5, 0.5, 0);
		}
	}
}

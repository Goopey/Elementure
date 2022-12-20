package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.elementure.init.ElementureModEnchantments;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StrikeEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMobType() == MobType.UNDEFINED : false)
				&& EnchantmentHelper.getItemEnchantmentLevel(ElementureModEnchantments.STRIKE.get(),
						(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
			if (entity.canChangeDimensions()) {
				entity.hurt(DamageSource.GENERIC,
						(float) Math.ceil(2.5 * (EnchantmentHelper.getItemEnchantmentLevel(ElementureModEnchantments.STRIKE.get(),
								(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1)));
			} else {
				entity.hurt(DamageSource.GENERIC,
						(float) Math.ceil(1.5 * (EnchantmentHelper.getItemEnchantmentLevel(ElementureModEnchantments.STRIKE.get(),
								(sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1)));
			}
		}
	}
}

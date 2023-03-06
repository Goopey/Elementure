package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.init.ElementureModItems;

public class VamiteQuickenProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ElementureModItems.VAMITEINGOT.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 30, 0));
			itemstack.getOrCreateTag().putDouble("timeheld", (itemstack.getOrCreateTag().getDouble("timeheld") + 1));
		}
	}
}

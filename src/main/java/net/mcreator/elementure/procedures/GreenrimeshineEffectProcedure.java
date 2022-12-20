package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GreenrimeshineEffectProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getItem());
		}
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == ElementureModItems.RAREGREENRIMESHINE.get() || itemstack.getItem() == ElementureModItems.GREENRIMESHINE.get()) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION,
						(int) (itemstack.getOrCreateTag().getDouble("duration") / itemstack.getOrCreateTag().getDouble("potency")),
						(int) itemstack.getOrCreateTag().getDouble("potency")));
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((1 + itemstack.getOrCreateTag().getDouble("potency")) * 2
						+ (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)));
		}
	}
}

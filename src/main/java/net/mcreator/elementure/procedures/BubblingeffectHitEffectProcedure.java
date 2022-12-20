package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.init.ElementureModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BubblingeffectHitEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
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
		if (sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(ElementureModMobEffects.BUBBLING_EFFECT.get()) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.BUBBLED_EFFECT.get(),
						(int) (200 + (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.BUBBLING_EFFECT.get())
								? _livEnt.getEffect(ElementureModMobEffects.BUBBLING_EFFECT.get()).getAmplifier()
								: 0) * 100),
						(int) ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.BUBBLING_EFFECT.get())
								? _livEnt.getEffect(ElementureModMobEffects.BUBBLING_EFFECT.get()).getAmplifier()
								: 0) / 2)));
		}
	}
}

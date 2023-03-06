package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FragilityeffectHitEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(ElementureModMobEffects.FRAGILITY.get()) : false) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
					- (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.FRAGILITY.get()) ? _livEnt.getEffect(ElementureModMobEffects.FRAGILITY.get()).getAmplifier() : 0)) > 0) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)
							- (1 + (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.FRAGILITY.get()) ? _livEnt.getEffect(ElementureModMobEffects.FRAGILITY.get()).getAmplifier() : 0))));
			}
		}
	}
}

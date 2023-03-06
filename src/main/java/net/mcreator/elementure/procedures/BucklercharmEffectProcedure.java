package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModMobEffects;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BucklercharmEffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getItem() == ElementureModItems.BUCKLERCHARM.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getItem() == ElementureModItems.BUCKLERCHARM.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getItem() == ElementureModItems.BUCKLERCHARM.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getItem() == ElementureModItems.BUCKLERCHARM.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getItem() == ElementureModItems.BUCKLERCHARM.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getItem() == ElementureModItems.BUCKLERCHARM.get())
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(ElementureModMobEffects.PARRY.get()) : false)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(ElementureModMobEffects.PARRY.get());
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.PARRY_FATIGUE.get(), 360, 0));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 4, 20));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CRIT, (entity.getX()), (entity.getY()), (entity.getZ()), 25, 0.35, 0.35, 0.35, 0);
		}
	}
}

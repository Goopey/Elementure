package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModMobEffects;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CormunculusCleansingtorchEffectProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack relic_item = ItemStack.EMPTY;
		double wither_level = 0;
		double wither_time = 0;
		double darkflame_level = 0;
		double darkflame_time = 0;
		relic_item = new ItemStack(ElementureModItems.CORMUNCULUS_CLEANSINGTORCH.get());
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getItem() == relic_item.getItem()) {
			if (world.dayTime() % 40 <= 0) {
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WITHER) ? _livEnt.getEffect(MobEffects.WITHER).getDuration() : 0) != 0) {
					wither_time = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WITHER) ? _livEnt.getEffect(MobEffects.WITHER).getDuration() : 0;
					wither_level = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WITHER) ? _livEnt.getEffect(MobEffects.WITHER).getAmplifier() : 0;
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(MobEffects.WITHER);
					if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.WITHER) ? _livEnt.getEffect(MobEffects.WITHER).getAmplifier() : 0) == 0) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, (int) (wither_time - 40), 0));
					} else {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, (int) (wither_time - 10), (int) (wither_time - 1)));
					}
				}
				if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.DARKFLAME.get()) ? _livEnt.getEffect(ElementureModMobEffects.DARKFLAME.get()).getDuration() : 0) != 0) {
					darkflame_time = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.DARKFLAME.get()) ? _livEnt.getEffect(ElementureModMobEffects.DARKFLAME.get()).getDuration() : 0;
					darkflame_level = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.DARKFLAME.get()) ? _livEnt.getEffect(ElementureModMobEffects.DARKFLAME.get()).getAmplifier() : 0;
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(ElementureModMobEffects.DARKFLAME.get());
					if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(ElementureModMobEffects.DARKFLAME.get()) ? _livEnt.getEffect(ElementureModMobEffects.DARKFLAME.get()).getAmplifier() : 0) == 0) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.DARKFLAME.get(), (int) (darkflame_time - 40), 0));
					} else {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(ElementureModMobEffects.DARKFLAME.get(), (int) (darkflame_time - 10), (int) (darkflame_level - 1)));
					}
				}
			}
		}
	}
}

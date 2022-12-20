package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SmallcharmagainstpoisonEffectProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double poison_time = 0;
		double poison_level = 0;
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1)
				.getItem() == ElementureModItems.SMALLCHARMAGAINSTPOISON.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2)
						.getItem() == ElementureModItems.SMALLCHARMAGAINSTPOISON.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3)
						.getItem() == ElementureModItems.SMALLCHARMAGAINSTPOISON.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4)
						.getItem() == ElementureModItems.SMALLCHARMAGAINSTPOISON.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5)
						.getItem() == ElementureModItems.SMALLCHARMAGAINSTPOISON.get()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6)
						.getItem() == ElementureModItems.SMALLCHARMAGAINSTPOISON.get()) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
					? _livEnt.getEffect(MobEffects.POISON).getDuration()
					: 0) != 0) {
				poison_time = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
						? _livEnt.getEffect(MobEffects.POISON).getDuration()
						: 0;
				poison_level = entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
						? _livEnt.getEffect(MobEffects.POISON).getAmplifier()
						: 0;
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.POISON);
				if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1)
						.getItem() == ElementureModItems.SMALLCHARMAGAINSTPOISON.get()) {
					if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getOrCreateTag()
							.getDouble("small_charm_against_poison_timer") > -100) {
						((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getOrCreateTag()
								.putDouble("small_charm_against_poison_timer",
										(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getOrCreateTag()
												.getDouble("small_charm_against_poison_timer") - 1));
					} else {
						((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getOrCreateTag()
								.putDouble("small_charm_against_poison_timer", 0);
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
								? _livEnt.getEffect(MobEffects.POISON).getAmplifier()
								: 0) == 0) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) (poison_time - 40), 0));
						} else {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) (poison_time - 10), (int) (poison_level - 1)));
						}
					}
				}
				if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2)
						.getItem() == ElementureModItems.SMALLCHARMAGAINSTPOISON.get()) {
					if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getOrCreateTag()
							.getDouble("small_charm_against_poison_timer") > -100) {
						((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getOrCreateTag()
								.putDouble("small_charm_against_poison_timer",
										(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getOrCreateTag()
												.getDouble("small_charm_against_poison_timer") - 1));
					} else {
						((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getOrCreateTag()
								.putDouble("small_charm_against_poison_timer", 0);
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
								? _livEnt.getEffect(MobEffects.POISON).getAmplifier()
								: 0) == 0) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) (poison_time - 40), 0));
						} else {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) (poison_time - 10), (int) (poison_level - 1)));
						}
					}
				}
				if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3)
						.getItem() == ElementureModItems.SMALLCHARMAGAINSTPOISON.get()) {
					if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getOrCreateTag()
							.getDouble("small_charm_against_poison_timer") > -100) {
						((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getOrCreateTag()
								.putDouble("small_charm_against_poison_timer",
										(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getOrCreateTag()
												.getDouble("small_charm_against_poison_timer") - 1));
					} else {
						((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getOrCreateTag()
								.putDouble("small_charm_against_poison_timer", 0);
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
								? _livEnt.getEffect(MobEffects.POISON).getAmplifier()
								: 0) == 0) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) (poison_time - 40), 0));
						} else {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) (poison_time - 10), (int) (poison_level - 1)));
						}
					}
				}
				if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4)
						.getItem() == ElementureModItems.SMALLCHARMAGAINSTPOISON.get()) {
					if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getOrCreateTag()
							.getDouble("small_charm_against_poison_timer") > -100) {
						((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getOrCreateTag()
								.putDouble("small_charm_against_poison_timer",
										(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getOrCreateTag()
												.getDouble("small_charm_against_poison_timer") - 1));
					} else {
						((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getOrCreateTag()
								.putDouble("small_charm_against_poison_timer", 0);
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
								? _livEnt.getEffect(MobEffects.POISON).getAmplifier()
								: 0) == 0) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) (poison_time - 40), 0));
						} else {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) (poison_time - 10), (int) (poison_level - 1)));
						}
					}
				}
				if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5)
						.getItem() == ElementureModItems.SMALLCHARMAGAINSTPOISON.get()) {
					if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getOrCreateTag()
							.getDouble("small_charm_against_poison_timer") > -100) {
						((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getOrCreateTag()
								.putDouble("small_charm_against_poison_timer",
										(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getOrCreateTag()
												.getDouble("small_charm_against_poison_timer") - 1));
					} else {
						((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getOrCreateTag()
								.putDouble("small_charm_against_poison_timer", 0);
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
								? _livEnt.getEffect(MobEffects.POISON).getAmplifier()
								: 0) == 0) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) (poison_time - 40), 0));
						} else {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) (poison_time - 10), (int) (poison_level - 1)));
						}
					}
				}
				if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6)
						.getItem() == ElementureModItems.SMALLCHARMAGAINSTPOISON.get()) {
					if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getOrCreateTag()
							.getDouble("small_charm_against_poison_timer") > -100) {
						((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getOrCreateTag()
								.putDouble("small_charm_against_poison_timer",
										(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getOrCreateTag()
												.getDouble("small_charm_against_poison_timer") - 1));
					} else {
						((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getOrCreateTag()
								.putDouble("small_charm_against_poison_timer", 0);
						if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.POISON)
								? _livEnt.getEffect(MobEffects.POISON).getAmplifier()
								: 0) == 0) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) (poison_time - 40), 0));
						} else {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.POISON, (int) (poison_time - 10), (int) (poison_level - 1)));
						}
					}
				}
			}
		}
	}
}

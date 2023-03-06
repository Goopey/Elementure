package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RubedoClickEffectProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getItem() == ElementureModItems.RUBEDO.get()) {
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag().getDouble("rage") >= 1000) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100,
							(int) (Math.floor(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag().getDouble("rage") / 10)
									- 1)));
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag().putDouble("rage", 0);
			}
		}
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getItem() == ElementureModItems.RUBEDO.get()) {
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag().getDouble("rage") >= 1000) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100,
							(int) (Math.floor(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag().getDouble("rage") / 10)
									- 1)));
				((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag().putDouble("rage", 0);
			}
		}
	}
}

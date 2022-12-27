package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CormunculustunerEffectProcedure {
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
		ItemStack relic_item = ItemStack.EMPTY;
		ItemStack mainhand = ItemStack.EMPTY;
		relic_item = new ItemStack(ElementureModItems.CORMUNCULUSTUNER.get());
		mainhand = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_1).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_2).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_3).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_4).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_5).getItem() == relic_item.getItem()
				|| ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_relic_6).getItem() == relic_item.getItem()) {
			if (mainhand.getItem() == ElementureModItems.DARKGEMSWORD.get() || mainhand.getItem() == ElementureModItems.DARKGEMAXE.get()
					|| mainhand.getItem() == ElementureModItems.DARKGEMAXE.get() || mainhand.getItem() == ElementureModItems.DARKGEMSHOVEL.get()
					|| mainhand.getItem() == ElementureModItems.DARKGEMHOE.get() || mainhand.getItem() == ElementureModItems.DARKGEMPICKAXE.get()) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"attribute @s forge:swim_speed modifier add fa01564f-26c0-432a-b558-a64f42b22338 cormunculusswimcharm 0.2 add");
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"attribute @s forge:swim_speed modifier remove fa01564f-26c0-432a-b558-a64f42b22338");
				}
			}
		}
	}
}

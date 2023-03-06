package net.mcreator.elementure.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MycenapouchEffectProcedure {
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
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag).getItem() == ElementureModItems.MYCENAPOUCH.get()
				&& ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag).getOrCreateTag().getDouble("wait") >= 1200) {
			if (!(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.MUSHROOM_STEW)) : false)
					&& !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.MYCENASHROOMITEM.get())) : false)) {
				if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.BOWL)) : false) && Math.random() < 0.25) {
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.BOWL);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.MUSHROOM_STEW);
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ElementureModItems.MYCENASHROOMITEM.get());
						_setstack.setCount(8);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
			((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag).getOrCreateTag().putDouble("wait", 0);
		} else {
			((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag).getOrCreateTag().putDouble("wait",
					(((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag).getOrCreateTag().getDouble("wait") + 1));
		}
	}
}

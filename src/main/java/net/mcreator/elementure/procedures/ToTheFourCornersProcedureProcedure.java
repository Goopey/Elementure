package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class ToTheFourCornersProcedureProcedure {
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
		if (!(entity instanceof ServerPlayer _plr && _plr.level instanceof ServerLevel
				? _plr.getAdvancements().getOrStartProgress(_plr.server.getAdvancements().getAdvancement(new ResourceLocation("elementure:elementure_fishingadvancement"))).isDone()
				: false)) {
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.TRAHIRA.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.HIGHTRAHIRA.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.SUPREME_TRAHIRA.get())) : false)
					&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ElementureModItems.MAXTRAHIRA.get())) : false)) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("elementure:to_the_four_corners"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RimecormunculuschannelerTrueWaterLightProcedure {
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
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ElementureModItems.RIMECORMUNCULUS_CHANNELER.get()) {
			if (world.dayTime() % 200 < 100) {
				entity.getPersistentData().putBoolean("waterACTIVE", (true));
				entity.getPersistentData().putBoolean("lightACTIVE", (false));
			} else {
				entity.getPersistentData().putBoolean("waterACTIVE", (false));
				entity.getPersistentData().putBoolean("lightACTIVE", (true));
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class InfinitycolorloopProcedure {
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
		if (entity.getPersistentData().getDouble("infinitycolorloop") > 0) {
			entity.getPersistentData().putDouble("infinitycolorloop", 0);
			if (entity.getPersistentData().getDouble("infinitycolor") == -65383) {
				entity.getPersistentData().putDouble("infinitycolor", (-65536));
			} else if (entity.getPersistentData().getDouble("infinitycolor") == -65536) {
				entity.getPersistentData().putDouble("infinitycolor", (-39424));
			} else if (entity.getPersistentData().getDouble("infinitycolor") == -39424) {
				entity.getPersistentData().putDouble("infinitycolor", (-256));
			} else if (entity.getPersistentData().getDouble("infinitycolor") == -256) {
				entity.getPersistentData().putDouble("infinitycolor", (-3342592));
			} else if (entity.getPersistentData().getDouble("infinitycolor") == -3342592) {
				entity.getPersistentData().putDouble("infinitycolor", (-13369600));
			} else if (entity.getPersistentData().getDouble("infinitycolor") == -13369600) {
				entity.getPersistentData().putDouble("infinitycolor", (-16738048));
			} else if (entity.getPersistentData().getDouble("infinitycolor") == -16738048) {
				entity.getPersistentData().putDouble("infinitycolor", (-16737997));
			} else if (entity.getPersistentData().getDouble("infinitycolor") == -16737997) {
				entity.getPersistentData().putDouble("infinitycolor", (-16711681));
			} else if (entity.getPersistentData().getDouble("infinitycolor") == -16711681) {
				entity.getPersistentData().putDouble("infinitycolor", (-16737844));
			} else if (entity.getPersistentData().getDouble("infinitycolor") == -16737844) {
				entity.getPersistentData().putDouble("infinitycolor", (-16777063));
			} else if (entity.getPersistentData().getDouble("infinitycolor") == -16777063) {
				entity.getPersistentData().putDouble("infinitycolor", (-6750004));
			} else if (entity.getPersistentData().getDouble("infinitycolor") == -6750004) {
				entity.getPersistentData().putDouble("infinitycolor", (-65281));
			} else if (entity.getPersistentData().getDouble("infinitycolor") == -65281) {
				entity.getPersistentData().putDouble("infinitycolor", (-65383));
			} else {
				entity.getPersistentData().putDouble("infinitycolor", (-65536));
			}
		} else {
			entity.getPersistentData().putDouble("infinitycolorloop", (entity.getPersistentData().getDouble("infinitycolorloop") + 1));
		}
	}
}

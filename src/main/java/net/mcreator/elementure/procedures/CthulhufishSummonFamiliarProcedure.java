package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.entity.CthulhupetEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CthulhufishSummonFamiliarProcedure {
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
		if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_familiar).getItem() == ElementureModItems.CTHULHUFISH.get()) {
			if (!world.getEntitiesOfClass(CthulhupetEntity.class,
					AABB.ofSize(new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), 25, 25, 25), e -> true).isEmpty()) {
				entity.getPersistentData().putDouble("summontimer", 10);
			} else if (entity.getPersistentData().getDouble("summontimer") > -3) {
				entity.getPersistentData().putDouble("summontimer", (entity.getPersistentData().getDouble("summontimer") - 1));
			} else {
				if ((((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_familiar).getDisplayName().getString())
						.equals("Cthulhu fish")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
									("summon elementure:cthulhupet ~ ~ ~" + (" {Tame:1, Owner:" + (entity.getDisplayName().getString() + "}"))));
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
									("summon elementure:cthulhupet ~ ~ ~" + (" {Tame:1, Owner:" + ((entity.getDisplayName().getString() + ", ") + ""
											+ ("CustomName:\"" + ""
													+ (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_familiar)
															.getDisplayName().getString() + "" + "\"}"))))));
					}
				}
			}
		}
	}
}

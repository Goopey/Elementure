package net.mcreator.elementure.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.elementure.network.ElementureModVariables;

public class SuitcaseGUISaveProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double inventorySlots = 0;
		if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).bag_opened_from_relic_inventory == true) {
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag).is(ItemTags.create(new ResourceLocation("forge:three_slot_backpacks")))) {
				ThreeslotbackpacksSaveProcedure.execute(entity);
			}
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag).is(ItemTags.create(new ResourceLocation("forge:five_slot_backpacks")))) {
				FiveslotbackpacksSaveProcedure.execute(entity);
			}
			if (((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag).is(ItemTags.create(new ResourceLocation("forge:ten_slot_backpacks")))) {
				TenslotbackpacksSaveProcedure.execute(entity);
			}
			{
				boolean _setval = false;
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.bag_opened_from_relic_inventory = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

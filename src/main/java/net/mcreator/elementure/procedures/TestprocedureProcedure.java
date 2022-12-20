package net.mcreator.elementure.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

import java.util.concurrent.atomic.AtomicReference;

public class TestprocedureProcedure {
	public static ItemStack execute(Entity entity) {
		if (entity == null)
			return ItemStack.EMPTY;
		double lol = 0;
		double lolY = 0;
		double lolZ = 0;
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		double numLogs = 0;
		double num = 0;
		boolean e = false;
		return new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(0, ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag));
	}
}

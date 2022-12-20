package net.mcreator.elementure.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.elementure.network.ElementureModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class ThreeslotbackpacksSaveProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double inventorySlots = 0;
		for (int index0 = 0; index0 < (int) (3); index0++) {
			{
				ItemStack _isc = ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_bag);
				final ItemStack _setstack = ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) inventorySlots)).getItem() : ItemStack.EMPTY).copy());
				final int _sltid = (int) inventorySlots;
				_setstack.setCount((((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
						&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get((int) inventorySlots)).getItem() : ItemStack.EMPTY).copy()))
						.getCount());
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
			inventorySlots = inventorySlots + 1;
		}
	}
}

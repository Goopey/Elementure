package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;

public class StructureitemtesterRightClickedOnBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double LocalX = 0;
		double LocalZ = 0;
		ItemStack book = ItemStack.EMPTY;
		if (Math.random() < 0.5) {
			{
				String _setval = "cometFish";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				String _setval = "angelPip";
				entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.chosenFish = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

public class FlutanitearmorFullArmorEffectProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ElementureModItems.FLUTANITEARMOR_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == ElementureModItems.FLUTANITEARMOR_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ElementureModItems.FLUTANITEARMOR_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ElementureModItems.FLUTANITEARMOR_BOOTS.get()) {
						if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).air_essence < (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag()
										.getDouble("previousAirEssence")) {
							{
								double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).air_essence
										+ ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().getDouble("previousAirEssence")
												- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).air_essence) / 3;
								entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.air_essence = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().putDouble("previousAirEssence",
								((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).air_essence));
					}
				}
			}
		}
	}
}

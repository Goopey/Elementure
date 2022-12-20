package net.mcreator.elementure.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

public class NeonarmorFullArmorBonusProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == ElementureModItems.NEONARMOR_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
					.getItem() == ElementureModItems.NEONARMOR_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == ElementureModItems.NEONARMOR_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
							.getItem() == ElementureModItems.NEONARMOR_BOOTS.get()) {
						if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).energy_essence < (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
										: ItemStack.EMPTY).getOrCreateTag().getDouble("previousEnergyEssence")) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 100,
										(int) Math.ceil(((entity instanceof LivingEntity _entGetArmor
												? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
												: ItemStack.EMPTY).getOrCreateTag().getDouble("previousEnergyEssence")
												- (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new ElementureModVariables.PlayerVariables())).energy_essence)
												/ 8)));
							if (entity instanceof LivingEntity _entity)
								_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 5));
						}
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getOrCreateTag()
								.putDouble("previousEnergyEssence", ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ElementureModVariables.PlayerVariables())).energy_essence));
					}
				}
			}
		}
	}
}

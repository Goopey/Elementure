package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

public class RainbowarmorFullaEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == ElementureModItems.RAINBOWARMOR_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
					.getItem() == ElementureModItems.RAINBOWARMOR_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == ElementureModItems.RAINBOWARMOR_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
							.getItem() == ElementureModItems.RAINBOWARMOR_BOOTS.get()) {
						if ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new ElementureModVariables.PlayerVariables())).light_essence < (entity instanceof LivingEntity _entGetArmor
										? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
										: ItemStack.EMPTY).getOrCreateTag().getDouble("previousLightEssence")) {
							{
								double _setval = (entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ElementureModVariables.PlayerVariables())).light_essence + 8;
								entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.light_essence = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
									.getOrCreateTag().putDouble("bonus",
											((entity instanceof LivingEntity _entGetArmor
													? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
													: ItemStack.EMPTY).getOrCreateTag().getDouble("bonus") + 20));
						}
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getOrCreateTag()
								.putDouble("previousLightEssence", ((entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new ElementureModVariables.PlayerVariables())).light_essence));
						if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
								.getOrCreateTag().getDouble("bonus") >= 0) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null)
									_ent.getServer().getCommands().performCommand(
											_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
											(("replaceitem entity @s armor.chest elementure:rainbowarmor_chestplate{AttributeModifiers:[{AttributeName:\"generic.armor\",Amount:8,Slot:chest,Name:\"generic.armor\",UUID:[I;-12183,31952,173830,-63904]},{AttributeName:\"generic.armor_toughness\",Amount:2.6,Slot:chest,Name:\"generic.armor_toughness\",UUID:[I;-12183,32052,173830,-64104]},{AttributeName:\"generic.movement_speed\",Amount:-0.1,Slot:chest,Operation:1,Name:\"generic.movement_speed\",UUID:[I;-12183,32152,173830,-64304]}], Damage :"
													+ "" + new java.text.DecimalFormat("##.##").format((itemstack).getDamageValue())) + "}"));
							}
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 20, 0));
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 20, 0));
							if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.REGENERATION) : false)) {
								if (entity instanceof LivingEntity _entity)
									_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0));
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.END_ROD, (entity.getZ()), (entity.getY() + 1), (entity.getX()), 2, 0.01, 0.01,
										0.01, 0.01);
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
									.getOrCreateTag().putDouble("bonus",
											((entity instanceof LivingEntity _entGetArmor
													? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD)
													: ItemStack.EMPTY).getOrCreateTag().getDouble("bonus") - 1));
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null)
									_ent.getServer().getCommands().performCommand(
											_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
											(("replaceitem entity @s armor.chest elementure:rainbowarmor_chestplate{AttributeModifiers:[{AttributeName:\"generic.armor\",Amount:8,Slot:chest,Name:\"generic.armor\",UUID:[I;-12183,31952,173830,-63904]},{AttributeName:\"generic.armor_toughness\",Amount:2.6,Slot:chest,Name:\"generic.armor_toughness\",UUID:[I;-12183,32052,173830,-64104]}], Damage :"
													+ "" + new java.text.DecimalFormat("##.##").format((itemstack).getDamageValue())) + "}"));
							}
						}
					} else {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands().performCommand(
										_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
										(("replaceitem entity @s armor.chest elementure:rainbowarmor_chestplate{AttributeModifiers:[{AttributeName:\"generic.armor\",Amount:8,Slot:chest,Name:\"generic.armor\",UUID:[I;-12183,31952,173830,-63904]},{AttributeName:\"generic.armor_toughness\",Amount:2.6,Slot:chest,Name:\"generic.armor_toughness\",UUID:[I;-12183,32052,173830,-64104]}], Damage :"
												+ "" + new java.text.DecimalFormat("##.##").format((itemstack).getDamageValue())) + "}"));
						}
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
									(("replaceitem entity @s armor.chest elementure:rainbowarmor_chestplate{AttributeModifiers:[{AttributeName:\"generic.armor\",Amount:8,Slot:chest,Name:\"generic.armor\",UUID:[I;-12183,31952,173830,-63904]},{AttributeName:\"generic.armor_toughness\",Amount:2.6,Slot:chest,Name:\"generic.armor_toughness\",UUID:[I;-12183,32052,173830,-64104]}], Damage :"
											+ "" + new java.text.DecimalFormat("##.##").format((itemstack).getDamageValue())) + "}"));
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								(("replaceitem entity @s armor.chest elementure:rainbowarmor_chestplate{AttributeModifiers:[{AttributeName:\"generic.armor\",Amount:8,Slot:chest,Name:\"generic.armor\",UUID:[I;-12183,31952,173830,-63904]},{AttributeName:\"generic.armor_toughness\",Amount:2.6,Slot:chest,Name:\"generic.armor_toughness\",UUID:[I;-12183,32052,173830,-64104]}], Damage :"
										+ "" + new java.text.DecimalFormat("##.##").format((itemstack).getDamageValue())) + "}"));
				}
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							(("replaceitem entity @s armor.chest elementure:rainbowarmor_chestplate{AttributeModifiers:[{AttributeName:\"generic.armor\",Amount:8,Slot:chest,Name:\"generic.armor\",UUID:[I;-12183,31952,173830,-63904]},{AttributeName:\"generic.armor_toughness\",Amount:2.6,Slot:chest,Name:\"generic.armor_toughness\",UUID:[I;-12183,32052,173830,-64104]}], Damage :"
									+ "" + new java.text.DecimalFormat("##.##").format((itemstack).getDamageValue())) + "}"));
			}
		}
	}
}

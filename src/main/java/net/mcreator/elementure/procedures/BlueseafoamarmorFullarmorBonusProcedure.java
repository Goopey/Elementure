package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.init.ElementureModItems;

public class BlueseafoamarmorFullarmorBonusProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ElementureModItems.BLUESEAFOAMARMOR_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == ElementureModItems.BLUESEAFOAMARMOR_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ElementureModItems.BLUESEAFOAMARMOR_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ElementureModItems.BLUESEAFOAMARMOR_BOOTS.get()) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									(("item replace entity @e[distance=0..0.1,type=minecraft:player] armor.chest elementure:blueseafoamarmor_chestplate{AttributeModifiers:[{AttributeName:\"generic.armor\",Amount:5,Slot:chest,Name:\"generic.armor\",UUID:[I;-12183,31952,173830,-63904]},{AttributeName:\"generic.armor_toughness\",Amount:1.2,Slot:chest,Name:\"generic.armor_toughness\",UUID:[I;-12183,32052,173830,-64104]},{AttributeName:\"generic.attack_speed\",Amount:0.15,Slot:chest,Operation:1,Name:\"generic.attack_speed\",UUID:[I;-12183,35752,174530,-70504]}], Damage :"
											+ "" + new java.text.DecimalFormat("##.##").format((itemstack).getDamageValue())) + "}"));
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									(("item replace entity @e[distance=0..0.1,type=minecraft:player] armor.chest elementure:blueseafoamarmor_chestplate{Damage : " + new java.text.DecimalFormat("##.##").format((itemstack).getDamageValue())) + "}"));
					}
				} else {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								(("item replace entity @e[distance=0..0.1,type=minecraft:player] armor.chest elementure:blueseafoamarmor_chestplate{Damage : " + new java.text.DecimalFormat("##.##").format((itemstack).getDamageValue())) + "}"));
				}
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							(("item replace entity @e[distance=0..0.1,type=minecraft:player] armor.chest elementure:blueseafoamarmor_chestplate{Damage : " + new java.text.DecimalFormat("##.##").format((itemstack).getDamageValue())) + "}"));
			}
		} else {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						(("item replace entity @e[distance=0..0.1,type=minecraft:player] armor.chest elementure:blueseafoamarmor_chestplate{Damage : " + new java.text.DecimalFormat("##.##").format((itemstack).getDamageValue())) + "}"));
		}
	}
}

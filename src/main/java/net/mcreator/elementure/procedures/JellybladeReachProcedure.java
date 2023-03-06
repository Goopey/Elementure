package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.init.ElementureModItems;

import java.util.function.Supplier;
import java.util.UUID;

public class JellybladeReachProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ItemStack spear = ItemStack.EMPTY;
		double amount = 0;
		spear = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		RegistryObject<Attribute> registerAttrib = ForgeMod.REACH_DISTANCE;
		EquipmentSlot equipSlot = EquipmentSlot.MAINHAND;
		Attribute attrib = registerAttrib.get();
		if (spear.getItem() == ElementureModItems.JELLYBLADE.get() && registerAttrib.isPresent() && !spear.getAttributeModifiers(equipSlot).containsKey(attrib)) {
			amount = 2;
			UUID id = UUID.fromString("29b23646-7e33-4a6d-9150-3217d940607f");
			Supplier<String> nameSupplier = () -> name;
			AttributeModifier.Operation attOp = AttributeModifier.Operation.ADDITION;
			AttributeModifier attMod = new AttributeModifier(id, nameSupplier, amount, attOp);
			spear.addAttributeModifier(attrib, attMod, equipSlot);
		}
	}

	private final static String name = "jellyBladeReach";
	{
	}
}

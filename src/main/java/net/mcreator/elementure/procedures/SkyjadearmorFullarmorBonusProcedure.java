package net.mcreator.elementure.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModBlocks;

public class SkyjadearmorFullarmorBonusProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ElementureModItems.SKYJADEARMOR_HELMET.get()) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == ElementureModItems.SKYJADEARMOR_CHESTPLATE.get()) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ElementureModItems.SKYJADEARMOR_LEGGINGS.get()) {
					if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ElementureModItems.SKYJADEARMOR_BOOTS.get()) {
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 60, 0));
						if ((world.getBlockState(new BlockPos(entity.getX(), entity.getY(), entity.getZ()))).getBlock() == ElementureModBlocks.CLOUDBLOCK.get()) {
							entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 3.7, (entity.getDeltaMovement().z())));
						}
					}
				}
			}
		}
	}
}

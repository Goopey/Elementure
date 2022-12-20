package net.mcreator.elementure.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.elementure.init.ElementureModItems;

public class MinoskullRetrieveFlailProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack flail2 = ItemStack.EMPTY;
		flail2 = new ItemStack(ElementureModItems.MINOSKULLFLAIL.get());
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) > 0) {
			(flail2).enchant(Enchantments.SHARPNESS, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE, itemstack) > 0) {
			(flail2).enchant(Enchantments.SMITE, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS, itemstack) > 0) {
			(flail2).enchant(Enchantments.BANE_OF_ARTHROPODS, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.KNOCKBACK, itemstack) > 0) {
			(flail2).enchant(Enchantments.KNOCKBACK, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.KNOCKBACK, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT, itemstack) > 0) {
			(flail2).enchant(Enchantments.FIRE_ASPECT, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack) > 0) {
			(flail2).enchant(Enchantments.UNBREAKING, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MENDING, itemstack) > 0) {
			(flail2).enchant(Enchantments.MENDING, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MENDING, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.VANISHING_CURSE, itemstack) > 0) {
			(flail2).enchant(Enchantments.VANISHING_CURSE, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.VANISHING_CURSE, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, itemstack) > 0) {
			(flail2).enchant(Enchantments.BINDING_CURSE, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, itemstack));
		}
		(flail2).setDamageValue((itemstack).getDamageValue());
		if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = flail2;
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = flail2;
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		}
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
	}
}

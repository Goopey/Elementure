package net.mcreator.elementure.procedures;

import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEnchantments;

public class HarpoonTransformProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack harpoon = ItemStack.EMPTY;
		harpoon = new ItemStack(ElementureModItems.HARPOON.get());
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack) > 0) {
			(harpoon).enchant(Enchantments.SHARPNESS, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SHARPNESS, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE, itemstack) > 0) {
			(harpoon).enchant(Enchantments.SMITE, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SMITE, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS, itemstack) > 0) {
			(harpoon).enchant(Enchantments.BANE_OF_ARTHROPODS, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BANE_OF_ARTHROPODS, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.KNOCKBACK, itemstack) > 0) {
			(harpoon).enchant(Enchantments.KNOCKBACK, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.KNOCKBACK, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT, itemstack) > 0) {
			(harpoon).enchant(Enchantments.FIRE_ASPECT, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack) > 0) {
			(harpoon).enchant(Enchantments.UNBREAKING, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MENDING, itemstack) > 0) {
			(harpoon).enchant(Enchantments.MENDING, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MENDING, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.VANISHING_CURSE, itemstack) > 0) {
			(harpoon).enchant(Enchantments.VANISHING_CURSE, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.VANISHING_CURSE, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, itemstack) > 0) {
			(harpoon).enchant(Enchantments.BINDING_CURSE, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BINDING_CURSE, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, itemstack) > 0) {
			(harpoon).enchant(Enchantments.POWER_ARROWS, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.POWER_ARROWS, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_SPEED, itemstack) > 0) {
			(harpoon).enchant(Enchantments.FISHING_SPEED, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_SPEED, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_LUCK, itemstack) > 0) {
			(harpoon).enchant(Enchantments.FISHING_LUCK, EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FISHING_LUCK, itemstack));
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(ElementureModEnchantments.MAGNETIC_ENCHANTMENT.get(), itemstack) > 0) {
			(harpoon).enchant(ElementureModEnchantments.MAGNETIC_ENCHANTMENT.get(),
					EnchantmentHelper.getItemEnchantmentLevel(ElementureModEnchantments.MAGNETIC_ENCHANTMENT.get(), itemstack));
		}
		if (!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance()
							.getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			(harpoon).setDamageValue((int) ((itemstack).getDamageValue() + 1));
		} else {
			(harpoon).setDamageValue((itemstack).getDamageValue());
		}
		if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = harpoon;
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
		} else if (itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = harpoon;
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

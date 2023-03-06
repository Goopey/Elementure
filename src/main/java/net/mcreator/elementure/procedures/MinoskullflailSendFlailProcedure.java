package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.client.Minecraft;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModEntities;
import net.mcreator.elementure.entity.MinoskullflaibulletEntity;

public class MinoskullflailSendFlailProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double pitch = 0;
		double pitch2 = 0;
		double yaw = 0;
		double yaw2 = 0;
		ItemStack flail2 = ItemStack.EMPTY;
		flail2 = new ItemStack(ElementureModItems.MINOSKULLSTICK.get());
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
		if (!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			(flail2).setDamageValue((int) ((itemstack).getDamageValue() + 1));
		} else {
			(flail2).setDamageValue((itemstack).getDamageValue());
		}
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
		pitch = Math.cos(entity.getXRot() / ((-180) / Math.PI));
		pitch2 = Math.sin(entity.getXRot() / ((-180) / Math.PI));
		yaw = Math.sin(entity.getYRot() / ((-180) / Math.PI));
		yaw2 = Math.cos(entity.getYRot() / ((-180) / Math.PI));
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new MinoskullflaibulletEntity(ElementureModEntities.MINOSKULLFLAIBULLET.get(), _level);
			entityToSpawn.moveTo((entity.getX()), (1.2 + entity.getY()), (entity.getZ()), 0, 0);
			entityToSpawn.setYBodyRot(0);
			entityToSpawn.setYHeadRot(0);
			entityToSpawn.setDeltaMovement((2.2 * yaw * pitch), (2.2 * pitch2), (2.2 * yaw2 * pitch));
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
	}
}

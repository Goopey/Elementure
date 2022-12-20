package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class MycenalibrarianguibackProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;

		ItemStack book = ItemStack.EMPTY;
		double bookLvl = 0;
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(Items.EMERALD);
			_setstack.setCount((int) Math
					.round(12 + entity.getPersistentData().getDouble("tradeAmount") / 3.5 + entity.getPersistentData().getDouble("enchantType") / 2));
			((Slot) _slots.get(8)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		book = new ItemStack(Items.ENCHANTED_BOOK);
		if (entity.getPersistentData().getDouble("enchantType") == 1) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel5");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.BANE_OF_ARTHROPODS, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 2) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel4");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.PIERCING, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 3) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel4");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.BLAST_PROTECTION, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 4) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel5");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.IMPALING, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 5) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.QUICK_CHARGE, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 6) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel4");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FIRE_PROTECTION, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 7) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel4");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 8) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel2");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.KNOCKBACK, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 9) {
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.CHANNELING, 1);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 10) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FISHING_SPEED, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 11) {
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.AQUA_AFFINITY, 1);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 12) {
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.VANISHING_CURSE, 1);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 13) {
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.BINDING_CURSE, 1);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 14) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.THORNS, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 15) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FISHING_LUCK, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 16) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.SOUL_SPEED, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 17) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.RESPIRATION, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 18) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.SWEEPING_EDGE, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 19) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel5");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.SMITE, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		}
		if (entity.getPersistentData().getDouble("enchantType") == 20) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel2");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FROST_WALKER, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 21) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel4");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.PROJECTILE_PROTECTION, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 22) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.DEPTH_STRIDER, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 23) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.RIPTIDE, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 24) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.LOYALTY, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 25) {
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.SILK_TOUCH, 1);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 26) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel2");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FIRE_ASPECT, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 27) {
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FLAMING_ARROWS, 1);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 28) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel4");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FALL_PROTECTION, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 29) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.MOB_LOOTING, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 30) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel5");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.POWER_ARROWS, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 31) {
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.INFINITY_ARROWS, 1);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 32) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.UNBREAKING, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 33) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel5");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.SHARPNESS, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 34) {
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.MULTISHOT, 1);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 35) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel5");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.BLOCK_EFFICIENCY, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 36) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel3");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.BLOCK_FORTUNE, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 37) {
			bookLvl = entity.getPersistentData().getDouble("enchantLevel2");
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.PUNCH_ARROWS, (int) bookLvl);
			book = EnchantedBookItem.createForEnchantment(ei);
		} else if (entity.getPersistentData().getDouble("enchantType") == 38) {
			EnchantmentInstance ei = new EnchantmentInstance(Enchantments.MENDING, 1);
			book = EnchantedBookItem.createForEnchantment(ei);
		}
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = book;
			_setstack.setCount(1);
			((Slot) _slots.get(11)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity.getPersistentData().getDouble("trades") == 0) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.BOOK);
				_setstack.setCount((int) Math.round(2 + entity.getPersistentData().getDouble("tradeAmount") / 3));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 6));
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.PAPER);
				_setstack.setCount((int) Math.round((12 + entity.getPersistentData().getDouble("tradeAmount") / 0.5)
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1) * 2));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 6));
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getDouble("trades") == 1) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.INK_SAC);
				_setstack.setCount((int) Math.round(8 + entity.getPersistentData().getDouble("tradeAmount") / 0.75));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 5));
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(3 + entity.getPersistentData().getDouble("tradeAmount") / 2.5));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.BOOKSHELF);
				_setstack.setCount((int) Math.round(2 + entity.getPersistentData().getDouble("tradeAmount") / 2.5));
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getDouble("trades") == 2) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.WRITABLE_BOOK);
				_setstack.setCount(1);
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 6));
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Blocks.GLASS_PANE);
				_setstack.setCount((int) Math.round((6 + entity.getPersistentData().getDouble("tradeAmount"))
						- ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
								? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
								: 0) + 1) * 2));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 5));
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (entity.getPersistentData().getDouble("trades") == 3) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.BOOK);
				_setstack.setCount((int) Math.round(2 + entity.getPersistentData().getDouble("tradeAmount") / 3));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 3.5));
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.COMPASS);
				_setstack.setCount((int) Math.round(2 + entity.getPersistentData().getDouble("tradeAmount") / 3.5));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 5));
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(5 + entity.getPersistentData().getDouble("tradeAmount") / 0.75));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.NAME_TAG);
				_setstack.setCount((int) Math.round(2 + entity.getPersistentData().getDouble("tradeAmount") / 5));
				((Slot) _slots.get(3)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.CLOCK);
				_setstack.setCount((int) Math.round(3 + entity.getPersistentData().getDouble("tradeAmount")));
				((Slot) _slots.get(4)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(1 + entity.getPersistentData().getDouble("tradeAmount") / 4.5));
				((Slot) _slots.get(7)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}

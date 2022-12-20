package net.mcreator.elementure.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.world.inventory.MycenashroomvillagerGUIMenu;
import net.mcreator.elementure.init.ElementureModItems;

import java.util.function.Supplier;
import java.util.Map;

import io.netty.buffer.Unpooled;

public class MycenashroomvillagerlibrarianOpenTradesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		ItemStack droppedStack = ItemStack.EMPTY;
		ItemStack book = ItemStack.EMPTY;
		double bookLvl = 0;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ElementureModItems.MYCENANTRANSLATIONBOOK.get()
				|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
						.getItem() == ElementureModItems.MYCENANTRANSLATIONBOOK.get()) {
			sourceentity.getPersistentData().putDouble("trades", (entity.getPersistentData().getDouble("trades")));
			sourceentity.getPersistentData().putDouble("tradeAmount", (entity.getPersistentData().getDouble("tradeAmount")));
			sourceentity.getPersistentData().putDouble("enchantType", (entity.getPersistentData().getDouble("enchantType")));
			sourceentity.getPersistentData().putDouble("enchantLevel2", (entity.getPersistentData().getDouble("enchantLevel2")));
			sourceentity.getPersistentData().putDouble("enchantLevel3", (entity.getPersistentData().getDouble("enchantLevel3")));
			sourceentity.getPersistentData().putDouble("enchantLevel4", (entity.getPersistentData().getDouble("enchantLevel4")));
			sourceentity.getPersistentData().putDouble("enchantLevel5", (entity.getPersistentData().getDouble("enchantLevel5")));
			sourceentity.getPersistentData().putDouble("villagerType", 3);
			{
				if (sourceentity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("MycenashroomvillagerGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new MycenashroomvillagerGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(Items.EMERALD);
				_setstack.setCount((int) Math.round(12 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3.5
						+ sourceentity.getPersistentData().getDouble("enchantType") / 2));
				((Slot) _slots.get(8)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			book = new ItemStack(Items.ENCHANTED_BOOK);
			if (sourceentity.getPersistentData().getDouble("enchantType") == 1) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel5");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.BANE_OF_ARTHROPODS, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 2) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel4");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.PIERCING, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 3) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel4");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.BLAST_PROTECTION, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 4) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel5");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.IMPALING, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 5) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.QUICK_CHARGE, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 6) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel4");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FIRE_PROTECTION, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 7) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel4");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 8) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel2");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.KNOCKBACK, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 9) {
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.CHANNELING, 1);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 10) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FISHING_SPEED, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 11) {
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.AQUA_AFFINITY, 1);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 12) {
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.VANISHING_CURSE, 1);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 13) {
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.BINDING_CURSE, 1);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 14) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.THORNS, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 15) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FISHING_LUCK, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 16) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.SOUL_SPEED, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 17) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.RESPIRATION, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 18) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.SWEEPING_EDGE, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 19) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel5");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.SMITE, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			}
			if (sourceentity.getPersistentData().getDouble("enchantType") == 20) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel2");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FROST_WALKER, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 21) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel4");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.PROJECTILE_PROTECTION, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 22) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.DEPTH_STRIDER, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 23) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.RIPTIDE, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 24) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.LOYALTY, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 25) {
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.SILK_TOUCH, 1);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 26) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel2");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FIRE_ASPECT, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 27) {
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FLAMING_ARROWS, 1);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 28) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel4");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.FALL_PROTECTION, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 29) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.MOB_LOOTING, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 30) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel5");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.POWER_ARROWS, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 31) {
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.INFINITY_ARROWS, 1);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 32) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.UNBREAKING, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 33) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel5");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.SHARPNESS, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 34) {
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.MULTISHOT, 1);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 35) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel5");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.BLOCK_EFFICIENCY, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 36) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.BLOCK_FORTUNE, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 37) {
				bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel2");
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.PUNCH_ARROWS, (int) bookLvl);
				book = EnchantedBookItem.createForEnchantment(ei);
			} else if (sourceentity.getPersistentData().getDouble("enchantType") == 38) {
				EnchantmentInstance ei = new EnchantmentInstance(Enchantments.MENDING, 1);
				book = EnchantedBookItem.createForEnchantment(ei);
			}
			if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = book;
				_setstack.setCount(1);
				((Slot) _slots.get(11)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
			if (sourceentity.getPersistentData().getDouble("trades") == 0) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.BOOK);
					_setstack.setCount((int) Math.round(2 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 6));
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.PAPER);
					_setstack.setCount((int) Math.round((12 + sourceentity.getPersistentData().getDouble("tradeAmount") / 0.5)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 6));
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (sourceentity.getPersistentData().getDouble("trades") == 1) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.INK_SAC);
					_setstack.setCount((int) Math.round(8 + sourceentity.getPersistentData().getDouble("tradeAmount") / 0.75));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 5));
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(3 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2.5));
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.BOOKSHELF);
					_setstack.setCount((int) Math.round(2 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2.5));
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (sourceentity.getPersistentData().getDouble("trades") == 2) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.WRITABLE_BOOK);
					_setstack.setCount(1);
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 6));
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.GLASS_PANE);
					_setstack.setCount((int) Math.round((6 + sourceentity.getPersistentData().getDouble("tradeAmount"))
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 5));
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (sourceentity.getPersistentData().getDouble("trades") == 3) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.BOOK);
					_setstack.setCount((int) Math.round(2 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3.5));
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.COMPASS);
					_setstack.setCount((int) Math.round(2 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3.5));
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 5));
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(5 + sourceentity.getPersistentData().getDouble("tradeAmount") / 0.75));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.NAME_TAG);
					_setstack.setCount((int) Math.round(2 + sourceentity.getPersistentData().getDouble("tradeAmount") / 5));
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.CLOCK);
					_setstack.setCount((int) Math.round(3 + sourceentity.getPersistentData().getDouble("tradeAmount")));
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 4.5));
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.PAPER) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				entity.getPersistentData().putDouble("paperTraded", (entity.getPersistentData().getDouble("paperTraded") + 1));
				if (33 < entity.getPersistentData().getDouble("paperTraded")) {
					entity.getPersistentData().putDouble("paperTraded", 0);
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(Items.EMERALD));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.INK_SAC) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				entity.getPersistentData().putDouble("inkTraded", (entity.getPersistentData().getDouble("inkTraded") + 1));
				if (16 < entity.getPersistentData().getDouble("inkTraded")) {
					entity.getPersistentData().putDouble("inkTraded", 0);
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(Items.EMERALD));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BOOK) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				entity.getPersistentData().putDouble("booksTraded", (entity.getPersistentData().getDouble("booksTraded") + 1));
				if (9 < entity.getPersistentData().getDouble("booksTraded")) {
					entity.getPersistentData().putDouble("booksTraded", 0);
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(Items.EMERALD));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GLASS_PANE
					.asItem()) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				entity.getPersistentData().putDouble("glassTraded", (entity.getPersistentData().getDouble("glassTraded") + 1));
				if (9 < entity.getPersistentData().getDouble("glassTraded")) {
					entity.getPersistentData().putDouble("glassTraded", 0);
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(Items.EMERALD));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				entity.getPersistentData().putDouble("emeraldTraded", (entity.getPersistentData().getDouble("emeraldTraded") + 1));
				if ((Math.random() + entity.getPersistentData().getDouble("emeraldTraded") / 3) / 2 - 1 > 0.85) {
					entity.getPersistentData().putDouble("emeraldTraded", 0);
					if (Math.random() < 0.15) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
									new ItemStack(ElementureModItems.MYCENANTRANSLATIONBOOK.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() > 0.15 && Math.random() < 0.18) {
						for (int index0 = 0; index0 < (int) ((int) Math.round(Math.random() * 2)); index0++) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
										new ItemStack(Items.NAME_TAG));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.random() > 0.18 && Math.random() < 0.5) {
						for (int index1 = 0; index1 < (int) ((int) Math.round(Math.random() * 3)); index1++) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
										new ItemStack(Blocks.BOOKSHELF));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.random() > 0.5 && Math.random() < 0.84) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
									new ItemStack(Items.WRITABLE_BOOK));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						droppedStack = new ItemStack(Items.ENCHANTED_BOOK);
						if (Math.random() < 0.25) {
							EnchantmentInstance ei2 = new EnchantmentInstance(Enchantments.BINDING_CURSE, 1);
							droppedStack = EnchantedBookItem.createForEnchantment(ei2);
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
										droppedStack);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.random() > 0.25 && Math.random() < 0.5) {
							EnchantmentInstance ei2 = new EnchantmentInstance(Enchantments.BINDING_CURSE, 1);
							droppedStack = EnchantedBookItem.createForEnchantment(ei2);
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
										droppedStack);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else if (Math.random() > 0.75) {
							bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
							EnchantmentInstance ei2 = new EnchantmentInstance(Enchantments.ALL_DAMAGE_PROTECTION, (int) bookLvl);
							droppedStack = EnchantedBookItem.createForEnchantment(ei2);
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
										droppedStack);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						} else {
							bookLvl = sourceentity.getPersistentData().getDouble("enchantLevel3");
							EnchantmentInstance ei2 = new EnchantmentInstance(Enchantments.POWER_ARROWS, (int) bookLvl);
							droppedStack = EnchantedBookItem.createForEnchantment(ei2);
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
										droppedStack);
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		}
	}
}

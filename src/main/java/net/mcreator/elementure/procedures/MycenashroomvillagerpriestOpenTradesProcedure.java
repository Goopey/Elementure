package net.mcreator.elementure.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
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
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.world.inventory.MycenashroomvillagerGUIMenu;
import net.mcreator.elementure.init.ElementureModItems;

import java.util.function.Supplier;
import java.util.Map;

import io.netty.buffer.Unpooled;

public class MycenashroomvillagerpriestOpenTradesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ElementureModItems.MYCENANTRANSLATIONBOOK.get()
				|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
						.getItem() == ElementureModItems.MYCENANTRANSLATIONBOOK.get()) {
			sourceentity.getPersistentData().putDouble("trades", (entity.getPersistentData().getDouble("trades")));
			sourceentity.getPersistentData().putDouble("tradeAmount", (entity.getPersistentData().getDouble("tradeAmount")));
			sourceentity.getPersistentData().putDouble("rareTrade", (entity.getPersistentData().getDouble("rareTrade")));
			sourceentity.getPersistentData().putDouble("villagerType", 4);
			{
				if (sourceentity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("MycenashroomvillagerGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new MycenashroomvillagerGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (sourceentity.getPersistentData().getDouble("trades") == 0) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.ROTTEN_FLESH);
					_setstack.setCount(
							(int) Math.round(32 - ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1)));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.NETHER_WART);
					_setstack.setCount((int) (int) Math.round((8 + sourceentity.getPersistentData().getDouble("tradeAmount") / 0.5)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount(1);
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.RABBIT_FOOT);
					_setstack.setCount(1);
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 6));
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (sourceentity.getPersistentData().getDouble("trades") == 1) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
					_setstack.setCount((int) Math.ceil(2 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2.5));
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
					ItemStack _setstack = new ItemStack(Items.ROTTEN_FLESH);
					_setstack.setCount(
							(int) Math.round(32 - ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount(1);
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.SCUTE);
					_setstack.setCount((int) Math.round(3 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3));
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) ((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 6)
							+ (sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0)
							+ 1));
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (sourceentity.getPersistentData().getDouble("trades") == 2) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.ROTTEN_FLESH);
					_setstack.setCount(
							(int) Math.round(32 - ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3));
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.RABBIT_FOOT);
					_setstack.setCount(1);
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
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount(1);
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.GLOWSTONE_DUST);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 4));
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (sourceentity.getPersistentData().getDouble("trades") == 3) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE);
					_setstack.setCount((int) (int) Math.round((4 + sourceentity.getPersistentData().getDouble("tradeAmount") / 1.5)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1)));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(12 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2));
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity.getPersistentData().getDouble("rareTrade") < 6) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANSCEPTER.get());
						_setstack.setCount(1);
						((Slot) _slots.get(7)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("rareTrade") > 19) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANSPORESLINGERING.get());
						_setstack.setCount(1);
						((Slot) _slots.get(7)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANSPORESSPLASH.get());
						_setstack.setCount(1);
						((Slot) _slots.get(7)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.ROTTEN_FLESH);
					_setstack.setCount(
							(int) Math.round(32 - ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.ROTTEN_FLESH);
					_setstack.setCount(
							(int) Math.round(32 - ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCENAROAMERSCALE.get());
					_setstack.setCount((int) Math.round(2 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2.5));
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
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(4 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2));
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 6));
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GLASS_BOTTLE) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				entity.getPersistentData().putDouble("bottleTraded", (entity.getPersistentData().getDouble("bottleTraded") + 1));
				if (11 < entity.getPersistentData().getDouble("bottleTraded")) {
					entity.getPersistentData().putDouble("bottleTraded", 0);
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(Items.EMERALD));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.getItem() == ElementureModItems.MYCENAROAMERSCALE.get()) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				entity.getPersistentData().putDouble("roamerTrade", (entity.getPersistentData().getDouble("roamerTrade") + 1));
				if (7 < entity.getPersistentData().getDouble("roamerTrade")) {
					entity.getPersistentData().putDouble("roamerTrade", 1);
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(Items.EMERALD));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GOLD_INGOT) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				entity.getPersistentData().putDouble("goldTraded", (entity.getPersistentData().getDouble("goldTraded") + 1));
				if (4 < entity.getPersistentData().getDouble("goldTraded")) {
					entity.getPersistentData().putDouble("goldTraded", (-1));
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(Items.EMERALD));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.ROTTEN_FLESH) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				entity.getPersistentData().putDouble("rottenfleshTraded", (entity.getPersistentData().getDouble("rottenfleshTraded") + 1));
				if (32 < entity.getPersistentData().getDouble("rottenfleshTraded")) {
					entity.getPersistentData().putDouble("rottenfleshTraded", 0);
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
				if ((Math.random() + entity.getPersistentData().getDouble("emeraldTraded") / 3) / 2 - 0.51 > 0.75) {
					entity.getPersistentData().putDouble("emeraldTraded", (-2));
					if (Math.random() < 0.1) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
									new ItemStack(ElementureModItems.MYCENANSPORESSPLASH.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() > 0.1 && Math.random() < 0.12) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
									new ItemStack(ElementureModItems.MYCENANSPORESLINGERING.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else if (Math.random() > 0.12 && Math.random() < 0.34) {
						for (int index0 = 0; index0 < (int) ((int) Math.round(Math.random() * 3)); index0++) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
										new ItemStack(Items.GLOWSTONE_DUST));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.random() > 0.34 && Math.random() < 0.56) {
						for (int index1 = 0; index1 < (int) ((int) Math.round(Math.random() * 3)); index1++) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
										new ItemStack(Items.REDSTONE));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.random() > 0.56 && Math.random() < 0.78) {
						for (int index2 = 0; index2 < (int) ((int) Math.round(Math.random() * 3)); index2++) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
										new ItemStack(Items.LAPIS_LAZULI));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.random() > 0.78 && Math.random() < 0.975) {
						for (int index3 = 0; index3 < (int) ((int) Math.round(Math.random() * 2)); index3++) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
										new ItemStack(Items.EXPERIENCE_BOTTLE));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
									new ItemStack(Items.ENDER_PEARL));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}

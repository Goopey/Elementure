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
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.world.inventory.MycenashroomvillagerGUIMenu;
import net.mcreator.elementure.init.ElementureModItems;

import java.util.function.Supplier;
import java.util.Map;

import io.netty.buffer.Unpooled;

public class MycenashroomvillagerFishermanOpenTradesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ElementureModItems.MYCENANTRANSLATIONBOOK.get()
				|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
						.getItem() == ElementureModItems.MYCENANTRANSLATIONBOOK.get()) {
			sourceentity.getPersistentData().putDouble("trades", (entity.getPersistentData().getDouble("trades")));
			sourceentity.getPersistentData().putDouble("tradeAmount", (entity.getPersistentData().getDouble("tradeAmount")));
			sourceentity.getPersistentData().putDouble("villagerType", 6);
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
			if (sourceentity.getPersistentData().getDouble("trades") == 0) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCOFISH.get());
					_setstack.setCount((int) Math.round((3 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1)));
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
					_setstack.setCount((int) Math.round((1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 4.5)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.STRING);
					_setstack.setCount((int) Math.round(6 + sourceentity.getPersistentData().getDouble("tradeAmount") * 6));
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MOSSFISH.get());
					_setstack.setCount((int) Math.round(4 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2));
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
			} else if (sourceentity.getPersistentData().getDouble("trades") == 1) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.COAL);
					_setstack.setCount((int) Math.round(3 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2.5));
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
					_setstack.setCount((int) Math.round((3 + sourceentity.getPersistentData().getDouble("tradeAmount") / 6)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MOSSFISH.get());
					_setstack.setCount((int) Math.round(3 + sourceentity.getPersistentData().getDouble("tradeAmount") / 4
							+ ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(7)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.HALIMUT.get());
					_setstack.setCount((int) Math.round(6 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3));
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) ((int) Math.round(10 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2)
							+ ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (sourceentity.getPersistentData().getDouble("trades") == 2) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(3 + sourceentity.getPersistentData().getDouble("tradeAmount") / 4));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MOSSFISH.get());
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3));
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.GREENGILL.get());
					_setstack.setCount((int) Math.round((6 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2)
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
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round((8 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.STRINGLINE.get());
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (sourceentity.getPersistentData().getDouble("trades") == 3) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCOFISH.get());
					_setstack.setCount((int) Math.round((8 + sourceentity.getPersistentData().getDouble("tradeAmount") / 0.3)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1)));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(2 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3.5));
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.COAL);
					_setstack.setCount((int) Math.round(4 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2));
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
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round((4 + sourceentity.getPersistentData().getDouble("tradeAmount") / 4)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.GREENGILL.get());
					_setstack.setCount(1);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCOFISH.get());
					_setstack.setCount((int) Math.round(3 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2));
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.GREENGILL.get());
					_setstack.setCount((int) Math.round((7 + sourceentity.getPersistentData().getDouble("tradeAmount") / 0.25)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1)));
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
					ItemStack _setstack = new ItemStack(ElementureModItems.GREENJACK.get());
					_setstack.setCount(1);
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(28 + sourceentity.getPersistentData().getDouble("tradeAmount") * 4));
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ElementureModItems.GREENGILL
					.get()) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				entity.getPersistentData().putDouble("greenGillTraded", (entity.getPersistentData().getDouble("greenGillTraded") + 1));
				if (4 < entity.getPersistentData().getDouble("greenGillTraded")) {
					entity.getPersistentData().putDouble("greenGillTraded", 0);
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(Items.EMERALD));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (Math.random() < 0.2) {
					entity.getPersistentData().putDouble("trades", 0);
				} else if (Math.random() > 0.2 && Math.random() < 0.4) {
					entity.getPersistentData().putDouble("trades", 1);
				} else if (Math.random() > 0.4 && Math.random() < 0.6) {
					entity.getPersistentData().putDouble("trades", 2);
				} else if (Math.random() > 0.8) {
					entity.getPersistentData().putDouble("trades", 3);
				} else {
					entity.getPersistentData().putDouble("trades", 4);
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.getItem() == ElementureModItems.MOSSFISH_XL.get()) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				for (int index0 = 0; index0 < (int) (Math.random() * 16 + 8); index0++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(ElementureModItems.COCOABAIT.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				for (int index1 = 0; index1 < (int) (Math.random() * 4 + 10); index1++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(Items.EMERALD));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (Math.random() < 0.33) {
					entity.getPersistentData().putDouble("trades", 0);
				} else if (Math.random() > 0.66) {
					entity.getPersistentData().putDouble("trades", 1);
				} else {
					entity.getPersistentData().putDouble("trades", 2);
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.getItem() == ElementureModItems.GREENJACK.get()) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				for (int index2 = 0; index2 < (int) (Math.random() * 24 + 18); index2++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(ElementureModItems.COCOABAIT.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				for (int index3 = 0; index3 < (int) (Math.random() * 8 + 24); index3++) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(Items.EMERALD));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (Math.random() < 0.7) {
					if (world instanceof Level _level && !_level.isClientSide()) {
						ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
								new ItemStack(Blocks.EMERALD_BLOCK));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (Math.random() < 0.5) {
					entity.getPersistentData().putDouble("trades", 3);
				} else {
					entity.getPersistentData().putDouble("trades", 4);
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				entity.getPersistentData().putDouble("emeraldTraded", (entity.getPersistentData().getDouble("emeraldTraded") + 1));
				if ((Math.random() + entity.getPersistentData().getDouble("emeraldTraded") / 3) / 2 - 0.26 > 0.75) {
					entity.getPersistentData().putDouble("emeraldTraded", 0);
					if (Math.random() < 0.45) {
						for (int index4 = 0; index4 < (int) (Math.random() * 12 + 8); index4++) {
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
										new ItemStack(ElementureModItems.COCOABAIT.get()));
								entityToSpawn.setPickUpDelay(10);
								_level.addFreshEntity(entityToSpawn);
							}
						}
					} else if (Math.random() > 0.55) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
									new ItemStack(Items.FISHING_ROD));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					} else {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
									new ItemStack(ElementureModItems.STRINGLINE.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
		}
	}
}

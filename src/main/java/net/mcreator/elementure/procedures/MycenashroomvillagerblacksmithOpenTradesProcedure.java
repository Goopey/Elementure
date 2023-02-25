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

public class MycenashroomvillagerblacksmithOpenTradesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == ElementureModItems.MYCENANTRANSLATIONBOOK.get()
				|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)
						.getItem() == ElementureModItems.MYCENANTRANSLATIONBOOK.get()) {
			sourceentity.getPersistentData().putDouble("trades", (entity.getPersistentData().getDouble("trades")));
			sourceentity.getPersistentData().putDouble("tradeAmount", (entity.getPersistentData().getDouble("tradeAmount")));
			sourceentity.getPersistentData().putDouble("setTrade", (entity.getPersistentData().getDouble("setTrade")));
			sourceentity.getPersistentData().putDouble("villagerType", 2);
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
					ItemStack _setstack = new ItemStack(Items.COAL);
					_setstack.setCount((int) Math.round((9 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1)));
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
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round((7 + sourceentity.getPersistentData().getDouble("tradeAmount") / 4.5)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity.getPersistentData().getDouble("setTrade") < 5) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.CHAINMAIL_CHESTPLATE);
						_setstack.setCount(1);
						((Slot) _slots.get(7)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 5 && sourceentity.getPersistentData().getDouble("setTrade") < 8) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.IRON_CHESTPLATE);
						_setstack.setCount(1);
						((Slot) _slots.get(7)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 8
						&& sourceentity.getPersistentData().getDouble("setTrade") < 15) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.CHAINMAIL_BOOTS);
						_setstack.setCount(1);
						((Slot) _slots.get(7)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.IRON_HELMET);
						_setstack.setCount(1);
						((Slot) _slots.get(7)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.DIAMOND);
					_setstack.setCount(4);
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount(4);
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (sourceentity.getPersistentData().getDouble("trades") == 1) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(4 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3.5));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.SHIELD);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round((22 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(4)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity.getPersistentData().getDouble("setTrade") < 19) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Blocks.BELL);
						_setstack.setCount(1);
						((Slot) _slots.get(7)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANHAMMER.get());
						_setstack.setCount(1);
						((Slot) _slots.get(7)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.LAVA_BUCKET);
					_setstack.setCount(1);
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(2 + sourceentity.getPersistentData().getDouble("tradeAmount") / 6));
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if (sourceentity.getPersistentData().getDouble("trades") == 2) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
					_setstack.setCount((int) Math.round(4 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3.5));
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
					ItemStack _setstack = new ItemStack(Items.FLINT);
					_setstack.setCount((int) Math.round((8 + sourceentity.getPersistentData().getDouble("tradeAmount") / 0.75)
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
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round((7 + sourceentity.getPersistentData().getDouble("tradeAmount") / 4)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1) * 2));
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity.getPersistentData().getDouble("setTrade") < 1) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANARMOR_BOOTS.get());
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 1 && sourceentity.getPersistentData().getDouble("setTrade") < 2) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANMACE.get());
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 2 && sourceentity.getPersistentData().getDouble("setTrade") < 3) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANPICKAXE.get());
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 3 && sourceentity.getPersistentData().getDouble("setTrade") < 4) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANARMOR_CHESTPLATE.get());
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 4 && sourceentity.getPersistentData().getDouble("setTrade") < 9) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.CHAINMAIL_LEGGINGS);
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 9
						&& sourceentity.getPersistentData().getDouble("setTrade") < 14.5) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.STONE_PICKAXE);
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.STONE_AXE);
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else if (sourceentity.getPersistentData().getDouble("trades") == 3) {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANALLOY.get());
					_setstack.setCount((int) Math.round(2 + sourceentity.getPersistentData().getDouble("tradeAmount") / 4));
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
					ItemStack _setstack = new ItemStack(Items.COAL);
					_setstack.setCount((int) Math.round((8 + sourceentity.getPersistentData().getDouble("tradeAmount") / 0.5)
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
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round((7 + sourceentity.getPersistentData().getDouble("tradeAmount") / 4)
							- ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HERO_OF_THE_VILLAGE)
									? _livEnt.getEffect(MobEffects.HERO_OF_THE_VILLAGE).getAmplifier()
									: 0) + 1)));
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity.getPersistentData().getDouble("setTrade") < 2) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.IRON_BOOTS);
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 2 && sourceentity.getPersistentData().getDouble("setTrade") < 5) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.STONE_SWORD);
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 5 && sourceentity.getPersistentData().getDouble("setTrade") < 8) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.STONE_SHOVEL);
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 8
						&& sourceentity.getPersistentData().getDouble("setTrade") < 11) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.STONE_HOE);
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 11
						&& sourceentity.getPersistentData().getDouble("setTrade") < 14) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.STONE_PICKAXE);
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 14
						&& sourceentity.getPersistentData().getDouble("setTrade") < 17) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.IRON_SWORD);
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.IRON_HOE);
						_setstack.setCount(1);
						((Slot) _slots.get(11)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
			} else {
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(3 + sourceentity.getPersistentData().getDouble("tradeAmount") / 3));
					((Slot) _slots.get(0)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity.getPersistentData().getDouble("setTrade") < 8) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.CHAINMAIL_HELMET);
						_setstack.setCount(1);
						((Slot) _slots.get(3)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else if (sourceentity.getPersistentData().getDouble("setTrade") > 14) {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(Items.IRON_LEGGINGS);
						_setstack.setCount(1);
						((Slot) _slots.get(3)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				} else {
					if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack _setstack = new ItemStack(ElementureModItems.MYCENANHOE.get());
						_setstack.setCount(1);
						((Slot) _slots.get(3)).set(_setstack);
						_player.containerMenu.broadcastChanges();
					}
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.FLINT);
					_setstack.setCount((int) Math.round(7 + sourceentity.getPersistentData().getDouble("tradeAmount") / 0.25));
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
					ItemStack _setstack = new ItemStack(Items.EMERALD);
					_setstack.setCount((int) Math.round(5 + sourceentity.getPersistentData().getDouble("tradeAmount") / 2));
					((Slot) _slots.get(8)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (sourceentity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(ElementureModItems.SILVERNUGGET.get());
					_setstack.setCount((int) Math.round(1 + sourceentity.getPersistentData().getDouble("tradeAmount") / 7.5));
					((Slot) _slots.get(11)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT) {
				entity.getPersistentData().putDouble("ironTraded", (entity.getPersistentData().getDouble("ironTraded") + 1));
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				if (4 < entity.getPersistentData().getDouble("ironTraded")) {
					for (int index0 = 0; index0 < (int) (Math.ceil(Math.random() * 2)); index0++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
									new ItemStack(Items.EMERALD));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					entity.getPersistentData().putDouble("ironTraded", 0);
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.getItem() == ElementureModItems.MYCENANALLOY.get()) {
				entity.getPersistentData().putDouble("alloyTraded", (entity.getPersistentData().getDouble("alloyTraded") + 1));
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				if (3 < entity.getPersistentData().getDouble("alloyTraded")) {
					for (int index1 = 0; index1 < (int) (Math.ceil(Math.random() * 3)); index1++) {
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
									new ItemStack(Items.EMERALD));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
					entity.getPersistentData().putDouble("alloyTraded", 0);
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()),
							new ItemStack(Items.EMERALD));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				entity.getPersistentData().putDouble("emeraldTraded", (entity.getPersistentData().getDouble("emeraldTraded") + 1));
				if (0.75 < (Math.random() + entity.getPersistentData().getDouble("emeraldTraded") / 5) / 2 - 0.26) {
					entity.getPersistentData().putDouble("emeraldTraded", 0);
					MycenanblacksmithbarterProcedure.execute(world, (entity.getX()), (entity.getY() + 0.25), (entity.getZ()));
				}
			}
		}
	}
}

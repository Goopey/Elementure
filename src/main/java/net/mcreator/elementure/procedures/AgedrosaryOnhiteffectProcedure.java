package net.mcreator.elementure.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import javax.annotation.Nullable;

import java.util.concurrent.atomic.AtomicReference;

@Mod.EventBusSubscriber
public class AgedrosaryOnhiteffectProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getSource().getEntity());
		}
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof Player || sourceentity instanceof ServerPlayer) {
			if (((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getItem() == ElementureModItems.AGEDROSARY.get()
					&& ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1).getOrCreateTag().getBoolean("active")) {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(0, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1))).getItem() == ElementureModItems.SHARPCOIN
						.get() || (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1)))
								.getItem() == ElementureModItems.SHARPCOIN.get()
						|| (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(2, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1)))
								.getItem() == ElementureModItems.SHARPCOIN.get()) {
					if ((sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.EMERALD)) : false)
							&& !(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false)) {
						(new ItemStack(Items.EMERALD)).shrink(1);
						{
							Entity _ent = sourceentity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @s minecraft:strength 8 0");
							}
						}
					}
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(0, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1))).getItem() == ElementureModItems.MOLTENPEARL
						.get() || (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1)))
								.getItem() == ElementureModItems.MOLTENPEARL.get()
						|| (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(2, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1)))
								.getItem() == ElementureModItems.MOLTENPEARL.get()) {
					if (Math.random() < 0.2) {
						{
							double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence + 2;
							sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.fire_essence = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(0, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1))).getItem() == ElementureModItems.SEAFOAMPEARL
						.get() || (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1)))
								.getItem() == ElementureModItems.SEAFOAMPEARL.get()
						|| (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(2, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1)))
								.getItem() == ElementureModItems.SEAFOAMPEARL.get()) {
					if (Math.random() < 0.2) {
						{
							double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).water_essence + 2;
							sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.water_essence = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(0, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1))).getItem() == Items.ENDER_PEARL
						|| (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1))).getItem() == Items.ENDER_PEARL
						|| (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(2, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_1))).getItem() == Items.ENDER_PEARL) {
					if (Math.random() < 0.2) {
						{
							double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).void_essence + 2;
							sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.void_essence = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
			}
			if (((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getItem() == ElementureModItems.AGEDROSARY.get()
					&& ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2).getOrCreateTag().getBoolean("active")) {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(0, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2))).getItem() == ElementureModItems.SHARPCOIN
						.get() || (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2)))
								.getItem() == ElementureModItems.SHARPCOIN.get()
						|| (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(2, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2)))
								.getItem() == ElementureModItems.SHARPCOIN.get()) {
					if ((sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.EMERALD)) : false)
							&& !(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false)) {
						(new ItemStack(Items.EMERALD)).shrink(1);
						{
							Entity _ent = sourceentity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @s minecraft:strength 8 0");
							}
						}
					}
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(0, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2))).getItem() == ElementureModItems.MOLTENPEARL
						.get() || (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2)))
								.getItem() == ElementureModItems.MOLTENPEARL.get()
						|| (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(2, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2)))
								.getItem() == ElementureModItems.MOLTENPEARL.get()) {
					if (Math.random() < 0.2) {
						{
							double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).fire_essence + 2;
							sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.fire_essence = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(0, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2))).getItem() == ElementureModItems.SEAFOAMPEARL
						.get() || (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2)))
								.getItem() == ElementureModItems.SEAFOAMPEARL.get()
						|| (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(2, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2)))
								.getItem() == ElementureModItems.SEAFOAMPEARL.get()) {
					if (Math.random() < 0.2) {
						{
							double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).water_essence + 2;
							sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.water_essence = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
				if ((new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(0, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2))).getItem() == Items.ENDER_PEARL
						|| (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2))).getItem() == Items.ENDER_PEARL
						|| (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(2, ((sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).relic_inventory_artifact_2))).getItem() == Items.ENDER_PEARL) {
					if (Math.random() < 0.2) {
						{
							double _setval = (sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ElementureModVariables.PlayerVariables())).void_essence + 2;
							sourceentity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.void_essence = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import java.util.concurrent.atomic.AtomicReference;

public class MycenafishingpoolProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = "mycena";
			entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.fishBiome = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (world.getLevelData().isRaining() || world.getLevelData().isThundering()) {
			if (Math.random() < 0.12) {
				{
					String _setval = "mossFish";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() > 0.12 && Math.random() < 0.24) {
				{
					String _setval = "greengill";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() > 0.24 && Math.random() < 0.36) {
				{
					String _setval = "mycoFish";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() > 0.36 && Math.random() < 0.48) {
				{
					String _setval = "halimut";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() < 0.48 && Math.random() > 0.64) {
				{
					String _setval = "mossFishXL";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() > 0.9) {
				{
					String _setval = "mutatedHalimut";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(1, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))).getItem() == ElementureModItems.MYCENANBOBBER.get() || (new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(1, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY))).getItem() == ElementureModItems.MYCENANBOBBER.get()) {
					{
						String _setval = "greenJack";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						String _setval = "mutatedHalimut";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else {
			if (Math.random() < 0.34) {
				{
					String _setval = "mossFish";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() > 0.34 && Math.random() < 0.47) {
				{
					String _setval = "greengill";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() > 0.47 && Math.random() < 0.76) {
				{
					String _setval = "mycoFish";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() > 0.76 && Math.random() < 0.9) {
				{
					String _setval = "halimut";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() < 0.9 && Math.random() > 0.95) {
				{
					String _setval = "mossFishXL";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				if ((new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(1, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY))).getItem() == ElementureModItems.MYCENANBOBBER.get() || (new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(1, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY))).getItem() == ElementureModItems.MYCENANBOBBER.get()) {
					{
						String _setval = "greenJack";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					{
						String _setval = "halimut";
						entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.chosenFish = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}

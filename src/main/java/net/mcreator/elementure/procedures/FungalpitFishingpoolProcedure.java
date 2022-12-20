package net.mcreator.elementure.procedures;

import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.elementure.network.ElementureModVariables;
import net.mcreator.elementure.init.ElementureModItems;

import java.util.concurrent.atomic.AtomicReference;

public class FungalpitFishingpoolProcedure {
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
			if (Math.random() < 0.24) {
				{
					String _setval = "mutatedHalimut";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() > 0.24 && Math.random() < 0.48) {
				{
					String _setval = "greengill";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() > 0.48 && Math.random() < 0.82) {
				{
					String _setval = "mossFish";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() < 0.82 && Math.random() > 0.93) {
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
						_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(1, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)))
						.getItem() == ElementureModItems.MYCENANBOBBER.get() || (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)))
								.getItem() == ElementureModItems.MYCENANBOBBER.get()) {
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
			if (Math.random() < 0.2) {
				{
					String _setval = "mutatedHalimut";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() > 0.2 && Math.random() < 0.44) {
				{
					String _setval = "greengill";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() > 0.44 && Math.random() < 0.84) {
				{
					String _setval = "mossFish";
					entity.getCapability(ElementureModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.chosenFish = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (Math.random() < 0.76 && Math.random() > 0.84) {
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
						_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(1, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)))
						.getItem() == ElementureModItems.MYCENANBOBBER.get() || (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)))
								.getItem() == ElementureModItems.MYCENANBOBBER.get()) {
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
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModItems;
import net.mcreator.elementure.init.ElementureModBlocks;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Comparator;

public class CustomFishingPoolProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean pool2 = false;
		{
			final Vec3 _center = new Vec3((entity.getX()), (entity.getY()), (entity.getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:fishingbobberentity")))
						&& (entityiterator.getPersistentData().getString("playerName")).equals(entity.getDisplayName().getString())) {
					if (Math.random() < 0.05 + itemstack.getOrCreateTag().getDouble("crateChance") * 0.1) {
						if ((world.getBlockState(new BlockPos(entityiterator.getX(), entityiterator.getY() - 0.5, entityiterator.getZ())))
								.is(BlockTags.create(new ResourceLocation("forge:lavafishingblocks")))) {
							LavacratePoolProcedure.execute(world, entity);
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, itemstack)).getItem() == ElementureModItems.MEMORYBOBBER.get()) {
							VoidcratePoolProcedure.execute(world, entity);
						} else {
							Customfishpoolcrate2Procedure.execute(world, entity);
						}
					} else {
						if ((world.getBlockState(new BlockPos(entityiterator.getX(), entityiterator.getY() - 0.5, entityiterator.getZ())))
								.getBlock() == ElementureModBlocks.DUNGEONWATER.get()) {
							DungeonwaterFishingpoolProcedure.execute(world, entity);
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, itemstack)).getItem() == ElementureModItems.CRABBOBBER.get() || (new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, itemstack)).getItem() == ElementureModItems.NANOSHRIMPBOBBER.get()) {
							CrabFishingPoolProcedure.execute(world, entity);
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(0, itemstack)).getItem() == ElementureModItems.PURPLEBAIT.get() && Math.random() < 0.67) {
							DiseasedfishPoolProcedure.execute(entity, itemstack);
						} else if ((new Object() {
							public ItemStack getItemStack(int sltid, ItemStack _isc) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack(1, itemstack)).getItem() == ElementureModItems.MEMORYBOBBER.get()) {
							VoidFishingPoolProcedure.execute(entity);
						} else if ((world.getBlockState(new BlockPos(entityiterator.getX(), entityiterator.getY() - 0.5, entityiterator.getZ())))
								.getBlock() == ElementureModBlocks.NETHERUMFLUID.get()) {
							NetherstarpoolProcedure.execute(entity);
						} else {
							pool2 = true;
						}
					}
				}
			}
		}
		if (pool2) {
			Customfishingpool2Procedure.execute(world, entity);
		}
		entity.getPersistentData().putBoolean("FISH", (false));
		itemstack.getOrCreateTag().putBoolean("sent", (false));
		if (!(new Object() {
			public ItemStack getItemStack(int sltid, ItemStack _isc) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(0, itemstack)).getOrCreateTag().getBoolean("notConsumable")) {
			{
				ItemStack _isc = itemstack;
				final ItemStack _setstack = (new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(0, itemstack));
				final int _sltid = 0;
				_setstack.setCount((int) (((new Object() {
					public ItemStack getItemStack(int sltid, ItemStack _isc) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
						return _retval.get();
					}
				}.getItemStack(0, itemstack))).getCount() - 1));
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
	}
}

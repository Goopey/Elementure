package net.mcreator.elementure.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;

public class NanoshrimppotFishingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean tooMuchFish = false;
		ItemStack fish = ItemStack.EMPTY;
		ItemStack fish2 = ItemStack.EMPTY;
		ItemStack fish3 = ItemStack.EMPTY;
		ItemStack fish4 = ItemStack.EMPTY;
		ItemStack fish5 = ItemStack.EMPTY;
		ItemStack fish6 = ItemStack.EMPTY;
		fish = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0));
		fish2 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 1));
		fish3 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 2));
		fish4 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 3));
		fish5 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 4));
		fish6 = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 5));
		tooMuchFish = (fish).getCount() >= 64 || (fish2).getCount() >= 64 || (fish3).getCount() >= 64 || (fish4).getCount() >= 64
				|| (fish5).getCount() >= 64 || (fish6).getCount() >= 64;
		if (Math.random() < 0.33) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("elementure:crabpot_allow_blocks_under")))
					&& (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR
					&& (world.getBlockState(new BlockPos(x + 1, y, z)))
							.is(BlockTags.create(new ResourceLocation("elementure:crabpot_allowed_blocks")))
					&& (world.getBlockState(new BlockPos(x - 1, y, z)))
							.is(BlockTags.create(new ResourceLocation("elementure:crabpot_allowed_blocks")))
					&& (world.getBlockState(new BlockPos(x, y, z + 1)))
							.is(BlockTags.create(new ResourceLocation("elementure:crabpot_allowed_blocks")))
					&& (world.getBlockState(new BlockPos(x, y, z - 1)))
							.is(BlockTags.create(new ResourceLocation("elementure:crabpot_allowed_blocks")))) {
				if (Math.random() < 0.45) {
					if (!((fish).getCount() >= 64)) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = 0;
								final ItemStack _setstack = new ItemStack(Items.RAW_IRON);
								_setstack.setCount((int) ((fish).getCount() + 1));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
							}
						}
					}
				} else if (Math.random() < 0.4) {
					if (!((fish2).getCount() >= 64)) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = 1;
								final ItemStack _setstack = new ItemStack(Items.RAW_GOLD);
								_setstack.setCount((int) ((fish2).getCount() + 1));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
							}
						}
					}
				} else if (Math.random() < 0.35) {
					if (!((fish3).getCount() >= 64)) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = 2;
								final ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI);
								_setstack.setCount((int) ((fish3).getCount() + 1));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
							}
						}
					}
				} else if (Math.random() < 0.3) {
					if (!((fish4).getCount() >= 64)) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = 3;
								final ItemStack _setstack = new ItemStack(Items.REDSTONE);
								_setstack.setCount((int) ((fish4).getCount() + 1));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
							}
						}
					}
				} else if (Math.random() < 0.2) {
					if (!((fish5).getCount() >= 64)) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = 4;
								final ItemStack _setstack = new ItemStack(Items.EMERALD);
								_setstack.setCount((int) ((fish5).getCount() + 1));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
							}
						}
					}
				} else {
					if (!((fish6).getCount() >= 64)) {
						{
							BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
							if (_ent != null) {
								final int _slotid = 5;
								final ItemStack _setstack = new ItemStack(Items.DIAMOND);
								_setstack.setCount((int) ((fish6).getCount() + 1));
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									if (capability instanceof IItemHandlerModifiable)
										((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
								});
							}
						}
					}
				}
			}
		}
		if (tooMuchFish) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LARGE_SMOKE, (x + 0.5), (y + 0.5), (z + 0.5), 5, 1.2, 1.2, 1.2, 0.02);
		}
	}
}

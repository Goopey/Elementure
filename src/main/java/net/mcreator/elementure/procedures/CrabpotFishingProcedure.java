package net.mcreator.elementure.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicReference;

public class CrabpotFishingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack fish = ItemStack.EMPTY;
		boolean tooMuchFish = false;
		fish = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0));
		tooMuchFish = (fish).getCount() >= 64;
		if (Math.random() < 0.33) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("elementure:crabpot_allow_blocks_under"))) && (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR
					&& (world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("elementure:crabpot_allowed_blocks")))
					&& (world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("elementure:crabpot_allowed_blocks")))
					&& (world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("elementure:crabpot_allowed_blocks")))
					&& (world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("elementure:crabpot_allowed_blocks")))) {
				if (fish.getItem() == (ItemStack.EMPTY).getItem()) {
					CrabpotFishingPoolProcedure.execute(world, x, y, z);
				} else if (!tooMuchFish) {
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final ItemStack _setstack = fish;
							_setstack.setCount((int) ((fish).getCount() + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
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

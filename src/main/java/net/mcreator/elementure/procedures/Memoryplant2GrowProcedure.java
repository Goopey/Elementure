package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

import java.util.Map;

public class Memoryplant2GrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double waterNum = 0;
		if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() instanceof LiquidBlock) {
			waterNum = waterNum + 0.05;
		}
		if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() instanceof LiquidBlock) {
			waterNum = waterNum + 0.05;
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() instanceof LiquidBlock) {
			waterNum = waterNum + 0.05;
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() instanceof LiquidBlock) {
			waterNum = waterNum + 0.05;
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.MOSSY_COBBLESTONE) {
			if (Math.random() < 0.1 + waterNum) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = ElementureModBlocks.MEMORYPLANT_3.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					BlockEntity _be = world.getBlockEntity(_bp);
					CompoundTag _bnbt = null;
					if (_be != null) {
						_bnbt = _be.saveWithFullMetadata();
						_be.setRemoved();
					}
					world.setBlock(_bp, _bs, 3);
					if (_bnbt != null) {
						_be = world.getBlockEntity(_bp);
						if (_be != null) {
							try {
								_be.load(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			}
		} else {
			if (Math.random() < 0.05 + waterNum) {
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = ElementureModBlocks.MEMORYPLANT_3.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					BlockEntity _be = world.getBlockEntity(_bp);
					CompoundTag _bnbt = null;
					if (_be != null) {
						_bnbt = _be.saveWithFullMetadata();
						_be.setRemoved();
					}
					world.setBlock(_bp, _bs, 3);
					if (_bnbt != null) {
						_be = world.getBlockEntity(_bp);
						if (_be != null) {
							try {
								_be.load(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			}
		}
	}
}

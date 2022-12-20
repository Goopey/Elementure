package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class BluebarrierNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Direction direction = Direction.NORTH;
		direction = new Object() {
			public Direction getDirection(BlockPos pos) {
				BlockState _bs = world.getBlockState(pos);
				Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (property != null && _bs.getValue(property) instanceof Direction _dir)
					return _dir;
				property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (property != null && _bs.getValue(property) instanceof Direction.Axis _axis)
					return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
				return Direction.NORTH;
			}
		}.getDirection(new BlockPos(x, y, z));
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ElementureModBlocks.BLUEBARRIERCLOSING.get()) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.BLUEBARRIERCLOSING.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ElementureModBlocks.BLUEBARRIERCLOSING.get()) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.BLUEBARRIERCLOSING.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.BLUEBARRIERCLOSING.get()) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.BLUEBARRIERCLOSING.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.BLUEBARRIERCLOSING.get()) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.BLUEBARRIERCLOSING.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ElementureModBlocks.BLUEBARRIERCLOSING.get()) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.BLUEBARRIERCLOSING.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ElementureModBlocks.BLUEBARRIERCLOSING.get()) {
			world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.BLUEBARRIERCLOSING.get().defaultBlockState(), 3);
		}
		{
			Direction _dir = direction;
			BlockPos _pos = new BlockPos(x, y, z);
			BlockState _bs = world.getBlockState(_pos);
			Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
			if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
				world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
			} else {
				_property = _bs.getBlock().getStateDefinition().getProperty("axis");
				if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
					world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
			}
		}
	}
}

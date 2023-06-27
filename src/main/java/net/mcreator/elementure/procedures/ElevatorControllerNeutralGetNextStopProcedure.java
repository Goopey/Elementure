package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.ArrayList;

public class ElevatorControllerNeutralGetNextStopProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		List<Object> directions = new ArrayList<>();
		double locX = 0;
		double locY = 0;
		double locZ = 0;
		double mult = 0;
		double loopNum = 0;
		Direction returnDirection = Direction.NORTH;
		for (Direction directioniterator : Direction.values()) {
			if (!(new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, new BlockPos(x, y, z), "direction")).equals("" + directioniterator)) {
				directions.add((directioniterator.getOpposite()));
			}
		}
		for (int index0 = 0; index0 < (int) (5); index0++) {
			if (directions.get((int) loopNum) == Direction.EAST) {
				locX = 1;
			} else if (directions.get((int) loopNum) == Direction.WEST) {
				locX = -1;
			} else if (directions.get((int) loopNum) == Direction.UP) {
				locY = 1;
			} else if (directions.get((int) loopNum) == Direction.DOWN) {
				locY = -1;
			} else if (directions.get((int) loopNum) == Direction.NORTH) {
				locZ = -1;
			} else {
				locZ = 1;
			}
			mult = 1;
			while (mult <= 256) {
				if ((world.getBlockState(new BlockPos(x + locX * mult, y + locY * mult, z + locZ * mult))).is(BlockTags.create(new ResourceLocation("elementure:directionnal_elevator_controllers"))) && directions.get((int) loopNum) == ((new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(new BlockPos(x + locX * mult, y + locY * mult, z + locZ * mult))))).getOpposite())
						|| (world.getBlockState(new BlockPos(x + locX * mult, y + locY * mult, z + locZ * mult))).is(BlockTags.create(new ResourceLocation("elementure:neutral_elevator_controllers")))) {
					return (x + locX * mult) + "+" + (y + locY * mult) + "+" + (z + locZ * mult) + directions.get((int) loopNum);
				}
				mult = mult + 1;
			}
			loopNum = loopNum + 1;
		}
		if (!(new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "direction")).isEmpty()) {
			for (Direction directioniterator : Direction.values()) {
				if (!(new Object() {
					public String getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getString(tag);
						return "";
					}
				}.getValue(world, new BlockPos(x, y, z), "direction")).equals("" + directioniterator)) {
					returnDirection = directioniterator.getOpposite();
				}
			}
			return (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "previousX")) + "+" + (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "previousY")) + "+" + (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "previousZ")) + returnDirection;
		}
		return "";
	}
}

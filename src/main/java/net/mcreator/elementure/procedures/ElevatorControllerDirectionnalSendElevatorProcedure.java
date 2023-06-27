package net.mcreator.elementure.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class ElevatorControllerDirectionnalSendElevatorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		String predictedX = "";
		String predictedY = "";
		String predictedZ = "";
		String direction = "";
		String nextPlatform = "";
		double separator1Position = 0;
		double separator2Position = 0;
		double loopNum = 0;
		double locX = 0;
		double locZ = 0;
		double repeatTimes = 0;
		nextPlatform = ElevatorControllerDirectionnalGetNextStopProcedure.execute(world, x, y, z, blockstate);
		for (Direction directioniterator : Direction.values()) {
			if (nextPlatform.endsWith("" + directioniterator)) {
				direction = "" + directioniterator;
				nextPlatform = nextPlatform.replace("" + directioniterator, "");
			}
		}
		for (int index0 = 0; index0 < (int) ((nextPlatform).length()); index0++) {
			if ((nextPlatform.substring((int) loopNum, (int) (loopNum + 1))).equals("+")) {
				separator1Position = loopNum;
				break;
			}
			loopNum = loopNum + 1;
		}
		loopNum = loopNum + 1;
		for (int index1 = 0; index1 < (int) ((nextPlatform).length()); index1++) {
			if ((nextPlatform.substring((int) loopNum, (int) (loopNum + 1))).equals("+")) {
				separator2Position = loopNum;
				break;
			}
			loopNum = loopNum + 1;
		}
		predictedX = nextPlatform.substring((int) 0, (int) (separator1Position - 1));
		predictedY = nextPlatform.substring((int) (separator1Position + 1), (int) (separator2Position - 1));
		predictedZ = nextPlatform.substring((int) (separator2Position + 1), (int) ((nextPlatform).length() - 1));
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("elementure:elevators")))) {
			locX = -8;
			locZ = -8;
			repeatTimes = (Math.abs(locX * 2) + 1) * (Math.abs(locZ * 2) + 1);
			for (int index2 = 0; index2 < (int) (repeatTimes); index2++) {
				if ((world.getBlockState(new BlockPos(x + locX, y + 1, z + locZ))).is(BlockTags.create(new ResourceLocation("elementure:elevators")))) {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + locX, y + 1, z + locZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putString("direction", direction);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + locX, y + 1, z + locZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("nextX", (new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(predictedX) + locX));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + locX, y + 1, z + locZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("nextY", (new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(predictedY) + 1));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + locX, y + 1, z + locZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("nextZ", (new Object() {
								double convert(String s) {
									try {
										return Double.parseDouble(s.trim());
									} catch (Exception e) {
									}
									return 0;
								}
							}.convert(predictedZ) + locZ));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
				locX = locX + 1;
				if (locX > 8) {
					locX = -8;
					locZ = locZ + 1;
					if (locZ > 8) {
						locZ = -8;
					}
				}
			}
		}
	}
}

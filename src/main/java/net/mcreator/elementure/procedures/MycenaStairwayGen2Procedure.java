package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenaStairwayGen2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		double NumFloors = 0;
		boolean isOtherFloor = false;
		CoordsY = (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "height")) - 4;
		while (y + CoordsY > -60 && NumFloors < 2) {
			world.setBlock(new BlockPos(x, y + CoordsY, z), ElementureModBlocks.MYCENAVINE.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y + CoordsY, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y + CoordsY, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + CoordsY, z - 1), Blocks.AIR.defaultBlockState(), 3);
			CoordsY = CoordsY - 1;
			if ((world.getBlockState(new BlockPos(x, (y + CoordsY) - 1, z))).getBlock() == Blocks.AIR) {
				isOtherFloor = false;
			}
			if (isOtherFloor == false
					&& ((world.getBlockState(new BlockPos(x, y + CoordsY, z))).getBlock() == Blocks.STONE
							|| (world.getBlockState(new BlockPos(x, y + CoordsY, z))).getBlock() == Blocks.GRANITE
							|| (world.getBlockState(new BlockPos(x, y + CoordsY, z))).getBlock() == Blocks.DIORITE
							|| (world.getBlockState(new BlockPos(x, y + CoordsY, z))).getBlock() == ElementureModBlocks.ENERGYDIORITE.get()
							|| (world.getBlockState(new BlockPos(x, y + CoordsY, z))).getBlock() == ElementureModBlocks.LIGHTNINGANDESITE.get()
							|| (world.getBlockState(new BlockPos(x, y + CoordsY, z))).getBlock() == Blocks.ANDESITE
							|| (world.getBlockState(new BlockPos(x, y + CoordsY, z))).getBlock() == ElementureModBlocks.RUINGRANITE.get()
							|| (world.getBlockState(new BlockPos(x, y + CoordsY, z))).getBlock() == ElementureModBlocks.MYCENAVINE.get())
					&& ((world.getBlockState(new BlockPos(x, (y + CoordsY) - 1, z))).getBlock() == Blocks.STONE
							|| (world.getBlockState(new BlockPos(x, (y + CoordsY) - 1, z))).getBlock() == Blocks.GRANITE
							|| (world.getBlockState(new BlockPos(x, (y + CoordsY) - 1, z))).getBlock() == Blocks.DIORITE
							|| (world.getBlockState(new BlockPos(x, (y + CoordsY) - 1, z))).getBlock() == ElementureModBlocks.ENERGYDIORITE.get()
							|| (world.getBlockState(new BlockPos(x, (y + CoordsY) - 1, z))).getBlock() == ElementureModBlocks.LIGHTNINGANDESITE.get()
							|| (world.getBlockState(new BlockPos(x, (y + CoordsY) - 1, z))).getBlock() == Blocks.ANDESITE
							|| (world.getBlockState(new BlockPos(x, (y + CoordsY) - 1, z))).getBlock() == ElementureModBlocks.RUINGRANITE.get())) {
				NumFloors = NumFloors + 1;
				isOtherFloor = true;
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenaStairwayGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		double FloorNum = 0;
		while (!((world.getBlockState(new BlockPos(x, y + CoordsY + 1, z))).getBlock() == Blocks.STONE) && !((world.getBlockState(new BlockPos(x, y + CoordsY + 1, z))).getBlock() == Blocks.GRANITE)
				&& !((world.getBlockState(new BlockPos(x, y + CoordsY + 1, z))).getBlock() == Blocks.DIORITE) && !((world.getBlockState(new BlockPos(x, y + CoordsY + 1, z))).getBlock() == ElementureModBlocks.ENERGYDIORITE.get())
				&& !((world.getBlockState(new BlockPos(x, y + CoordsY + 1, z))).getBlock() == ElementureModBlocks.LIGHTNINGANDESITE.get()) && !((world.getBlockState(new BlockPos(x, y + CoordsY + 1, z))).getBlock() == Blocks.ANDESITE)
				&& !((world.getBlockState(new BlockPos(x, y + CoordsY + 1, z))).getBlock() == ElementureModBlocks.RUINGRANITE.get()) && y + CoordsY < 256 && CoordsY < 32) {
			CoordsY = CoordsY + 1;
		}
		world.setBlock(new BlockPos(x, y + CoordsY, z), ElementureModBlocks.MYCENA_BIOME_OMEGAN.get().defaultBlockState(), 3);
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y + CoordsY, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("omeganGenRole", 16);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y + CoordsY, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("height", CoordsY);
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}
}

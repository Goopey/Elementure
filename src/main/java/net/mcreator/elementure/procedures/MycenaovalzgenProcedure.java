package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenaovalzgenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		CoordsX = -28;
		CoordsZ = -28;
		CoordsY = -7;
		for (int index0 = 0; index0 < (int) (48735); index0++) {
			if (CoordsX * CoordsX + 2 * CoordsZ * CoordsZ <= 784) {
				if (((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.GRASS_BLOCK
						&& !((world.getBlockState(new BlockPos(x + CoordsX, (y + CoordsY) - 1, z + CoordsZ))).getBlock() == ElementureModBlocks.BIGGLOWINGMUSHROOM.get())
						|| (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ))).getBlock() == Blocks.OAK_LOG && (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).getBlock() == Blocks.DIRT)
						&& !((world.getBlockState(new BlockPos(x + CoordsX, -64, z + CoordsZ))).getBlock() == ElementureModBlocks.PERVADEDBEDROCK.get())) {
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY + 1, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + CoordsX, y + CoordsY + 2, z + CoordsZ), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(new BlockPos(x + CoordsX, -64, z + CoordsZ), ElementureModBlocks.PERVADEDBEDROCK.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX, -64, z + CoordsZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putBoolean("mycenaUsed", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 28) {
				CoordsX = -28;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 28) {
					CoordsX = -28;
					CoordsZ = -28;
					CoordsY = CoordsY + 1;
					if (CoordsY == 7) {
						CoordsX = -28;
						CoordsZ = -28;
						CoordsY = -7;
					}
				}
			}
		}
	}
}

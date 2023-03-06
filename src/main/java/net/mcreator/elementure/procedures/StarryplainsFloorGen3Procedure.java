package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class StarryplainsFloorGen3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsZ = 0;
		CoordsX = -112;
		CoordsZ = -112;
		for (int index0 = 0; index0 < (int) (50625); index0++) {
			if (!(new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos(x + CoordsX, 0, z + CoordsZ), "netherstarUsed")) && CoordsX * CoordsX + CoordsZ * CoordsZ > 2916 && CoordsX * CoordsX + CoordsZ * CoordsZ <= 12544
					&& !((world.getBlockState(new BlockPos(x + CoordsX, 130, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get())
					&& !((world.getBlockState(new BlockPos(x + CoordsX, 130, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERSTAR_BIOME_OMEGAN.get())
					&& !((world.getBlockState(new BlockPos(x + CoordsX, 130, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERLOG.get())
					&& !((world.getBlockState(new BlockPos(x + CoordsX, 130, z + CoordsZ))).getBlock() == ElementureModBlocks.NETHERUM.get()) && !((world.getBlockState(new BlockPos(x + CoordsX, 130, z + CoordsZ))).getBlock() == Blocks.OBSIDIAN)
					&& !((world.getBlockState(new BlockPos(x + CoordsX, 130, z + CoordsZ))).getBlock() == Blocks.NETHER_PORTAL)) {
				if (Math.random() < 0.002) {
					world.setBlock(new BlockPos(x + CoordsX, 130, z + CoordsZ), ElementureModBlocks.NETHERSTAR_BIOME_ALPHAN.get().defaultBlockState(), 3);
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x + CoordsX, 130, z + CoordsZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("netherstarAGenRole", 14);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					if (Math.random() < 0.01) {
						world.setBlock(new BlockPos(x + CoordsX, 130, z + CoordsZ), ElementureModBlocks.NETHERUMCARPETSHINY.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX, 130, z + CoordsZ), ElementureModBlocks.NETHERUMCARPET.get().defaultBlockState(), 3);
					}
				}
				if (Math.random() < 0.027) {
					if (Math.random() < 0.85) {
						NethersaplingsurfaceGrowProcedure.execute(world, (x + CoordsX), 130, (z + CoordsZ));
					} else {
						ScrapsaplingsurfaceGrowProcedure.execute(world, (x + CoordsX), 130, (z + CoordsZ));
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 112) {
				CoordsX = -112;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 112) {
					CoordsX = -112;
					CoordsZ = -112;
				}
			}
		}
	}
}

package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.init.ElementureModBlocks;

public class FluffparticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean notdecay = false;
		double CoordsZ = 0;
		double CoordsX = 0;
		double CoordsY = 0;
		if (Math.random() < 0.075) {
			for (int index0 = 0; index0 < (int) (4); index0++) {
				world.addParticle((SimpleParticleType) (ElementureModParticleTypes.CLOUDFLUFF.get()), (x + Math.random()), y, (z + Math.random()),
						(0.05 + (Math.random() < 0.5 ? Math.random() / 100 : Math.random() / (-100))), ((-0.05) - Math.random() / 100),
						(0.05 + (Math.random() < 0.5 ? Math.random() / 100 : Math.random() / (-100))));
			}
			if (new Object() {
				public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getBoolean(tag);
					return false;
				}
			}.getValue(world, new BlockPos(x, y, z), "placed")) {
				notdecay = true;
			} else {
				CoordsX = -6;
				CoordsY = -6;
				CoordsZ = -6;
				for (int index1 = 0; index1 < (int) (2197); index1++) {
					if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 36
							&& ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
									.getBlock() == ElementureModBlocks.STRIPPED_FLUFFLOG.get()
									|| (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
											.getBlock() == ElementureModBlocks.STRIPPED_FLUFFLOGFULL.get()
									|| (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
											.getBlock() == ElementureModBlocks.FLUFFLOG.get()
									|| (world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
											.getBlock() == ElementureModBlocks.FLUFFLOGFULL.get())) {
						notdecay = true;
					} else if (Math.random() < 0.001 && (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
						world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
					}
					CoordsX = CoordsX + 1;
					if (CoordsX == 6) {
						CoordsX = -6;
						CoordsZ = CoordsZ + 1;
						if (CoordsZ == 6) {
							CoordsX = -6;
							CoordsY = CoordsY + 1;
							CoordsZ = -6;
							if (CoordsY == 6) {
								CoordsX = -6;
								CoordsY = -6;
								CoordsZ = -6;
							}
						}
					}
				}
			}
			if (!notdecay && Math.random() < 0.2) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (Math.random() < 0.1) {
					FluffDropsProcedure.execute(world, x, y, z);
				}
			}
		}
	}
}

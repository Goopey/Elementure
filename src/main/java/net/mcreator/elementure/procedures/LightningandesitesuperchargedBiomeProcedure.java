package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class LightningandesitesuperchargedBiomeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		double xExtra = 0;
		double zExtra = 0;
		double yExtra = 0;
		CoordsX = -16;
		CoordsY = -16;
		CoordsZ = -16;
		for (int index0 = 0; index0 < (int) (35937); index0++) {
			if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 256) {
				if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
						.is(BlockTags.create(new ResourceLocation("elementure:elementureundergroundbiomestone_replaceable")))) {
					if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 64) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
								ElementureModBlocks.CHISELEDLIGHTNINGANDESITE.get().defaultBlockState(), 3);
					} else if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ < 156
							&& CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ > 64) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
								ElementureModBlocks.LIGHTNINGANDESITE.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
								ElementureModBlocks.POLISHEDLIGHTNINGANDESITE.get().defaultBlockState(), 3);
					}
				} else if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
						.is(BlockTags.create(new ResourceLocation("elementure:elementureundergroundbiomeore_replaceable")))) {
					if (Math.random() < 0.33) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
								ElementureModBlocks.LIGHTNINGANDESITEORE.get().defaultBlockState(), 3);
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 16) {
				CoordsX = -16;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 16) {
					CoordsX = -16;
					CoordsY = CoordsY + 1;
					CoordsZ = -16;
					if (CoordsY == 16) {
						CoordsX = -16;
						CoordsY = -16;
						CoordsZ = -16;
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.CHISELEDLIGHTNINGANDESITE.get().defaultBlockState(), 3);
		LightningandesiteRoomGenProcedure.execute(world, x, (y + Math.round(Math.random() * 8 - 4)), z);
		for (int index1 = 0; index1 < (int) (4); index1++) {
			if (Math.random() < 0.33) {
				xExtra = Math.random() * 10 - 5;
				yExtra = Math.random() * 10 - 5;
				zExtra = Math.random() * 10 - 5;
				if (xExtra < 0) {
					xExtra = xExtra - 10;
				} else {
					xExtra = xExtra + 10;
				}
				if (yExtra < 0) {
					yExtra = yExtra - 10;
				} else {
					yExtra = Math.random() * (-4);
				}
				if (zExtra < 0) {
					zExtra = zExtra - 10;
				} else {
					zExtra = zExtra + 10;
				}
				LightningandesiteBiomeDoubleProcedure.execute(world, (x + Math.round(xExtra)), (y + Math.round(yExtra)), (z + Math.round(zExtra)));
			}
		}
	}
}

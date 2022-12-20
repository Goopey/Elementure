package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class EnergydioriteBiomeDoubleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		double xExtra = 0;
		double zExtra = 0;
		double yExtra = 0;
		CoordsX = -12;
		CoordsY = -12;
		CoordsZ = -12;
		for (int index0 = 0; index0 < (int) (15625); index0++) {
			if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 144) {
				if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
						.is(BlockTags.create(new ResourceLocation("elementure:elementureundergroundbiomestone_replaceable")))) {
					if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ <= 44) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
								ElementureModBlocks.CHISELEDENERGYDIORITE.get().defaultBlockState(), 3);
					} else if (CoordsX * CoordsX + CoordsY * CoordsY + CoordsZ * CoordsZ >= 112) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
								ElementureModBlocks.POLISHEDENERGYDIORITE.get().defaultBlockState(), 3);
					} else {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ),
								ElementureModBlocks.ENERGYDIORITE.get().defaultBlockState(), 3);
					}
				} else if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ)))
						.is(BlockTags.create(new ResourceLocation("elementure:elementureundergroundbiomeore_replaceable")))) {
					if (Math.random() < 0.33) {
						world.setBlock(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ), ElementureModBlocks.NEONBLOCK.get().defaultBlockState(),
								3);
					}
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 12) {
				CoordsX = -12;
				CoordsZ = CoordsZ + 1;
				if (CoordsZ == 12) {
					CoordsX = -12;
					CoordsY = CoordsY + 1;
					CoordsZ = -12;
					if (CoordsY == 12) {
						CoordsX = -12;
						CoordsY = -12;
						CoordsZ = -12;
					}
				}
			}
		}
		world.setBlock(new BlockPos(x, y, z), ElementureModBlocks.CHISELEDENERGYDIORITE.get().defaultBlockState(), 3);
		EnergydioriteDoubleRoomGenProcedure.execute(world, x, (y + Math.round(Math.random() * 12 - 6)), z);
	}
}

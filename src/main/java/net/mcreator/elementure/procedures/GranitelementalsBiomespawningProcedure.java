package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.Difficulty;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GranitelementalsBiomespawningProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double CoordsX = 0;
		double CoordsY = 0;
		double CoordsZ = 0;
		boolean RuinGraniteNear = false;
		CoordsX = -1;
		CoordsY = -1;
		CoordsZ = -1;
		for (int index0 = 0; index0 < (int) (27); index0++) {
			if (!(world.getDifficulty() == Difficulty.PEACEFUL)) {
				if ((world.getBlockState(new BlockPos(x + CoordsX, y + CoordsY, z + CoordsZ))).is(BlockTags.create(new ResourceLocation("elementure:ruingranitebiomeblocks"))) && !RuinGraniteNear) {
					RuinGraniteNear = true;
				}
			}
			CoordsX = CoordsX + 1;
			if (CoordsX == 1) {
				CoordsX = -1;
				CoordsY = CoordsY + 1;
				if (CoordsY == 1) {
					CoordsX = -1;
					CoordsY = -1;
					CoordsZ = CoordsZ + 1;
					if (CoordsZ == 1) {
						CoordsX = -1;
						CoordsY = -1;
						CoordsZ = -1;
					}
				}
			}
		}
		return RuinGraniteNear;
	}
}

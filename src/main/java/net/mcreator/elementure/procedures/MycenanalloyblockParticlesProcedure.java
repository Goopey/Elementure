package net.mcreator.elementure.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class MycenanalloyblockParticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) > 0) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CLOUD, (x + 0.5), (y + 0.5), (z + 0.5),
						(int) Math.floor(
								(world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) / 2 + 1),
						0.5, 0.5, 0.5, 0);
			for (int index0 = 0; index0 < (int) (Math
					.floor(((world instanceof Level _lvl_getIndPow ? _lvl_getIndPow.getBestNeighborSignal(new BlockPos(x, y, z)) : 0) + 1) / 5
							+ 1)); index0++) {
				MycenashroomcloudProcedure.execute(world, (x + 0.5), (y - 0.25), (z + 0.5));
			}
		}
	}
}

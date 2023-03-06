package net.mcreator.elementure.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;

public class DungeonwaterEffectsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState blockUnder = Blocks.AIR.defaultBlockState();
		if (Math.random() < 0.3) {
			blockUnder = (world.getBlockState(new BlockPos(x, y - 1, z)));
			if (blockUnder.getBlock() == Blocks.LIME_TERRACOTTA) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.MYCENAHOTSPRIINGBUBBLE.get()), (x + 0.5), (y + 0.25), (z + 0.5), (int) (1 + Math.round(Math.random() * 2)), 0.02, 0.02, 0.02, 0.005);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMOKE, (x + 0.5), (y + 0.25), (z + 0.5), (int) (1 + Math.round(Math.random())), 0.02, 0.02, 0.02, 0.005);
			}
		}
	}
}

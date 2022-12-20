package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class BlackstonegrimaceEffectProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.0025) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WHITE_ASH, (entity.getX()), (entity.getY()), (entity.getZ()), 12, 0.5, 0.5, 0.5, 0.01);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.break")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.ancient_debris.break")), SoundSource.HOSTILE, 1, 1,
							false);
				}
			}
			entity.setDeltaMovement(new Vec3(0, 0.75, 0));
		}
	}
}

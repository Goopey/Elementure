package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class RagdollSummonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0) {
			if (entity.getPersistentData().getDouble("sandnadotimer") < 0) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal.spawn")), SoundSource.NEUTRAL, 2, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal.spawn")),
								SoundSource.NEUTRAL, 2, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z),
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:negative_dungeon_step_sound")),
								SoundSource.NEUTRAL, 3, 1);
					} else {
						_level.playLocalSound(x, y, z,
								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("elementure:negative_dungeon_step_sound")),
								SoundSource.NEUTRAL, 3, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.EXPLOSION, x, y, z, 20, 3, 3, 3, 1);
			} else {
				entity.getPersistentData().putDouble("sandnadotimer", (entity.getPersistentData().getDouble("sandnadotimer") - 1));
			}
		}
	}
}

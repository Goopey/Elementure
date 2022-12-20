package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BlackstonegrimaceFallRocksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < (int) (Math.ceil(Math.random() * 3)); index0++) {
			if (Math.random() < 0.5) {
				if (world instanceof ServerLevel _level)
					FallingBlockEntity.fall(_level, new BlockPos(x + Math.round(Math.random() * 4 - 2), y + 4, z + Math.round(Math.random() * 4 - 2)),
							Blocks.BLACKSTONE.defaultBlockState());
			} else {
				if (world instanceof ServerLevel _level)
					FallingBlockEntity.fall(_level, new BlockPos(x + Math.round(Math.random() * 4 - 2), y + 4, z + Math.round(Math.random() * 4 - 2)),
							Blocks.BASALT.defaultBlockState());
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(entity.getX(), entity.getY(), entity.getZ()),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.break")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()),
						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.basalt.break")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}

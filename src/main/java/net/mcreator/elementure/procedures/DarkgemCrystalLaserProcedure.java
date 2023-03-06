package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class DarkgemCrystalLaserProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean particles = false;
		if (Math.random() < 0.03111111111) {
			particles = false;
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER && (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.DARKGEM_CRYSTAL.get()) {
				world.setBlock(new BlockPos(x, y + 1, z), ElementureModBlocks.DARKGEM_CRYSTAL_BEAM.get().defaultBlockState(), 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y + 1, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("darkgemLaserDir", "up");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				particles = true;
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WATER && (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.DARKGEM_CRYSTAL.get()) {
				world.setBlock(new BlockPos(x, y - 1, z), ElementureModBlocks.DARKGEM_CRYSTAL_BEAM.get().defaultBlockState(), 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y - 1, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("darkgemLaserDir", "down");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				particles = true;
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.WATER && (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ElementureModBlocks.DARKGEM_CRYSTAL.get()) {
				world.setBlock(new BlockPos(x + 1, y, z), ElementureModBlocks.DARKGEM_CRYSTAL_BEAM.get().defaultBlockState(), 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x + 1, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("darkgemLaserDir", "east");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				particles = true;
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.WATER && (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ElementureModBlocks.DARKGEM_CRYSTAL.get()) {
				world.setBlock(new BlockPos(x - 1, y, z), ElementureModBlocks.DARKGEM_CRYSTAL_BEAM.get().defaultBlockState(), 3);
				particles = true;
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.WATER && (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ElementureModBlocks.DARKGEM_CRYSTAL.get()) {
				world.setBlock(new BlockPos(x, y, z + 1), ElementureModBlocks.DARKGEM_CRYSTAL_BEAM.get().defaultBlockState(), 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z + 1);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("darkgemLaserDir", "south");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				particles = true;
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.WATER && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ElementureModBlocks.DARKGEM_CRYSTAL.get()) {
				world.setBlock(new BlockPos(x, y, z - 1), ElementureModBlocks.DARKGEM_CRYSTAL_BEAM.get().defaultBlockState(), 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z - 1);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putString("darkgemLaserDir", "north");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				particles = true;
			}
			if (particles) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, (x + 0.5), (y + 0.5), (z + 0.5), 50, 1.6, 1.6, 1.6, 0);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.chime")), SoundSource.BLOCKS, 3, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.chime")), SoundSource.BLOCKS, 3, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, (float) 1.5, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, (float) 1.5, 1, false);
					}
				}
			}
		}
	}
}

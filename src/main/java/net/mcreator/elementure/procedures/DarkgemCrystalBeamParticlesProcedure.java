package net.mcreator.elementure.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModParticleTypes;
import net.mcreator.elementure.init.ElementureModBlocks;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class DarkgemCrystalBeamParticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SHADOWPARTICLE_2.get()), (x + 0.5), (y + 0.5), (z + 0.5), 5, 0.35, 0.35, 0.35, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (ElementureModParticleTypes.SHADOWPARTICLE_1.get()), (x + 0.5), (y + 0.5), (z + 0.5), 2, 0.35, 0.35, 0.35, 0);
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "darkgemLaserDir")).equals("up")) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ElementureModBlocks.DARKGEM_CRYSTAL.get()) {
				world.setBlock(new BlockPos(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER) {
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
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, (x + 0.5), (y + 0.5), (z + 0.5), 50, 1.6, 1.6, 1.6, 0.005);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, 2, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, 2, 1, false);
					}
				}
			}
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "darkgemLaserDir")).equals("down")) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ElementureModBlocks.DARKGEM_CRYSTAL.get()) {
				world.setBlock(new BlockPos(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WATER) {
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
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, (x + 0.5), (y + 0.5), (z + 0.5), 50, 1.6, 1.6, 1.6, 0.005);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, 2, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, 2, 1, false);
					}
				}
			}
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "darkgemLaserDir")).equals("north")) {
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ElementureModBlocks.DARKGEM_CRYSTAL.get()) {
				world.setBlock(new BlockPos(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.WATER) {
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
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, (x + 0.5), (y + 0.5), (z + 0.5), 50, 1.6, 1.6, 1.6, 0.005);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, 2, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, 2, 1, false);
					}
				}
			}
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "darkgemLaserDir")).equals("south")) {
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ElementureModBlocks.DARKGEM_CRYSTAL.get()) {
				world.setBlock(new BlockPos(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.WATER) {
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
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, (x + 0.5), (y + 0.5), (z + 0.5), 50, 1.6, 1.6, 1.6, 0.005);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, 2, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, 2, 1, false);
					}
				}
			}
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "darkgemLaserDir")).equals("east")) {
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ElementureModBlocks.DARKGEM_CRYSTAL.get()) {
				world.setBlock(new BlockPos(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.WATER) {
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
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, (x + 0.5), (y + 0.5), (z + 0.5), 50, 1.6, 1.6, 1.6, 0.005);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, 2, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, 2, 1, false);
					}
				}
			}
		} else {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ElementureModBlocks.DARKGEM_CRYSTAL.get()) {
				world.setBlock(new BlockPos(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.WATER) {
				world.setBlock(new BlockPos(x - 1, y, z), ElementureModBlocks.DARKGEM_CRYSTAL_BEAM.get().defaultBlockState(), 3);
			} else {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.END_ROD, (x + 0.5), (y + 0.5), (z + 0.5), 50, 1.6, 1.6, 1.6, 0.005);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, 2, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.place")), SoundSource.BLOCKS, 2, 1, false);
					}
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:protectedentities")))
						&& !entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:familiarentities")))) {
					entityiterator.hurt(DamageSource.WITHER, 1);
				}
			}
		}
	}
}

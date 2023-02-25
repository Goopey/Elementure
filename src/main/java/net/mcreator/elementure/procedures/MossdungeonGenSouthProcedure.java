package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MossdungeonGenSouthProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean isSide = false;
		double weight = 0;
		double rnd = 0;
		weight = new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos(x, y, z), "weight");
		isSide = new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos(x, y, z), "isSide");
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		rnd = Math.random();
		if (rnd < 0.2) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mossdungeon_room_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (rnd < 0.44) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mossdungeon_spawner_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (rnd < 0.64) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mossdungeon_vegetation_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (rnd < 0.88) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mossdungeon_spawner_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mossdungeon_room_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		MossdungeonInfectedSpawnsProcedure.execute(world, x, y, z);
		if (Math.random() < 0.1 * weight) {
			world.setBlock(new BlockPos(x, y, z + 8), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z + 8);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("alphanGenRole", 19);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z + 8);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("weight", (weight - 1));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos(x, y, z + 8);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("isSide", isSide);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (!isSide) {
			if (Math.random() < 0.1 * weight) {
				world.setBlock(new BlockPos(x + 8, y, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x + 8, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("alphanGenRole", 20);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x + 8, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("weight", (weight - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x + 8, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("isSide", (true));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			if (Math.random() < 0.1 * weight) {
				world.setBlock(new BlockPos(x - 8, y, z), ElementureModBlocks.MYCENA_BIOME_ALPHAN.get().defaultBlockState(), 3);
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 8, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("alphanGenRole", 21);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 8, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("weight", (weight - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x - 8, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putBoolean("isSide", (true));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
		if (Math.random() < 0.1 * weight) {
			world.setBlock(new BlockPos(x - 4, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 4, y + 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 4, y + 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 4, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 4, y + 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 4, y + 2, z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if (Math.random() < 0.1 * weight) {
			world.setBlock(new BlockPos(x + 4, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 4, y + 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 4, y + 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 4, y + 2, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 4, y + 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 4, y + 2, z - 1), Blocks.AIR.defaultBlockState(), 3);
		}
		if (Math.random() < 0.1 * weight) {
			world.setBlock(new BlockPos(x, y + 1, z + 4), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y + 1, z + 4), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y + 1, z + 4), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 2, z + 4), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y + 2, z + 4), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y + 2, z + 4), Blocks.AIR.defaultBlockState(), 3);
		}
		world.setBlock(new BlockPos(x, y + 1, z - 4), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 1, z - 4), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + 1, z - 4), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 2, z - 4), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x + 1, y + 2, z - 4), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(new BlockPos(x - 1, y + 2, z - 4), Blocks.AIR.defaultBlockState(), 3);
	}
}

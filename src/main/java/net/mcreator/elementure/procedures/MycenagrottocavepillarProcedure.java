package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class MycenagrottocavepillarProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double CoordsY = 0;
		if (Math.random() < 0.2) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_full_stalag_0"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y - 1, z - 1), new BlockPos(x - 1, y - 1, z - 1),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (Math.random() > 0.2 && Math.random() < 0.4) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_full_stalag_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y - 1, z - 1), new BlockPos(x - 1, y - 1, z - 1),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (Math.random() > 0.4 && Math.random() < 0.6) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_full_stalag_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y - 1, z - 1), new BlockPos(x - 1, y - 1, z - 1),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (Math.random() > 0.6 && Math.random() < 0.8) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_full_stalag_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y - 1, z - 1), new BlockPos(x - 1, y - 1, z - 1),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_full_stalag_4"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y - 1, z - 1), new BlockPos(x - 1, y - 1, z - 1),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x + 2, y, z), Blocks.DIRT.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y - 1, z), Blocks.DIRT.defaultBlockState(), 3);
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x - 2, y, z), Blocks.DIRT.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y - 1, z), Blocks.DIRT.defaultBlockState(), 3);
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x, y, z - 2), Blocks.DIRT.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z - 2), Blocks.DIRT.defaultBlockState(), 3);
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x, y, z + 2), Blocks.DIRT.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z + 2), Blocks.DIRT.defaultBlockState(), 3);
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x + 2, y + 9, z), Blocks.DIRT.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y + 10, z), Blocks.DIRT.defaultBlockState(), 3);
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x - 2, y + 9, z), Blocks.DIRT.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y + 10, z), Blocks.DIRT.defaultBlockState(), 3);
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x, y + 9, z - 2), Blocks.DIRT.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 10, z - 2), Blocks.DIRT.defaultBlockState(), 3);
		}
		if (Math.random() < 0.75) {
			world.setBlock(new BlockPos(x, y + 9, z + 2), Blocks.DIRT.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 10, z + 2), Blocks.DIRT.defaultBlockState(), 3);
		}
	}
}

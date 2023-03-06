package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.init.ElementureModBlocks;

public class MycenaroofmushroomsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.14) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "roof_mycenamushroom_0"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 4, z - 2), new BlockPos(x - 2, y - 4, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			world.setBlock(new BlockPos(x, y - 4, z), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		} else if (Math.random() < 0.28 && Math.random() > 0.14) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "roof_mycenamushroom_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 3, z - 2), new BlockPos(x - 2, y - 3, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			world.setBlock(new BlockPos(x, y - 3, z), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		} else if (Math.random() < 0.42 && Math.random() > 0.28) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "roof_mycenamushroom_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 2, z - 2), new BlockPos(x - 2, y - 2, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			world.setBlock(new BlockPos(x, y - 2, z), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		} else if (Math.random() < 0.56 && Math.random() > 0.42) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "roof_mycenamushroom_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y - 2, z - 1), new BlockPos(x - 1, y - 2, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			world.setBlock(new BlockPos(x, y - 2, z), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		} else if (Math.random() < 0.7 && Math.random() > 0.56) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "roof_mycenamushroom_4"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y - 1, z - 1), new BlockPos(x - 1, y - 1, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			world.setBlock(new BlockPos(x, y - 1, z), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		} else if (Math.random() < 0.84 && Math.random() > 0.7) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "roof_mycenamushroom_5"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y - 1, z - 1), new BlockPos(x - 1, y - 1, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			world.setBlock(new BlockPos(x, y - 1, z), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "roof_mycenamushroom_6"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y - 2, z - 1), new BlockPos(x - 1, y - 2, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			world.setBlock(new BlockPos(x, y - 2, z), ElementureModBlocks.BIGGLOWINGMUSHROOM.get().defaultBlockState(), 3);
		}
	}
}

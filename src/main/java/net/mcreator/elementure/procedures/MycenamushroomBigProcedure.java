package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class MycenamushroomBigProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.12) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycenamushroom_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y, z - 2), new BlockPos(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.24 && Math.random() > 0.12) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycenamushroom_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y, z - 2), new BlockPos(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.36 && Math.random() > 0.24) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycenamushroom_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y, z - 2), new BlockPos(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.48 && Math.random() > 0.36) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycenamushroom_4"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y, z - 1), new BlockPos(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.6 && Math.random() > 0.48) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycenamushroom_5"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y, z - 1), new BlockPos(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.72 && Math.random() > 0.6) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycenamushroom_6"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y, z - 1), new BlockPos(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.84 && Math.random() > 0.72) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycenamushroom_7"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y, z - 1), new BlockPos(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.96 && Math.random() > 0.84) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycenamushroom_8"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, y, z - 1), new BlockPos(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycena_big_mushroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
	}
}

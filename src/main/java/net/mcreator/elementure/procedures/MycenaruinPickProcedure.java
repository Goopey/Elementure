package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class MycenaruinPickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.25) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycena_ruin_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y, z - 2), new BlockPos(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.33) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycena_ruin_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y, z - 3), new BlockPos(x - 2, y, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycena_ruin_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "mycena_ruin_4"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y, z - 2), new BlockPos(x - 2, y, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
	}
}

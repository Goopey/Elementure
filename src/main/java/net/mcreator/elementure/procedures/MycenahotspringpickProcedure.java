package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class MycenahotspringpickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.45) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_hot_spring_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 2, z - 2), new BlockPos(x - 2, y - 2, z - 2),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (Math.random() < 0.5) {
			if (Math.random() < 0.5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("elementure", "mycena_hot_spring_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 3, y - 2, z - 4), new BlockPos(x - 3, y - 2, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("elementure", "mycena_hot_spring_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 4, y - 2, z - 3), new BlockPos(x - 4, y - 2, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "mycena_hot_spring_4"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y - 3, z - 4), new BlockPos(x - 4, y - 3, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		if (Math.random() < 0.5) {
			MycenahotspringDecoProcedure.execute(world, x, y, z);
		}
	}
}

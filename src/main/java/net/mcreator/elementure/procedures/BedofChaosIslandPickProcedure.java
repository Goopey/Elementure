package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BedofChaosIslandPickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "bedofchaosisland"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (Math.random() < 0.25) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("elementure", "bedofchaosislandtarred"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() < 0.33) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("elementure", "bedofchaosislandtarred"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x + 3, y, z - 3), new BlockPos(x + 3, y, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() < 0.5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("elementure", "bedofchaosislandtarred"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x + 3, y, z + 3), new BlockPos(x + 3, y, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("elementure", "bedofchaosislandtarred"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, new BlockPos(x - 3, y, z + 3), new BlockPos(x - 3, y, z + 3), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
	}
}

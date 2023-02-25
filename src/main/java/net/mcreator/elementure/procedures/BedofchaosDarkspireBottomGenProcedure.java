package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.elementure.ElementureMod;

public class BedofchaosDarkspireBottomGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ElementureMod.queueServerWork(20, () -> {
			if (Math.random() < 0.9) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("elementure", "boc_darkspire_small_bottom"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 1, z - 2), new BlockPos(x - 2, y - 1, z - 2),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() < 0.9) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("elementure", "boc_darkspire_medium_bottom"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 1, z - 2), new BlockPos(x - 2, y - 1, z - 2),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(new ResourceLocation("elementure", "boc_darkspire_large_bottom"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 1, z - 2), new BlockPos(x - 2, y - 1, z - 2),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		});
	}
}

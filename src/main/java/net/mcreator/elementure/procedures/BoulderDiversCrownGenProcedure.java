package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BoulderDiversCrownGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "diversstoneboulder"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(x - 2, y - 1, z - 2), new BlockPos(x - 2, y - 1, z - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
						3);
			}
		}
		for (int index0 = 0; index0 < (int) (3); index0++) {
			if (Math.random() < 0.4) {
				locX = x + Math.random() * 6 - 3;
				locZ = z + Math.random() * 6 - 3;
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "diversstoneboulder"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(locX - 2, y - 1, locZ - 2), new BlockPos(locX - 2, y - 1, locZ - 2), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
	}
}

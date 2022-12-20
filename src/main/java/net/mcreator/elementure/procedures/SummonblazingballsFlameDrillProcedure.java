package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SummonblazingballsFlameDrillProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locX = 0;
		double locZ = 0;
		double locY = 0;
		if (Math.random() < 0.33) {
			if (Math.random() < 0.5) {
				locX = Math.random() * 6 + 8;
			} else {
				locX = Math.random() * (-6) - 8;
			}
			locY = Math.random() * 12 - 6;
			locZ = Math.random() * 12 - 6;
		} else if (Math.random() < 0.5) {
			if (Math.random() < 0.5) {
				locY = Math.random() * 6 + 8;
			} else {
				locY = Math.random() * (-6) - 8;
			}
			locX = Math.random() * 12 - 6;
			locZ = Math.random() * 12 - 6;
		} else {
			if (Math.random() < 0.5) {
				locZ = Math.random() * 6 + 8;
			} else {
				locZ = Math.random() * (-6) - 8;
			}
			locX = Math.random() * 12 - 6;
			locY = Math.random() * 12 - 6;
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "bigblazingstar"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 2 + locX, y - 2 + locY, z - 2 + locZ),
							new BlockPos(x - 2 + locX, y - 2 + locY, z - 2 + locZ),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "blazingstar"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1 + locX, y - 1 + locY, z - 1 + locZ),
							new BlockPos(x - 1 + locX, y - 1 + locY, z - 1 + locZ),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
	}
}

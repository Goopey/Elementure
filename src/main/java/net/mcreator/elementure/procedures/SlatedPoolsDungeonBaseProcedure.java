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

public class SlatedPoolsDungeonBaseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double locY = 0;
		ElementureMod.queueServerWork(12, () -> {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_toproom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 5, y, z - 3), new BlockPos(x - 5, y, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		});
		locY = 0;
		while ((y - 2) - locY * 3 > 24) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_tunnel"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 1, (y - 2) - locY * 3, z - 1), new BlockPos(x - 1, (y - 2) - locY * 3, z - 1),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			locY = locY + 1;
		}
		SlatedpoolsFloorGenProcedure.execute(world, x, ((y - 2) - locY * 3), z);
	}
}

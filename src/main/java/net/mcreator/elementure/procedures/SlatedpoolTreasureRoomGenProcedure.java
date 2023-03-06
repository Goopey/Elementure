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

public class SlatedpoolTreasureRoomGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ElementureMod.queueServerWork(0, () -> {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_airsmall"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "slatedpools_treasureroom"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		});
	}
}

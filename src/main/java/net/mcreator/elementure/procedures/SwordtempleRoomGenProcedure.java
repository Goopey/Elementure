package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SwordtempleRoomGenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rng = 0;
		rng = Math.random();
		if (rng < 0.06) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "swordtemple_room_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (rng < 0.12) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("elementure", "swordtemple_room_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (rng < 0.28) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_spawner_fallenwarrior"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (rng < 0.52) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_spawner_fallenwarrior_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (rng < 0.76) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_spawner_fallenwarrior_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (rng < 0.95) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_spawner_guard_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_spawner_guard_troll"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		WaterclearEasyExecuteProcedure.execute(world, x, y, z);
	}
}

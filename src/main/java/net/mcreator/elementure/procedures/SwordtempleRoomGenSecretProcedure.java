package net.mcreator.elementure.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SwordtempleRoomGenSecretProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rnd = 0;
		BlockState setBlock = Blocks.AIR.defaultBlockState();
		rnd = Math.random();
		if (rnd < 0.0625) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_secretroom_1"));
				if (template != null) {
					template.placeInWorld(
							_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
							_serverworld.random, 3);
				}
			}
		} else if (rnd < 0.125) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_secretroom_2"));
				if (template != null) {
					template.placeInWorld(
							_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
							_serverworld.random, 3);
				}
			}
		} else if (rnd < 0.1875) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_secretroom_3"));
				if (template != null) {
					template.placeInWorld(
							_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
							_serverworld.random, 3);
				}
			}
		} else if (rnd < 0.3875) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_spawner_veteranwarrior_1"));
				if (template != null) {
					template.placeInWorld(
							_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
							_serverworld.random, 3);
				}
			}
		} else if (rnd < 0.6) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_spawner_veteranwarrior_2"));
				if (template != null) {
					template.placeInWorld(
							_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
							_serverworld.random, 3);
				}
			}
		} else if (rnd < 0.75) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_spawner_veteranwarrior_3"));
				if (template != null) {
					template.placeInWorld(
							_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
							_serverworld.random, 3);
				}
			}
		} else if (rnd < 0.875) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_spawner_veteranwarrior_4"));
				if (template != null) {
					template.placeInWorld(
							_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
							_serverworld.random, 3);
				}
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(new ResourceLocation("elementure", "swordtemple_spawner_veteranwarrior_5"));
				if (template != null) {
					template.placeInWorld(
							_serverworld, new BlockPos(x - 4, y, z - 4), new BlockPos(x - 4, y, z - 4), new StructurePlaceSettings()
									.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false).setKeepLiquids(false),
							_serverworld.random, 3);
				}
			}
		}
	}
}
